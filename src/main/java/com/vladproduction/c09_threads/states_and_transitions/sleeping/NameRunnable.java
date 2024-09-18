package com.vladproduction.c09_threads.states_and_transitions.sleeping;

public class NameRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i < 4; i++) {
            System.out.println("Run by " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
