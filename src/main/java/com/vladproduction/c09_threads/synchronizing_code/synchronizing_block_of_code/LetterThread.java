package com.vladproduction.c09_threads.synchronizing_code.synchronizing_block_of_code;

public class LetterThread extends Thread{
    private final StringBuffer stringBuffer;
    private final char letter;

    public LetterThread(StringBuffer stringBuffer, char letter) {
        this.stringBuffer = stringBuffer;
        this.letter = letter;
    }

    @Override
    public void run() {
        // Synchronizing block on the StringBuffer object
        synchronized (stringBuffer) {
            for (int i = 0; i < 100; i++) { // Loop 100 times
                // Output the StringBuffer content
                System.out.print(stringBuffer);
            }
            // Increment the letter in StringBuffer
            stringBuffer.setCharAt(0, (char)(letter + 1)); // Incrementing the letter
        }
        // Print a new line for better readability of the output
        System.out.println();
    }
}
