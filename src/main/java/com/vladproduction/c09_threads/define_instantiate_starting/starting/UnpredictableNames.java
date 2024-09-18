package com.vladproduction.c09_threads.define_instantiate_starting.starting;

public class UnpredictableNames {
    public static void main(String[] args) {
        Task task = new Task();

        Thread one = new Thread(task);
        one.setName("Bob");

        Thread two = new Thread(task);
        two.setName("John");

        Thread three = new Thread(task);
        three.setName("Garry");

        one.start();
        two.start();
        three.start();

        //Each one individually is behaving in a nice orderly manner. But together—chaos!
        /*And if we run it again, we'll get a different result. Why? Because
        it's up to the scheduler, and we don't control the scheduler! Which brings up
        another key point to remember: Just because a series of threads are started in a
        particular order doesn't mean they'll run in that order.*/
        //by the way:
        /*a way to start a thread but tell it not to
        run until some other thread has finished is available by the join() method*/

        //Once a thread has been started, it can never be started again.

        /*In addition to using setName() and getName to identify threads, you
        might see getld(). The getld() method returns a positive, unique, long number, and that
        number will be that thread's only ID number for the thread's entire life.*/


    }
}

class Task implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 500; i++) {
            System.out.println("Run by: " + Thread.currentThread().getName() + "//" + i);

        }
    }
}
