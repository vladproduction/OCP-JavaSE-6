package com.vladproduction.c09_threads.states_and_transitions.thread_priorities_and_yield;

public class HasPriorityMain {
    public static void main(String[] args) {
        HasPriorityThread hpt = new HasPriorityThread();
        hpt.setPriority(8); //set the priority
//        hpt.start();

        /*Although the default priority is 5, the Thread class has the three following
          constants (static final variables) that define the range of thread priorities:*/
        //Thread.MIN_PRIORITY (1)
        //Thread.NORM_PRIORITY (5)
        //Thread.MAX_PRIORITY (10)
        hpt.setPriority(Thread.MAX_PRIORITY);
        hpt.start();
    }
}
