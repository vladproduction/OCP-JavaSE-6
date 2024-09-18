package com.vladproduction.c09_threads.define_instantiate_starting.starting;

/**
 * what happens if we start multiple threads?
 * following example instantiates a thread and gives it a name, and then the name is
 * printed out from the run() method:
 * */
public class NameThread {
    public static void main(String[] args) {

        System.out.println("thread is "
                + Thread.currentThread().getName()); //give us the name of the current thread (which is main)

        NameRunnable nr = new NameRunnable();
        Thread t = new Thread(nr);
//        t.setName("Fred");//Even if you don't explicitly name a thread, it still has a name
        t.start();
    }
}

class NameRunnable implements Runnable {
    public void run() {
        System.out.println("NameRunnable running");
        System.out.println("Run by "
                + Thread.currentThread().getName());
    }
}
