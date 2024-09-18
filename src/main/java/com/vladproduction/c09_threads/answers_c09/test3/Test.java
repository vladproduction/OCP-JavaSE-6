package com.vladproduction.c09_threads.answers_c09.test3;

public class Test {
    public static void main(String[] args) {
        printAll(args);
    }

    private static void printAll(String[] lines) {
        for (int i = 0; i < lines.length; i++) {
            System.out.println(lines[i]);
//            Thread.currentThread().sleep(1000);
        }
    }
}
