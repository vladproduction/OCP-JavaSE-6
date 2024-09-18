package com.vladproduction.c09_threads.thrad_interaction.task_wait_notify_notifyAll;

import java.util.LinkedList;
import java.util.Queue;

/**
 * wait(), notify(), and notifyAll() must be called from within a synchronized
 * context! A thread can't invoke a wait or notify method on an object unless it owns
 * that object's lock.
 * */
public class SharedQueue {
    private final Queue<Integer> queue = new LinkedList<>();
    private final int capacity;

    public SharedQueue(int capacity) {
        this.capacity = capacity;
    }

    //method to add item to the queue:
    public synchronized void produce(int value) throws InterruptedException{
        while (queue.size() == capacity){
            System.out.println("Queue is full. Producer is waiting...");
            wait(); // Wait until space becomes available
        }
        queue.add(value);
        System.out.println("Produced: " + value);
        notifyAll();
    }

    //method to get and remove item from the queue:
    public synchronized int consume() throws InterruptedException{
        while (queue.isEmpty()){
            System.out.println("Queue is empty. Consumer is waiting...");
            wait(); // Wait until an item becomes available
        }
        int value = queue.poll(); //remove the head of this queue
        System.out.println("Consumed: " + value);
        notifyAll(); // Notify producers that space is available
        return value;
    }

}
