package com.vladproduction.c05_control_flow_exceptions_assertions.handling_exceptions.situations.null_pointer;

public class TestNullPointer {
    public static void main(String[] args) {
        /*A NullPointerException in Java is thrown when the JVM detects that you are attempting to use a
        null reference where an object is required. This can happen when accessing methods or properties
        of an object that has not been initialized. Generally, a NullPointerException is thrown by the JVM
        as a result of your code, rather than being thrown programmatically.*/

        // Initialize an object reference to null
        String str = null;

        try {
            // Attempt to call a method on the null object
            int length = str.length(); // This will throw NullPointerException
            System.out.println("Length of the string: " + length);
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException: " + e.getMessage());
        }

        System.out.println("Program continues after handling the exception.");
    }
}
