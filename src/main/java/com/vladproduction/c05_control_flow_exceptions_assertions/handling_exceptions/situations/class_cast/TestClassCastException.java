package com.vladproduction.c05_control_flow_exceptions_assertions.handling_exceptions.situations.class_cast;

public class TestClassCastException {
    public static void main(String[] args) {
        /*In Java, a ClassCastException is generally thrown by the Java Virtual Machine (JVM) when you attempt to cast
        an object to a class of which it is not an instance.
        This exception is usually not thrown programmatically;
        instead, it's typically the result of an invalid cast operation occurring at runtime.*/

        // Create an object of a class
        Object obj = 100; // obj is an Integer wrapped as an Object

        try {
            // Attempt to cast the Object to String - this will cause ClassCastException
            String str = (String) obj; // Invalid cast
            System.out.println("The string is: " + str);
        } catch (ClassCastException e) {
            System.out.println("Caught a ClassCastException: " + e.getMessage());
        }

        System.out.println("Program continues after handling the exception.");

    }
}
