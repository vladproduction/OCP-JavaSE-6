package com.vladproduction.c09_threads.define_instantiate_starting.task_thread_and_runnable;

public class MyRunnable implements Runnable{

    @Override
    public void run() {// is overridden similarly to provide the thread execution logic
        for (int i = 0; i < 5; i++) {
            System.out.println("MyRunnable using Runnable interface(need to implement): " + i);
            try {
                Thread.sleep(100); // Sleep for 100 milliseconds
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
