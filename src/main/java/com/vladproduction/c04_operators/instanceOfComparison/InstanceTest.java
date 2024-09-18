package com.vladproduction.c04_operators.instanceOfComparison;

public class InstanceTest {
    public static void main(String[] args) {
        String a = null;
        boolean b = null instanceof String;
        boolean c = a instanceof String;
        System.out.println(b + " " + c);//false false

        //arrays are objects itself:
        int [] nums = new int[3];
        if (nums instanceof Object) { } // result is true
    }
}
