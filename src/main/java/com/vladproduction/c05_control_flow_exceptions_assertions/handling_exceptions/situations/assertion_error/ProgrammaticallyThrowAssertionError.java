package com.vladproduction.c05_control_flow_exceptions_assertions.handling_exceptions.situations.assertion_error;

public class ProgrammaticallyThrowAssertionError {
    public static void main(String[] args) {
        // Some condition that you want to check
        boolean condition = false;

        // Check the condition and throw AssertionError if it fails
        if (!condition) {
            throw new AssertionError("Condition expected to be true, but was false.");
        }

        System.out.println("Program continues after the assertion check.");
    }
}
