package com.vladproduction.c09_threads.states_and_transitions.sleeping;

public class TheCount extends Thread {
    public void run() {
        for (int i = 1; i <= 100; ++i) {
            System.out.print(i + " ");
            if (i % 10 == 0) System.out.println("Hahaha");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }

    public static void main(String[] args) {
        new TheCount().start();
    }
}
