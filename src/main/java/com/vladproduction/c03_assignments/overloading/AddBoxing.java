package com.vladproduction.c03_assignments.overloading;

public class AddBoxing {

    static void go(int x){
        System.out.println("Integer...");
    }
    static void go(Integer x){
        System.out.println("Integer...");
    }
    static void go(long x){
        System.out.println("Long...");
    }

    static void go(Long x){
        System.out.println("Long...");
    }

    public static void main(String[] args) {
        int x = 5;
        go(x);
        go((long)x);
    }

    /**
     * Does the compiler think that widening a primitive
     * parameter is more desirable than performing an autoboxing operation?
     * The answer is that the compiler will choose widening over boxing;
     **/

}
