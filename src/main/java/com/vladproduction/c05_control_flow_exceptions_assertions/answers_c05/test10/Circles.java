package com.vladproduction.c05_control_flow_exceptions_assertions.answers_c05.test10;

public class Circles {
    public static void main(String[] args) {

        int[] ia = {1, 3, 5, 7, 9};

        for (int x : ia) { // outer loop iteration over array
            for (int j = 0; j < 3; j++) { // inner loop - runs 3 times
                if (x > 4 && x < 8) continue;// If x is between 5 and 7, skip this iteration of the inner loop
                System.out.print(" " + x);
                if (j == 1) break;// If j is 1, exit the inner loop
                continue;// Continue to next iteration of inner loop
            }
            continue;// Continue to next iteration of outer loop
        }

        //final result of output is: 1 1 3 3 9 9
    }
}
