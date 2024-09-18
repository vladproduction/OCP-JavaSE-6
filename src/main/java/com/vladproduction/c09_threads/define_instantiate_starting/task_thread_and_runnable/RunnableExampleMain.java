package com.vladproduction.c09_threads.define_instantiate_starting.task_thread_and_runnable;

public class RunnableExampleMain {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();// an instance of MyRunnable is created
        Thread thread = new Thread(runnable);// wrapped in a Thread object, which is then started.
        thread.start();
    }
}
