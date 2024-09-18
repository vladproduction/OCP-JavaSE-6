package com.vladproduction.c09_threads.define_instantiate_starting.task_thread_and_runnable;

public class ThreadExampleMain {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread(); //instance of MyThread is created and started by calling start().
        thread1.start();
    }
}
