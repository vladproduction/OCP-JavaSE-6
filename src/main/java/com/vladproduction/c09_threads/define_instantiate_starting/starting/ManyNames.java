package com.vladproduction.c09_threads.define_instantiate_starting.starting;

public class ManyNames {
    public static void main(String[] args) {
        // Make one Runnable
        NameRunnableClass nr = new NameRunnableClass();
        Thread one = new Thread(nr);
        Thread two = new Thread(nr);
        Thread three = new Thread(nr);
        one.setName("Fred");
        two.setName("Lucy");
        three.setName("Ricky");
        one.start();
        two.start();
        three.start();

        //The behavior is not guaranteed.
        //but:
        //Each thread will start, and each thread will run to completion.

    }
}

class NameRunnableClass implements Runnable {
    public void run() {
        for (int x = 1; x <= 3; x++) {
            System.out.println("Run by "
                    + Thread.currentThread().getName()
                    + ", x is " + x);
        }
    }
}
