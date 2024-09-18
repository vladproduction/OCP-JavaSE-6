package com.vladproduction.c09_threads.answers_c09.test2;

public class MyThread extends Thread{
    public static void main(String[] args) {
        MyThread t = new MyThread();
        Thread x = new Thread(t);
        x.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.print(i + "..");
        }
    }
}
