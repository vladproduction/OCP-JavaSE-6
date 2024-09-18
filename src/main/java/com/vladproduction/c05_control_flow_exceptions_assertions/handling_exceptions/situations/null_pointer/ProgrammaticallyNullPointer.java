package com.vladproduction.c05_control_flow_exceptions_assertions.handling_exceptions.situations.null_pointer;

public class ProgrammaticallyNullPointer {
    public static void main(String[] args) {

        /* it is recommended to use checks to avoid null pointers, or to use Optional<T>
        in cases where a variable might or might not contain a value.*/

        try {
            checkForNull(null); // This will throw a NullPointerException programmatically
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException: " + e.getMessage());
        }

        System.out.println("Program continues after handling the exception.");

    }

    public static void checkForNull(String str) {
        if (str == null) {
            throw new NullPointerException("Provided string is null!");
        }
        System.out.println("Provided string: " + str);
    }

}
