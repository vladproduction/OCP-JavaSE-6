package com.vladproduction.c05_control_flow_exceptions_assertions.answers_c05.test12;

public class Wind {
    public static void main(String[] args) {
        foreach:
        for (int j = 0; j < 5; j++) {
            for (int k = 0; k < 3; k++) {
                System.out.print(" " + j);
                if (j == 3 && k == 1) break foreach;
                if (j == 0 || j == 2) break;
            }
        }
    }

    //output: 0 1 1 1 2 3 3
    //answer: C
}
