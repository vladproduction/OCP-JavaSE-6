package com.vladproduction.c09_threads.states_and_transitions.thread_priorities_and_yield;

public class YieldingThread extends Thread{
    private String threadName;

    public YieldingThread(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(threadName + " is running: " + i);
            // Call yield() to give chance to threads of the same priority
            Thread.yield();
        }
    }

//    Yielding Control: After printing, each thread calls Thread.yield().
//    This suggests to the thread scheduler that other threads of the same priority might want to run.
//    However, whether another thread actually gets to run momentarily depends on the thread scheduler.
}
