package com.vladproduction.c04_operators.logical;

public class Logical {
    public static void main(String[] args) {

        //bitwise operators:
        byte b1 = 6 & 8;
        byte b2 = 7 | 9;
        byte b3 = 5 ^ 4;
        System.out.println(b1 + " " + b2 + " " + b3);

        boolean b = true && false;
        System.out.println("b = " + b); //false
    }
}
