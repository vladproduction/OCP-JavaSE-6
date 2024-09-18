package com.vladproduction.c09_threads.states_and_transitions.thread_priorities_and_yield;

public class YieldingThreadMain {
    public static void main(String[] args) {
        YieldingThread thread1 = new YieldingThread("Thread 1");
        YieldingThread thread2 = new YieldingThread("Thread 2");

        // Start both threads
        thread1.start();
        thread2.start();

        try {
            /* A call to join() Guaranteed to cause the current thread to stop executing until the thread it joins with
               (in other words, the thread it calls join() on) completes, or if the thread it's trying to join with is not alive, however,
               the current thread won't need to back out. */

            thread1.join(); // Wait for thread1 to finish
            thread2.join(); // Wait for thread2 to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Both threads have finished execution.");
    }
}
