package com.vladproduction.c05_control_flow_exceptions_assertions.handling_exceptions.situations.assertion_error;

public class TestAssertionError {
    public static void main(String[] args) {
        /*An AssertionError in Java is typically thrown by the Java Virtual Machine (JVM) when an assertion fails.
        Assertions are a form of debugging aid that can be used to check assumptions in your code during development.
        They provide a way to specify constraints inside the code, which, if violated, can trigger this error.

        Assertions are enabled or disabled via the command line when running the Java program, and the AssertionError is
        thrown automatically by the JVM when an assertion fails. While you can also throw an AssertionError programmatically,
        it is primarily intended to indicate an assertion failure.*/

            int value = 5;

            // Assert that the value should be greater than 10
            assert value > 10 : "Value should be greater than 10, but is: " + value;

            System.out.println("Program continues after the assertion check.");

    }
}
