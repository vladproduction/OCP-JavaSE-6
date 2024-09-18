package com.vladproduction.c05_control_flow_exceptions_assertions.loops_iterators;

public class BasicForLoop {
    public static void main(String[] args) {

        /*for (Initialization ; Condition*; Iteration ) {
            loop body
        }*/
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }

        /*scope of variables declared
        in the for loop ends with the for loop*/
        for (int x = 1; x < 2; x++) {
            System.out.println(x); // Legal
        }
//        System.out.println(x); // Not Legal! x is now out of scope
        // and can't be accessed.

        System.out.println("=============");
        //for loop sections are independent of each other
        int b = 3;
        for (int a = 1; b != 1; System.out.println("iterate")) {
            b = b - a;
        }
    }
}
