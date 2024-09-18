package com.vladproduction.c09_threads.synchronizing_code.task_locking_to_protect_concurrent_access.using_synchronizing_methods;


/**
 * A BankAccount instance is created with an initial balance.
 * Multiple threads are created to perform deposit and withdrawal operations simultaneously.
 * The start() method begins each thread execution, and the join() method is used to wait for all threads
 * to complete before proceeding to output the final balance.
 * */
public class BankAppMain {
    public static void main(String[] args) {

        BankAccount account = new BankAccount(1000.0); // Create a bank account with an initial balance

        // Create threads for depositing and withdrawing simultaneously
        Thread thread1 = new Thread(new BankTransaction(account, true, 200.0));
        Thread thread2 = new Thread(new BankTransaction(account, false, 150.0));
        Thread thread3 = new Thread(new BankTransaction(account, true, 300.0));
        Thread thread4 = new Thread(new BankTransaction(account, false, 500.0));

        // Start all threads
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        // Join threads to ensure completion before main thread exits
        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Final balance output
        System.out.printf("Final Balance: %.2f%n", account.getBalance());
    }
}
