package com.vladproduction.c09_threads.synchronizing_code.synchronizing_block_of_code;

public class InSync extends Thread {
    StringBuffer letter;

    public InSync(StringBuffer letter) {
        this.letter = letter;
    }

    public void run() {
        synchronized (letter) { // #1
            for (int i = 1; i <= 100; ++i) System.out.print(letter);
            System.out.println();
            char temp = letter.charAt(0);
            ++temp; // Increment the letter in StringBuffer:
            letter.setCharAt(0, temp);
        } // #2
    }

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("A");
        new InSync(sb).start();
        new InSync(sb).start();
        new InSync(sb).start();
    }
}

/*removing lines 1 and 2; then run the program again. It will be unsynchronized*/
