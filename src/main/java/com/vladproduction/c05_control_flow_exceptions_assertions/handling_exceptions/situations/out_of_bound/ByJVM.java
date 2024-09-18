package com.vladproduction.c05_control_flow_exceptions_assertions.handling_exceptions.situations.out_of_bound;

public class ByJVM {
    public static void main(String[] args) {
        // Define an array with 3 elements
        int[] numbers = {1, 2, 3};

        // Attempt to access an out-of-bounds index (index 3)
        try {
            System.out.println("Accessing index 3: " + numbers[3]); // This will cause an exception
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        System.out.println("Program continues after handling the exception.");
    }

}
