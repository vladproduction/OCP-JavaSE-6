package com.vladproduction.c05_control_flow_exceptions_assertions.handling_exceptions.situations.initialising_error;

public class TestInInitialisingError {

    // Static variable that throws an exception during initialization
    static {
        // This will cause an ArithmeticException (division by zero)
//        int result = 10 / 0; // ArithmeticException
    }

    // Static variable
    private static final String message = "Hello, World!";

    public static void main(String[] args) {
        /*An ExceptionInInitializerError is a runtime exception that occurs when an exception is thrown during
        the static initialization of a class. This exception is thrown by the Java Virtual Machine (JVM) and is
        often a wrapper around the original exception that caused the initialization to fail. It indicates that
        an error occurred during the initialization of a static variable, execution of a static block,
        or when the class was referenced for the first time.*/

        try {
            // This line will trigger the class initialization
            System.out.println(TestInInitialisingError.message);
        } catch (ExceptionInInitializerError e) {
            System.out.println("Caught ExceptionInInitializerError: " + e.getMessage());
            System.out.println("Caused by: " + e.getCause());
        }
    }
}
