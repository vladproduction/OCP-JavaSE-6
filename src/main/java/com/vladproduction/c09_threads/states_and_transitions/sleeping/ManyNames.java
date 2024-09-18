package com.vladproduction.c09_threads.states_and_transitions.sleeping;

public class ManyNames {
    public static void main(String[] args) {
        //Making one Runnable:
        NameRunnable nr = new NameRunnable();
        //Making three threads:
        Thread thread1 = new Thread(nr);
        thread1.setName("One");
        Thread thread2 = new Thread(nr);
        thread2.setName("Two");
        Thread thread3 = new Thread(nr);
        thread3.setName("Three");

        thread1.start();
        thread2.start();
        thread3.start();

        /*using sleep()
        is the best way to help all threads get a chance to run! Or at least to guarantee that
        one thread doesn't get in and stay until it's done.*/

        /*A call to sleep() Guaranteed to cause the current thread to stop executing for at least the specified sleep duration
        (although it might be interrupted before its specified time).*/
    }
}
