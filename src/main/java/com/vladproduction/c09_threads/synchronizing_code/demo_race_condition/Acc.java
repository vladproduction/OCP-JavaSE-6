package com.vladproduction.c09_threads.synchronizing_code.demo_race_condition;

public class Acc {
    private int balance = 50;

    public int getBalance() {
        return balance;
    }
    //just one method to withdrawal
    public void withdraw(int amount){
        balance = balance - amount;
    }
}
