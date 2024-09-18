package com.vladproduction.c09_threads.synchronizing_code.examples;


/**
 * For synchronized blocks, you have to look at exactly what object has been
 * used for locking. (What's inside the parentheses after the word synchronized?) Threads that synchronize on the same object will block each other.
 * Threads that synchronize on different objects will not.
 * */
public class SynchronizedBlockExample {
    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    public static void main(String[] args) throws InterruptedException{
        SynchronizedBlockExample example = new SynchronizedBlockExample();
        // Thread that uses method with lock1
        Thread thread1 = new Thread(example::methodWithLock1, "Thread 1");

        // Another thread that uses method with lock1
        Thread thread2 = new Thread(example::methodWithLock1, "Thread 2");

        // Thread that uses method with lock2
        Thread thread3 = new Thread(example::methodWithLock2, "Thread 3");

        // Thread that uses method with an instance lock (this)
        Thread thread4 = new Thread(example::methodWithInstanceLock, "Thread 4");

        // Thread that uses method with lock2 (not blocking)
        Thread thread5 = new Thread(example::methodWithLock2, "Thread 5");

        // Start all threads
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

        // Wait for all threads to finish
        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();
        thread5.join();

    }

    // Method using synchronized block on lock1
    public void methodWithLock1() {
        synchronized (lock1) {
            System.out.println(Thread.currentThread().getName() + " is in methodWithLock1.");
            try {
                Thread.sleep(2000); // Simulate work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " is leaving methodWithLock1.");
        }
    }

    // Method using synchronized block on lock2
    public void methodWithLock2() {
        synchronized (lock2) {
            System.out.println(Thread.currentThread().getName() + " is in methodWithLock2.");
            try {
                Thread.sleep(2000); // Simulate work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " is leaving methodWithLock2.");
        }
    }

    // Method using synchronized block on the instance (this)
    public void methodWithInstanceLock() {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + " is in methodWithInstanceLock.");
            try {
                Thread.sleep(2000); // Simulate work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " is leaving methodWithInstanceLock.");
        }
    }

}
