package com.vladproduction.c07_generics_and_collections.generic_types;

import java.util.ArrayList;

/**
 * Scenario
 * Imagine we have an ArrayList<Integer>, which is supposed to hold only Integer values.
 * However, due to legacy code or improper use, a String is added to this list.
 * This results in a situation where the code compiles (with warnings) and runs, but it will cause a runtime error
 * when you attempt to retrieve the String as an Integer.
 * */
public class UnsafeArrayListExample {
    public static void main(String[] args) {

        // Create an ArrayList that is supposed to hold Integer values
        ArrayList<Integer> integerList = new ArrayList<>();

        // Here, we deliberately add a String to the list, which is unsafe
        // This should generally be avoided!
        // Integer is a boxed type so we can cast
        Object stringObject = "I'm a String";
        integerList.add((Integer) stringObject); // Suppressing warning for demonstration purposes
        //In normal circumstances, the Java compiler does not catch this as an error because we are suppressing type checks (by casting).

        // Now, let's try to retrieve an element from the list
        try {
            // This will cause a ClassCastException at runtime
            Integer value = integerList.get(0);
            System.out.println("Value: " + value);
        } catch (ClassCastException e) {
            System.out.println("A ClassCastException occurred: " + e.getMessage());
        }

    }
}
