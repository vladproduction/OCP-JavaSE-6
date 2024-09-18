package com.vladproduction.c03_assignments.overloading;

import java.util.Arrays;

public class AddVarargs {

    static void go(int x, int y){
        System.out.println("go(int x, int y): " + x + "; " + y);
    }
    static void go(byte... x){
        System.out.println("go(byte... x): " + Arrays.toString(x));
    }

    public static void main(String[] args) {
        byte b = 5;
        go(b, b);
        System.out.println("------------");
        go(b);
    }

    /**
     *  ■ Widening beats boxing
     *  ■ Widening beats var-args
     * */
}
