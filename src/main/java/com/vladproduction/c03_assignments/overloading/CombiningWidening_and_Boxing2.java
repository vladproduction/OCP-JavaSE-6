package com.vladproduction.c03_assignments.overloading;

public class CombiningWidening_and_Boxing2 {

    static void go(Object x){
        Byte b2 = (Byte) x; // ok - it's a Byte object
        System.out.println(b2);
    }

    public static void main(String[] args) {
        byte b = 5;
        go(b); // can this byte turn into an Object ?
        //yes, printing: 5
    }
}
