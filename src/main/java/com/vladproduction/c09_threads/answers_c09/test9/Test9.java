package com.vladproduction.c09_threads.answers_c09.test9;

public class Test9 {
    public static synchronized void main(String[] args) throws InterruptedException{
        Thread t = new Thread();
        t.start();
        System.out.print("X");
        t.wait(10000); //IllegalMonitorStateException
        System.out.print("Y");

        //output:
        // XException in thread "main" java.lang.IllegalMonitorStateException: current thread is not owner

        //answer: G
    }
}
