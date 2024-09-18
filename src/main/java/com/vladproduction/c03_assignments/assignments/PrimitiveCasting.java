package com.vladproduction.c03_assignments.assignments;

public class PrimitiveCasting {

    //implicitly cast - smaller into bigger: byte --> int
    int a = 100;
    long b = a; // Implicit cast, an int value always fits in a long


    //explicit cast - large into small conversion is referred to as narrowing
    float a1 = 100.001f;
    int b1 = (int) a1; // Explicit cast, the float could lose info

    double d = 100L; // Implicit cast


    public static void main(String[] args) {
        //    int x = 3957.229; // illegal
        int x = (int) 3957.229; // legal cast
        System.out.println("int x = " + x);

        //casting smaller int bigger
        long l = 56L;
        byte b = (byte) l;
        System.out.println("The byte is " + b); //The byte is 56
        /*
        But what happens if the long value is
            larger than 127 (the largest number a byte can store)?
        */
        long l12 = 130L;
        byte b12 = (byte) l12;
        System.out.println("The byte is " + b12); //The byte is -126

        float f = 234.56F;
        short s = (short) f;
        System.out.println("short s = " + s);



    }

}
