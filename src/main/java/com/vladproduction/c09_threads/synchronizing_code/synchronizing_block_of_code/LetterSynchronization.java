package com.vladproduction.c09_threads.synchronizing_code.synchronizing_block_of_code;

public class LetterSynchronization {
    public static void main(String[] args) {
        //create StringBuffer object with initial letter 'A'
        StringBuffer stringBuffer = new StringBuffer("A");

        //create three instances of letter thread:
        LetterThread threadA = new LetterThread(stringBuffer, 'A');
        LetterThread threadB = new LetterThread(stringBuffer, 'B');
        LetterThread threadC = new LetterThread(stringBuffer, 'B');

        // start all three threads
        threadA.start();
        threadB.start();
        threadC.start();

        // wait for all threads to finish before exiting the main method
        try {
            threadA.join();
            threadB.join();
            threadC.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
