package com.vladproduction.c09_threads.synchronizing_code.demo_race_condition;

public class AccDanger implements Runnable{
    private Acc acct = new Acc();

    public static void main(String[] args) {
        AccDanger r = new AccDanger();
        Thread one = new Thread(r);
        Thread two = new Thread(r);
        one.setName("Fred");
        two.setName("Lucy");
        one.start();
        two.start();

    }

    @Override
    public void run() {
        System.out.println("started balance is: " + acct.getBalance());
        for (int x = 0; x < 5; x++) {
            makeWithdrawal(10);
            if (acct.getBalance() < 0) {
                System.out.println("account is overdrawn!");
            }
        }
        System.out.println("finish balance is: " + acct.getBalance());
    }

    //race condition is not resolved:
    /*private void makeWithdrawal(int amt) {
        if(acct.getBalance() >= amt){
            System.out.println(Thread.currentThread().getName() + " going to withdrawal");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            acct.withdraw(amt);
            System.out.println(Thread.currentThread().getName() + " completes the withdrawal (balance is: " + acct.getBalance() + ")");
        } else {
            System.out.println("Not enough in account for " + Thread.currentThread().getName() + " to withdraw(" + acct.getBalance() + ")");
        }
    }*/

    //resolved overdraw (marked synchronized):
    private synchronized void makeWithdrawal(int amt) {
        if (acct.getBalance() >= amt) {
            System.out.println(Thread.currentThread().getName() +
                    " is going to withdraw");
            try {
                Thread.sleep(500);
            } catch(InterruptedException ex) { }
            acct.withdraw(amt);
            System.out.println(Thread.currentThread().getName() +
                    " completes the withdrawal");
        } else {
            System.out.println("Not enough in account for "
                    + Thread.currentThread().getName()
                    + " to withdraw " + acct.getBalance());
        }
    }

}
