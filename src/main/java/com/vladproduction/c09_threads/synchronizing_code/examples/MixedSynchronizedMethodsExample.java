package com.vladproduction.c09_threads.synchronizing_code.examples;


/**
 * A static synchronized method and a non-static synchronized method
 * will not block each other, ever. The static method locks on a Class
 * instance while the non-static method locks on the 'this' instance—these
 * actions do not interfere with each other at all.
 * */
public class MixedSynchronizedMethodsExample {
    public static void main(String[] args) throws InterruptedException{

        MixedSynchronizedMethodsExample instance = new MixedSynchronizedMethodsExample();

        // Create threads for the non-static synchronized method
        Thread thread1 = new Thread(instance::nonStaticSynchronizedMethod, "Non-Static Thread 1");

        Thread thread2 = new Thread(instance::nonStaticSynchronizedMethod, "Non-Static Thread 2");

        // Create threads for the static synchronized method
        Thread thread3 = new Thread(MixedSynchronizedMethodsExample::staticSynchronizedMethod, "Static Thread 1");

        Thread thread4 = new Thread(MixedSynchronizedMethodsExample::staticSynchronizedMethod, "Static Thread 2");

        // Start all threads
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        // Wait for all threads to finish
        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();

        //Execution:

        /*When the threads are started, the static synchronized method (thread3 and thread4) will run independently
        of the non-static synchronized method (thread1 and thread2).
        The two non-static methods will block each other (they lock on the same instance),
        while the static methods can run at the same time as the non-static methods without blocking each other.*/

    }

    // Static synchronized method
    public static synchronized void staticSynchronizedMethod() {
        System.out.println(Thread.currentThread().getName() + " is in the static synchronized method.");
        // Simulating some work with sleep
        try {
            Thread.sleep(2000);  // Sleep for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " is leaving the static synchronized method.");
    }

    // Non-static synchronized method
    public synchronized void nonStaticSynchronizedMethod() {
        System.out.println(Thread.currentThread().getName() + " is in the non-static synchronized method.");
        // Simulating some work with sleep
        try {
            Thread.sleep(2000);  // Sleep for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " is leaving the non-static synchronized method.");
    }

}
