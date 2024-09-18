package com.vladproduction.c09_threads.define_instantiate_starting.task_thread_and_runnable;

public class MyThread extends Thread{

    @Override
    public void run() { //logic that the thread will execute.
        for (int i = 0; i < 5; i++) {
            System.out.println("MyThread using Thread class(need to extend): " + i);
            try{
                Thread.sleep(100);
            }catch (Exception e){
                throw new RuntimeException(e);
            }

        }
    }
}
