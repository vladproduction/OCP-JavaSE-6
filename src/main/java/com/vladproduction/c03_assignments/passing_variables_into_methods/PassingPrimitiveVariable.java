package com.vladproduction.c03_assignments.passing_variables_into_methods;

public class PassingPrimitiveVariable {

    public static void main(String[] args) {

        int x = 1;
        PassingPrimitiveVariable passingPrimitiveVariable = new PassingPrimitiveVariable();
        System.out.println("before modifying x is: " + x);
        passingPrimitiveVariable.modify(x);
        System.out.println("after modifying x is: " + x);


    }

    private void modify(int x) {
        x += 1;
        System.out.println("x = " + x);
    }
}
