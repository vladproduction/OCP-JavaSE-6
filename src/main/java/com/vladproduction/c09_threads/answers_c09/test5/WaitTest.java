package com.vladproduction.c09_threads.answers_c09.test5;

public class WaitTest {
    public static void main(String[] args) {
        System.out.print("1 ");
        synchronized (args){ //obtains the lock on the args object (the array passed to the main method)
            System.out.print("2 ");//After acquiring the lock, it prints 2.
            try{
                args.wait();//The thread then calls args.wait(),
                // which causes it to wait until another thread notifies this object (in this case, the args array).
                //The main thread will release the lock on args while waiting.
            }catch (InterruptedException e){}
        }
        System.out.println("3 ");
        /*Since there are no other threads in this example notifying the args object, the main
        thread will remain in a waiting state indefinitely. As a result,
        it will not execute the System.out.println("3 "); statement.
        The program will appear to hang or be stuck at this point.*/
    }
    // The main thread will wait on the args object after printing 1 and 2.
    // Since no other thread is calling notify() on the args object,
    // the main thread will remain in the waiting state indefinitely,
    // not executing the println("3"); statement.
}
