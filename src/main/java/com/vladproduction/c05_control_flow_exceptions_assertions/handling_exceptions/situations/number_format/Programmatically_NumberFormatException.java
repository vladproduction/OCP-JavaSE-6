package com.vladproduction.c05_control_flow_exceptions_assertions.handling_exceptions.situations.number_format;

public class Programmatically_NumberFormatException {
    public static void main(String[] args) {

        String input = "123abc"; // Invalid input

        try {
            // Call the method to check and parse
            checkAndParse(input); // This will throw NumberFormatException programmatically
        } catch (NumberFormatException e) {
            System.out.println("Caught a NumberFormatException: " + e.getMessage());
        }

        System.out.println("Program continues after handling the exception.");

    }

    public static void checkAndParse(String input) {
        // Here you can include custom logic to validate the input
        if (!input.matches("\\d+")) { // Check if the input contains only digits
            throw new NumberFormatException("Invalid input: " + input);
        }

        // If valid, parse the number
        int number = Integer.parseInt(input);
        System.out.println("Parsed number: " + number);
    }
}
