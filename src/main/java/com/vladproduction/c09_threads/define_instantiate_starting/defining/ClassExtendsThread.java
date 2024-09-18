package com.vladproduction.c09_threads.define_instantiate_starting.defining;

/**
 * such practice is not good enough (since were extends a class) - not available to extends any other;
 * */
public class ClassExtendsThread extends Thread{

    //subclassing should be reserved for specialized versions of more
    //general superclasses.

    /*The Thread class expects a run() method
    with no arguments, and it will execute this method for you in a separate call stack
    after the thread has been started.*/
    public void run() {
        System.out.println("Important job running in MyThread");
    }

    //possible to overload run()
    //but it has to be invoking by hands
    /*Note: execution won't happen in a new thread of execution with a separate
    call stack. It will just happen in the same call stack as the code that you made the
    call from*/
    public void run(String s) {
        System.out.println("Important job running in MyThread with params for run(String s) " + s);
    }
}
