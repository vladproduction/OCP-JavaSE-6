package com.vladproduction.c03_assignments.variable_declaration;

public class ArrayInstanceVariable {
    public static void main(String[] args) {
        int [] years = new int[100];
        for (int i = 0; i < 100; i++) {
            System.out.println("year[" + i + "] = " + years[i]);

        }
    }
}
