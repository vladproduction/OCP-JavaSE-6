package com.vladproduction.c09_threads.define_instantiate_starting.defining;

public class ClassImplementingRunnable implements Runnable{

    /*thread work you want is really just a job to be done by a thread. In that case, you
    should design a class that implements the Runnable interface, which also leaves your
    class free to extend some other class*/

    /*Implementing the Runnable interface gives you a way to extend any class you like,
      but still define behavior that will be run by a separate thread*/

    @Override
    public void run() {
        System.out.println("Important job running in MyRunnable");
    }
}
