package com.vladproduction.c05_control_flow_exceptions_assertions.loops_iterators;

public class LabeledContinueLoop {
    public static void main(String[] args) {

        boolean isTrue = true;
        outer:
        for(int i=0; i<5; i++) {
            while (isTrue) {
                System.out.println("Hello");
                continue outer;
            } // end of inner while loop
            System.out.println("Outer loop."); // Won't print
        } // end of outer for loop
        System.out.println("Good-Bye");

    }
}
