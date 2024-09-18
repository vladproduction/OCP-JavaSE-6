package com.vladproduction.c04_operators.relational;

public class Test {
    public static void main(String[] args) {
        int x = 8;
        if(x<9){
            System.out.println("x is less '9'");
        } else {
            System.out.println("x is bigger/equal '9'");
        }

        //can be assigned to a boolean primitive:
        boolean b = 100 > 99;
        System.out.println("The value of b is " + b); //true
    }
}
