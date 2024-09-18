package com.vladproduction.c03_assignments.assignments;

public class PrimitiveAssignment {
    public static void main(String[] args) {

        int x = 7; // literal assignment
        int y = x + 2; // assignment with an expression
        // (including a literal)
        int z = x * y; // assignment with an expression
        System.out.println("z = " + z);

        byte a = 3;
        byte b = 8;
        //need a cast
//        byte c = a + b;
        byte c = (byte) (a + b); //casting here
        System.out.println("c = " + c);

        byte b1 = 27;
        byte b2 = (byte) 27; // Explicitly cast the int literal to a byte
    }
}
