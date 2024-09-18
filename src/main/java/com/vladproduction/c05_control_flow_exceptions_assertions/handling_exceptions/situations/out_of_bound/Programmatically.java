package com.vladproduction.c05_control_flow_exceptions_assertions.handling_exceptions.situations.out_of_bound;

public class Programmatically {
    public static void main(String[] args) {
        // Define an array with 3 elements
        int[] numbers = {1, 2, 3};

        // Try to access an out-of-bounds index programmatically
        try {
            accessArray(numbers, 5); // This index is out of bounds
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        System.out.println("Program continues after handling the exception.");
    }

    public static void accessArray(int[] arr, int index) {
        // Check if the index is out of bounds (this is throwing an exception programmatically)
        if (index < 0 || index >= arr.length) {
            throw new ArrayIndexOutOfBoundsException("Invalid index: " + index);
        }

        // If valid, proceed to access the array
        System.out.println("Accessing index " + index + ": " + arr[index]);
    }
}


