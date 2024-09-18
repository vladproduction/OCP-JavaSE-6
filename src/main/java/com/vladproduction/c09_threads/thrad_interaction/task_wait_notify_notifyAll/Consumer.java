package com.vladproduction.c09_threads.thrad_interaction.task_wait_notify_notifyAll;

public class Consumer extends Thread {
    private SharedQueue sharedQueue;

    public Consumer(SharedQueue sharedQueue) {
        this.sharedQueue = sharedQueue;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                sharedQueue.consume();
                Thread.sleep(150); //simulating to poll (removing work); consuming item
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
