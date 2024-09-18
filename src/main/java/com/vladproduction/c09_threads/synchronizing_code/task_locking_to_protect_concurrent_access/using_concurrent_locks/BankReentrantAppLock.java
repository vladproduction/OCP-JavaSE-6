package com.vladproduction.c09_threads.synchronizing_code.task_locking_to_protect_concurrent_access.using_concurrent_locks;


/**
 * Temporal Logic:
 * Multiple threads are created to deposit and withdraw funds to the account in parallel,
 * demonstrating the thread-safe operations facilitated by the ReentrantLock.
 *
 * Using ReentrantLock gives you more flexibility and control over your locking strategy compared to the simpler synchronized methods,
 * making it a powerful option for complex concurrent applications.
 * */
public class BankReentrantAppLock {
    public static void main(String[] args) {

        // Create a bank account with an initial balance
        BankAccountReentrantLock account = new BankAccountReentrantLock(1000.0);

        // Create threads for depositing and withdrawing simultaneously
        Thread thread1 = new Thread(new BankTransactionReentrantLock(account, true, 200.0));
        Thread thread2 = new Thread(new BankTransactionReentrantLock(account, false, 150.0));
        Thread thread3 = new Thread(new BankTransactionReentrantLock(account, true, 300.0));
        Thread thread4 = new Thread(new BankTransactionReentrantLock(account, false, 500.0));

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
        //After all threads complete, the final balance of the account is printed, ensuring that the concurrent operations were handled correctly.

    }
}
