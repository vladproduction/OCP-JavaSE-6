package com.vladproduction.c03_assignments.wrappers_classes_boxing;

public class Boxing2 {
    static Integer x;
    public static void main(String[] args) {

        doStuff(x); //NullPointerException: Cannot invoke "Integer.intValue()" because "Boxing2.x" is null

    }
    static void doStuff(int z) {
        int z2 = 5;
        System.out.println(z2 + z); //no value to unbox
    }
}
