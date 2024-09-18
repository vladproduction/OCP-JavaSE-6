package com.vladproduction.c09_threads.states_and_transitions.task_states_transitions_of_threads;

public class SampleThread extends Thread{
    @Override
    public void run() {
        try {
            // Transition to TIMED_WAITING state
            System.out.println(Thread.currentThread().getName() + " is going to sleep.");
            Thread.sleep(2000); // Thread goes to TIMED_WAITING state
            System.out.println(Thread.currentThread().getName() + " woke up.");

            synchronized (this) {
                // Transition to WAITING state
                wait(); // This will cause the thread to go to WAITING state
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // The thread continues after it's notified
        System.out.println(Thread.currentThread().getName() + " has exited.");
    }
}
