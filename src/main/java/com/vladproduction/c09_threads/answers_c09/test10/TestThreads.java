package com.vladproduction.c09_threads.answers_c09.test10;

public class TestThreads {
    public static void main(String[] args) {
        Thread t = new MyThread() {         //constructor action: MyThread
            public void run() {             //overridden by Anonymous --> foo
                System.out.print(" foo");
            }
        };
        t.start();
    }
}

class MyThread extends Thread{
    MyThread(){
        System.out.print(" MyThread");
    }
    public void run() {
        System.out.print(" bar");
    }
    public void run(String s) { //no actions
        System.out.print(" baz");
    }
}
