package com.vladproduction.c09_threads.thrad_interaction.task_wait_notify_notifyAll;


/**
 * assuming that producer is a bit faster as consumer (100/150)
 * */
public class WaitNotifyExample {
    public static void main(String[] args) {

        int queue_capacity = 5;

        // Queue with capacity of 5
        SharedQueue sharedQueue = new SharedQueue(queue_capacity);

        //create instances of threads:
        Producer producer = new Producer(sharedQueue);
        Consumer consumer = new Consumer(sharedQueue);

        // Start producer and consumer threads
        producer.start();
        consumer.start();

        try {
            // Wait for both threads to finish
            producer.join();
            consumer.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Production and consumption completed.");

    }
}
