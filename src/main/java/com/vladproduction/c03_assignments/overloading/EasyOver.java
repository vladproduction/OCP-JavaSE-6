package com.vladproduction.c03_assignments.overloading;

public class EasyOver {
    public static void main(String[] args) {
        byte b = 5;
        short s = 5;
        long l = 5;
        float f = 5.0f;

        goOver(b);
        goOver(s);
        goOver(l);
        goOver(f);

        /**
         * In every case, when an exact match isn't found, the JVM uses the method with the
         * smallest argument that is wider than the parameter
         * */
    }
    static void goOver(int x){
        System.out.print("int ");
    }
    static void goOver(long x){
        System.out.print("long ");
    }
    static void goOver(double x){
        System.out.print("double ");
    }
}
