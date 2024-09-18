package com.vladproduction.c03_assignments.overloading;

public class CombiningWidening_and_Boxing {

    static void go(Long x){
        System.out.println("Long...");
    }

    public static void main(String[] args) {
        byte b = 5;
//        go(b); //required type is Long, need to cast
    }

    /**
     * if it tried to box first, the byte would have been converted to a Byte.
     * Now we're back to trying to widen a Byte to a Long, and of course,
     * the IS-A test fails
     * */
}
