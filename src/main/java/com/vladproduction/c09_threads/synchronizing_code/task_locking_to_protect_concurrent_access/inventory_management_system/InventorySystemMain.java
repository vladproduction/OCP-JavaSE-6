package com.vladproduction.c09_threads.synchronizing_code.task_locking_to_protect_concurrent_access.inventory_management_system;

public class InventorySystemMain {
    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        //create threads for different operations:
        Thread thread1 = new Thread(new InventoryOperation(inventory, "add", "item1", 10));
        Thread thread2 = new Thread(new InventoryOperation(inventory, "remove", "item1", 5));
        Thread thread3 = new Thread(new InventoryOperation(inventory, "add", "item2", 20));
        Thread thread4 = new Thread(new InventoryOperation(inventory, "remove", "item2", 25)); //insufficient stock
        Thread thread5 = new Thread(new InventoryOperation(inventory, "check", "item1", 0));
        Thread thread6 = new Thread(new InventoryOperation(inventory, "check", "item2", 0));

        // Start all threads
        Thread[] treads = {thread1, thread2, thread3, thread4, thread5, thread6};
        for (Thread tread : treads) {
            tread.start();
        }

        //Join threads to ensure completion before main thread exits
        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
            thread5.join();
            thread6.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Inventory operations completed.");

    }
}
