package com.vladproduction.c05_control_flow_exceptions_assertions.handling_exceptions.situations.illegal_argument;

public class TestIllegalArgument {
    public static void main(String[] args) {
        /*An IllegalArgumentException is typically thrown when a method receives an argument that is not appropriate
        or acceptable in the context of its operation. While this exception can be thrown by the JVM in certain cases,
        it is commonly thrown programmatically by developers to handle invalid inputs or states.*/

        try {
            // Attempt to set a negative age
            setAge(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught an IllegalArgumentException: " + e.getMessage());
        }

        System.out.println("Program continues after handling the exception.");

    }

    // Method that takes a positive integer as an argument
    public static void setAge(int age) {
        // Check if the age is negative
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative: " + age);
        }
        System.out.println("Age is set to: " + age);
    }

}
