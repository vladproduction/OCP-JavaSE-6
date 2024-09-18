package com.vladproduction.c09_threads.thrad_interaction.task_wait_notify_notifyAll;

import java.util.concurrent.TimeUnit;

public class Producer extends Thread{
    private final SharedQueue sharedQueue;

    public Producer(SharedQueue sharedQueue) {
        this.sharedQueue = sharedQueue;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                sharedQueue.produce(i);
                Thread.sleep(100);// Simulate time for producing an item
            }
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
}
