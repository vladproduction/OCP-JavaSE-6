package com.vladproduction.c05_control_flow_exceptions_assertions.loops_iterators;

public class LoopExamples {
    public static void main(String[] args) {

        // ================== For Loop ==================
        System.out.println("For Loop:");
        int final_value = 5;
        for (int i = 0; i < final_value; i++) {
            System.out.println("Current value of i: " + i);
        }
        System.out.println("Final value of i after for loop: " + final_value); // i takes final value of 5 (loop ends when i < 5)

        // ================== Enhanced For Loop (For-Each) ==================
        System.out.println("\nEnhanced For Loop:");
        int[] numbers = {1, 2, 3, 4, 5};
        for (int num : numbers) {
            System.out.println("Current number: " + num);
        }
        // No loop counter variable to observe after the loop as it's scoped within the enhanced for loop.

        // ================== While Loop ==================
        System.out.println("\nWhile Loop:");
        int j = 0; // Initialize loop counter
        while (j < final_value) {
            System.out.println("Current value of j: " + j);
            j++;
        }
        System.out.println("Final value of j after while loop: " + j); // j takes final value of 5 after loop ends.

        // ================== Do-While Loop ==================
        System.out.println("\nDo-While Loop:");
        int k = 0; // Initialize loop counter
        do {
            System.out.println("Current value of k: " + k);
            k++;
        } while (k < final_value);
        System.out.println("Final value of k after do-while loop: " + k); // k takes final value of 5 after loop ends.

        // ================== Labelled Break ==================
        System.out.println("\nLabelled Break:");
        outerLoop: // Label for the outer loop
        for (int a = 0; a < 3; a++) {
            for (int b = 0; b < 3; b++) {
                if (b == 1) {
                    break outerLoop; // Breaks out of both loops when b equals 1
                }
                System.out.println("a: " + a + ", b: " + b);
            }
        }
        System.out.println("Value of a after labelled break: " + 3); // a takes final value 3 after loop ends

        // ================== Labelled Continue ==================
        System.out.println("\nLabelled Continue:");
        outerContinueLoop: // Label for the outer loop
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                if (y == 1) {
                    continue outerContinueLoop; // Skips the current iteration of the outer loop when y equals 1
                }
                System.out.println("x: " + x + ", y: " + y);
            }
        }
        // Value of x is 3 after the loop ends because it completes all iterations.
        System.out.println("All loops executed.");

    }
}
