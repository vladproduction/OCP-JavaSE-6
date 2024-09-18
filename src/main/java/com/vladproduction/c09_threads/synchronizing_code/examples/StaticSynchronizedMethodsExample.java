package com.vladproduction.c09_threads.synchronizing_code.examples;


/**
 * Threads calling static synchronized methods in the same class will always
 * block each other—they all lock on the same Class instance.
 */
public class StaticSynchronizedMethodsExample {
    public static void main(String[] args) throws InterruptedException{
        //create instances:
        /*StaticSynchronizedMethodsExample instance1 = new StaticSynchronizedMethodsExample();
        StaticSynchronizedMethodsExample instance2 = new StaticSynchronizedMethodsExample();*/

        // Create a thread that uses the static method
        Thread thread1 = new Thread(StaticSynchronizedMethodsExample::staticSynchronizedMethod, "Thread 1");

        // Create another thread that uses the static method
        Thread thread2 = new Thread(StaticSynchronizedMethodsExample::staticSynchronizedMethod, "Thread 2");

        // Create a thread that also uses the static method
        Thread thread3 = new Thread(StaticSynchronizedMethodsExample::staticSynchronizedMethod, "Thread 3");

        // Start all threads
        thread1.start();
        thread2.start();
        thread3.start();

        // Wait for all threads to finish
        thread1.join();
        thread2.join();
        thread3.join();

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
}
