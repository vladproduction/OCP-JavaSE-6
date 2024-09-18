package com.vladproduction.c05_control_flow_exceptions_assertions.handling_exceptions;

public class ExercisePropagatingCatchingException {
    public static void main(String[] args) {
        //in the main() method attempting to call this method and deal with any potential exceptions.
        try {
            String str1 = "";
            String str2 = "abc";
            String str3 = "cba";
            System.out.println(reverse(str3));
        } catch (IllegalArgumentException e) {
            // Handle the exception if the string is empty
            System.out.println("Exception: " + e.getMessage());
        } finally {
            // Finally block to indicate that main has finished
            System.out.println("Main method has finished.");
        }
    }

        //1)check if the String has a length of 0 by using the String.length() method.
        //2)if the length is 0, the reverse method will throw an exception.
        //3)code to reverse the order of the String
        //4)include a finally statement that displays when main() has finished

    // Method to reverse a given string
    public static String reverse(String s) throws IllegalArgumentException {
        // Check if the string length is 0
        if (s.length() == 0) {
            throw new IllegalArgumentException("String cannot be empty.");
        }

        // Code to reverse the string
        String reverseStr = "";
        for (int i = s.length() - 1; i >= 0; --i) {
            reverseStr += s.charAt(i);
        }
        return reverseStr; // Return the reversed string
    }
}

