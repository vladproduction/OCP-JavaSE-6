package com.vladproduction.c09_threads.states_and_transitions.thread_priorities_and_yield;

public class HasPriorityThread extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
//            System.out.println(i);
            if(i % 2 != 0){
                System.out.println("current number is odd:  " + i);
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            } else {
                System.out.println("current number is even: " + i);
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
