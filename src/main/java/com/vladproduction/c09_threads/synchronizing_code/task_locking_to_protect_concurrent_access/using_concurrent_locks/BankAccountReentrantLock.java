package com.vladproduction.c09_threads.synchronizing_code.task_locking_to_protect_concurrent_access.using_concurrent_locks;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Below is an example of using ReentrantLock from the java.util.concurrent.locks package to protect shared resources
 * (like the account balance) in a multithreading bank account scenario.
 * ReentrantLock provides more capabilities than synchronized methods, allowing more control over locking behavior.
 * reentrant lock - blocking re-entering
 * */
public class BankAccountReentrantLock {

    private double balance;
    private final Lock lock = new ReentrantLock(); //create a Lock instance (here, lock) which is a ReentrantLock. ()

    public BankAccountReentrantLock(double initialBalance){
        this.balance = initialBalance;
    }

    /*The deposit, withdraw, and getBalance methods use lock.lock() to acquire the lock before performing operations on the balance.
    The finally block ensures that the lock is released using lock.unlock() even if an exception occurs, which is a critical aspect of using locks.*/

    /*Concurrency Control:
    This approach allows the code to handle more complex locking mechanisms if needed (for example, allowing timeouts for acquiring locks).
    It maintains thread safety without the limitations of synchronized methods, such as always locking the entire method.*/

    //Method to handle deposits safely
    public void deposit(double amount){
        lock.lock(); //Acquire the lock;
        try{
            if(amount > 0){
                balance += amount;
                System.out.printf("Deposited: %.2f, New Balance: %.2f%n", amount, balance);
            }
        }finally {
            lock.unlock(); //ensure the lock is released;
        }
    }

    // Method to handle withdrawals safely
    public void withdraw(double amount) {
        lock.lock();  // Acquire the lock;
        try {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.printf("Withdrew %.2f, New Balance: %.2f%n", amount, balance);
            } else {
                System.out.println("Withdrawal failed, insufficient funds.");
            }
        } finally {
            lock.unlock();  // Ensure lock is released;
        }
    }

    //Method to get final balance:
    public double getBalance() {
        lock.lock();  // Acquire the lock for balance reading
        try {
            return balance;  // Read method also needs to be safe in a multithreading context
        } finally {
            lock.unlock();  // Ensure lock is released
        }
    }

}
