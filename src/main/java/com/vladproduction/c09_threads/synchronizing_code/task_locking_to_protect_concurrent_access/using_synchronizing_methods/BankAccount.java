package com.vladproduction.c09_threads.synchronizing_code.task_locking_to_protect_concurrent_access.using_synchronizing_methods;


/**
 * It includes a private instance variable balance to hold the account balance.
 * The deposit and withdraw methods are marked as synchronized to ensure that only one thread can execute them at a time.
 * This prevents race conditions when modifying the balance.
 * */
public class BankAccount {

    private double balance; // Instance variable to hold the bank account balance

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Synchronized method to handle deposits safely
    public synchronized void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("Deposited %.2f, New Balance: %.2f%n", amount, balance);
        }
    }

    // Synchronized method to handle withdrawals safely
    public synchronized void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.printf("Withdrew %.2f, New Balance: %.2f%n", amount, balance);
        } else {
            System.out.println("Withdrawal failed, insufficient funds.");
        }
    }

    public double getBalance() {
        return balance; // Read method still needs to be safe in a multithreading context
    }
}
