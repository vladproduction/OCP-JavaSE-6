package com.vladproduction.c09_threads.synchronizing_code.task_locking_to_protect_concurrent_access.using_synchronizing_methods;


/**
 * This class implements Runnable and represents a transaction (either deposit or withdrawal).
 * In the run() method, it calls the appropriate method from the BankAccount class based on whether it’s a deposit or a withdrawal.
 * */
public class BankTransaction implements Runnable{

    private BankAccount account;
    private boolean deposit;
    private double amount;

    public BankTransaction(BankAccount account, boolean deposit, double amount) {
        this.account = account;
        this.deposit = deposit;
        this.amount = amount;
    }

    @Override
    public void run() {
        if (deposit) {
            account.deposit(amount); // Deposit money
        } else {
            account.withdraw(amount); // Withdraw money
        }
    }
}
