package com.vladproduction.c09_threads.thrad_interaction.notifyAll_when_threads_waiting;


/**
 * The program starts three threads that are all waiting to receive the finished
 * calculation (lines 13-18; main() method), and then starts the calculator with its calculation. Note
 * that if the run() method (from Calculator) used notify() instead of notifyAll(), only
 * one reader would be notified instead of all the readers.
 */
public class Reader extends Thread {
    Calculator c;

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        new Reader(calculator).start();
        new Reader(calculator).start();
        new Reader(calculator).start();
        calculator.start();

        //was output:
        /*Waiting for calculation...
        Waiting for calculation...
        Waiting for calculation...*/

        //after modification:
        /*This should ensure that all reader threads are properly notified when the calculation is complete,
          regardless of how many thread instances are created and started.*/
        //output:
        /*Thread-1 is waiting for calculation...
        Thread-3 is waiting for calculation...
        Thread-2 is waiting for calculation...
        Thread-1 received notification. Total is: 4950
        Thread-2 received notification. Total is: 4950
        Thread-3 received notification. Total is: 4950*/
        //we could admit for received result correctly

        //in case we using just notify() instead notifyAll():
        /*only one waiting Reader thread would wake up while the others would still wait.
          The output would show that one thread received the notification and printed the correct total,
          while the others would continue to wait indefinitely.
          This can lead to situations where the user thinks that everything is complete,
          but not all threads executed as expected*/
        //so, the output for notify():

    }

    public Reader(Calculator calculator) {
        c = calculator;
    }

    @Override
    public void run() {
        synchronized (c) {
            try {
                //was:
                /*System.out.println("Waiting for calculation...");
                c.wait();*/
                //modified:
                System.out.println(Thread.currentThread().getName() + " is waiting for calculation...");
                c.wait();  // Wait for notify
                // Once notified, we should check for calculated total.
                /*The code now outputs the total only after the wait() has completed successfully,
                  ensuring that the calculation is done before accessing total.*/
                System.out.println(Thread.currentThread().getName() + " received notification. Total is: " + c.total);
            } catch (InterruptedException e) {
                //was:
                /*System.out.println("Total is: " + c.total);*/
                //modified:
                /*Interruption Handling: If the thread is interrupted while waiting,
                  it sets the interrupt status back and prints a message to indicate that it was interrupted.*/
                Thread.currentThread().interrupt(); // Restore interrupted status
                System.out.println(Thread.currentThread().getName() + " was interrupted.");
            }
        }
    }
}

class Calculator extends Thread {
    int total;

    @Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 100; i++) {
                total += i;
            }
            try {
                Thread.sleep(3000); //added just for pause to be able to get the difference
                notifyAll();//The notifyAll() method is correctly invoked after the total is calculated.
//            notify(); //not correct for the example (other threads(started independently) will wait releasing lock)
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); //have to handle exception by this way,
                //because: The interrupted status of the current thread is cleared when this exception is thrown.
                //notifying others locks will be processed.
            }
        }
    }
}

//explanation of interrupt() method (in context of run() from Calculator):
/*
1)Handling InterruptedException:
When a thread is waiting (in this case, during wait() or sleep()), and it gets interrupted, it will throw an InterruptedException.
This is a signal that the thread was asked to stop what it was doing.
2)Clearing the Interrupted Status:
When the InterruptedException is thrown, Java clears the interrupt status of the thread. This is critical because
if your thread later checks whether it has been interrupted (e.g., by using Thread.interrupted() or isInterrupted()),
it will return false instead of true after the exception has been thrown unless you reset it manually (by call interrupt()).
This is why you're calling Thread.currentThread().interrupt(); in the catch block—to restore the interrupted status so that the thread can remain
aware of its interrupted state after handling the exception.
*/
//Conclusion:
/*Handle the InterruptedException by restoring the interrupted status
because it is cleared when this exception is thrown.
It ensures that if other parts of the code check the interrupt status,
they get the correct information, allowing for appropriate handling of thread interruptions.*/

