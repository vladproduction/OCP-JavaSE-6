package com.vladproduction.c09_threads.synchronizing_code.task_locking_to_protect_concurrent_access.inventory_management_system;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Inventory {
    private final Map<String, Integer> stock; // Inventory items and their quantities
    private final Lock lock; // Reentrant lock for synchronized access

    public Inventory() {
        this.stock = new HashMap<>();
        this.lock = new ReentrantLock();
    }

    //method to add item to inventory:
    public void addItem(String itemId, int quantity){
        lock.lock(); //acquire the lock
        try{
            stock.put(itemId, stock.getOrDefault(itemId, 0) + quantity);
            System.out.printf("Added %d of item %s. New quantity: %d%n", quantity, itemId, stock.get(itemId));
        }finally {
            lock.unlock(); // Release the lock
        }
    }

    //method to remove items from the inventory
    public boolean removeItem(String itemId, int quantity){
        lock.lock(); //acquire the lock
        try{
            if (stock.getOrDefault(itemId, 0) >= quantity) {
                stock.put(itemId, stock.get(itemId) - quantity);
                System.out.printf("Removed %d of item %s. Remaining quantity: %d%n", quantity, itemId, stock.get(itemId));
                return true; // Successfully removed
            } else {
                System.out.println("Insufficient stock for item " + itemId);
                return false; // Insufficient stock
            }
        }finally {
            lock.unlock(); //release the lock
        }
    }

    // Method to check stock for an item
    public int checkStock(String itemId) {
        lock.lock(); // Acquire the lock
        try {
            return stock.getOrDefault(itemId, 0); // Return the current stock of the item
        } finally {
            lock.unlock(); // Release the lock
        }
    }

    //---------Updated Methods Using tryLock()------------
    /*public void addItem(String itemId, int quantity) {
        if (lock.tryLock()) { // Try to acquire the lock
            try {
                stock.put(itemId, stock.getOrDefault(itemId, 0) + quantity);
                System.out.printf("Added %d of item %s. New quantity: %d%n", quantity, itemId, stock.get(itemId));
            } finally {
                lock.unlock(); // Ensure lock is released
            }
        } else {
            System.out.println("Could not acquire lock for adding item " + itemId);
        }
    }*/

    /*public boolean removeItem(String itemId, int quantity) {
        if (lock.tryLock()) { // Try to acquire the lock
            try {
                if (stock.getOrDefault(itemId, 0) >= quantity) {
                    stock.put(itemId, stock.get(itemId) - quantity);
                    System.out.printf("Removed %d of item %s. Remaining quantity: %d%n", quantity, itemId, stock.get(itemId));
                    return true; // Successfully removed
                } else {
                    System.out.println("Insufficient stock for item " + itemId);
                    return false; // Insufficient stock
                }
            } finally {
                lock.unlock(); // Release the lock
            }
        } else {
            System.out.println("Could not acquire lock for removing item " + itemId);
            return false; // Lock could not be acquired
        }
    }*/



}
