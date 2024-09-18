package com.vladproduction.c05_control_flow_exceptions_assertions.handling_exceptions.situations.stack_over_flow;

public class TestStackOverFlow {
    public static void main(String[] args) {
        /*A StackOverflowError in Java occurs when a thread exhausts its stack memory, usually due
        to excessive or infinite recursion. This error is thrown by the Java Virtual Machine (JVM) and is not
        something that you can throw programmatically in a typical way. It signifies that your program has
        used up all the stack space for method calls.*/

        try {
            recursiveMethod(); // Start the recursion
        } catch (StackOverflowError e) {
            System.out.println("Caught StackOverflowError: " + e.getMessage());
        }

        System.out.println("Program continues after handling the error.");


    }

    public static void recursiveMethod() {
        // This method calls itself indefinitely
        recursiveMethod();
    }
}
