package com.vladproduction.c05_control_flow_exceptions_assertions.handling_exceptions.situations.number_format;

public class TestNumberFormat {
    public static void main(String[] args) {

        /*A NumberFormatException in Java is typically thrown when an attempt is made to convert a string into a numeric type,
        but the string does not have the appropriate format. This exception is often thrown by the Java Virtual Machine (JVM)
        as a result of using methods like Integer.parseInt(String) or Double.parseDouble(String) with invalid input.

        Despite being primarily the responsibility of the JVM to throw this exception, you can also throw it programmatically
        if you need to enforce certain constraints on your input data.*/


        String invalidNumber = "123abc"; // This is not a valid integer

        try {
            // Attempt to parse the invalid number
            int number = Integer.parseInt(invalidNumber); // This will throw NumberFormatException
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught a NumberFormatException: " + e.getMessage());
        }

        System.out.println("Program continues after handling the exception.");
    }
}
