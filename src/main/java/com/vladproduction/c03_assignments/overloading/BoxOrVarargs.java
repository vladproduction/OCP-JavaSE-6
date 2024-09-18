package com.vladproduction.c03_assignments.overloading;

public class BoxOrVarargs {

    static void go(Byte x, Byte y){
        System.out.println("Boxing...");
    }
    static void go(byte... x){
        System.out.println("Varargs...");
    }

    public static void main(String[] args) {
        /**
         *  does boxing beat var-args?
         * */
        byte b = 5;
        go(b,b);

    }
}
