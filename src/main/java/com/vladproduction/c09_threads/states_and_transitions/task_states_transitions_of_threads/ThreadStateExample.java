package com.vladproduction.c09_threads.states_and_transitions.task_states_transitions_of_threads;

public class ThreadStateExample {
    public static void main(String[] args) {
        SampleThread thread1 = new SampleThread();

        // Thread is in NEW state
        System.out.println("Thread State: " + thread1.getState());

        // Start the thread, it transitions to RUNNABLE state
        thread1.start();
        System.out.println("After starting, Thread State: " + thread1.getState());

        try {
            // Sleep to allow the thread to transition states
            Thread.sleep(500); // Give time for thread to go to TIMED_WAITING state
            System.out.println("After sleep, Thread State: " + thread1.getState());

            // Notify the waiting thread
            synchronized (thread1) {
                thread1.notify(); // Notify will wake up the waiting thread
            }

            // Allow the thread to complete
            thread1.join(); // Here, we will wait for thread1 to terminate
            System.out.println("Final Thread State: " + thread1.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
