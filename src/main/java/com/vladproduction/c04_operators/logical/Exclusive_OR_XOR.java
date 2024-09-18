package com.vladproduction.c04_operators.logical;

public class Exclusive_OR_XOR {
    public static void main(String[] args) {

        /*The XOR (exclusive OR) operator returns true if and only if the two operands have different boolean values.
        If both operands are the same (both true or both false), the XOR operation returns false.
         */
        boolean a = 2 < 3;
        boolean b = 4 > 3;
        System.out.println("xor " + ((a) ^ (b))); //false

        /*a is assigned the value true because 2 is less than 3.
        b is assigned the value true because 4 is greater than 3.
        The XOR operation on a and b results in false because both operands are true.*/


    }
}
