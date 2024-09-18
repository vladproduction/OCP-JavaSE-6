package com.vladproduction.c03_assignments.initialization_blocks;

public class InitError {

    static int [] x = new int[4];

    // bad array index!
    static {
//        x[4] = 5; //ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
    }

    public static void main(String [] args) { }

}
