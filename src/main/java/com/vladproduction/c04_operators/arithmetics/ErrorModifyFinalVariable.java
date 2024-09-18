package com.vladproduction.c04_operators.arithmetics;

public class ErrorModifyFinalVariable {
    public static void main(String[] args) {
        final int x = 5;
//        int y = x++;//cannot assign a value to final variable x
        System.out.println("x a final variable = " + x);
    }
}
