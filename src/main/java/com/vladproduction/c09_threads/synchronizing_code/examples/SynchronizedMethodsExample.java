package com.vladproduction.c09_threads.synchronizing_code.examples;


/**
 * Threads calling non-static synchronized methods in the same class will
 * only block each other if they're invoked using the same instance. That's because they each lock on 'this' instance,
 * and if they're called using two different instances, they get two locks, which do not interfere with each other.
 * */
public class SynchronizedMethodsExample {
    public static void main(String[] args) throws InterruptedException{
        //create instances of the class
        SynchronizedMethodsExample instance1 = new SynchronizedMethodsExample();
        SynchronizedMethodsExample instance2 = new SynchronizedMethodsExample();

        //create threads that uses by instances:
        Thread thread1 = new Thread(instance1::synchronizedMethod, "Thread#1"); //method refer on the instance of class, used by thread
        Thread thread2 = new Thread(instance1::synchronizedMethod, "Thread#2");
        //create thread that uses the second instance
        Thread thread3 = new Thread(instance2::synchronizedMethod, "Thread#3");

        // Start all threads
        thread1.start();
        thread2.start();
        thread3.start();

        // Wait for all threads to finish
        thread1.join();
        thread2.join();
        thread3.join();

        /*Thread 1 and Thread 2 both call synchronizedMethod on instance1, so they will block each other.
          If one is executing the method, the other will have to wait.
          Thread 3 calls synchronizedMethod on instance2, and since it is a different instance, it does not block Thread 1 or Thread 2.*/

    }

    //non-static synchronized method
    public synchronized void synchronizedMethod(){
        System.out.println(Thread.currentThread().getName() + " is in synchronised method");
        // Simulating some work with sleep
        try {
            Thread.sleep(2000);  // Sleep for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " is leaving synchronised method");
    }


}
