package com.vladproduction.c09_threads.define_instantiate_starting.starting;

public class TestThreads {
    public static void main(String[] args) {
        FooRunnable runnable = new FooRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
        /*what happens after call start()?
            The good stuff:
        ■ A new thread of execution starts (with a new call stack).
        ■ The thread moves from the new state to the runnable state.
        ■ When the thread gets a chance to execute, its target run() method will run.*/
    }
}

class FooRunnable implements Runnable {
    public void run() {
        for(int x = 1; x < 6; x++) {
            System.out.println("Runnable running");
        }
    }
}
