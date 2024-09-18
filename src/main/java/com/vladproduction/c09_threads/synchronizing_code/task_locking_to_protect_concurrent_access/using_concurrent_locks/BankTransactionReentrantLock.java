package com.vladproduction.c09_threads.synchronizing_code.task_locking_to_protect_concurrent_access.using_concurrent_locks;

public class BankTransactionReentrantLock implements Runnable{

    private final BankAccountReentrantLock account;
    private final boolean deposit;
    private final double amount;

    public BankTransactionReentrantLock(BankAccountReentrantLock account, boolean deposit, double amount) {
        this.account = account;
        this.deposit = deposit;
        this.amount = amount;
    }

    @Override
    public void run() {
        if(deposit){
            account.deposit(amount); //deposit money
        } else {
            account.withdraw(amount); // withdraw money
        }
    }
}
