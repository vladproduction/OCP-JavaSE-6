package com.vladproduction.c03_assignments.passing_variables_into_methods;

public class ShadowingAsPrimitiveParameter {

    static int x = 1;
//    static int x = -1;
//    static int x;
    static void changeParam(int x){
        x = x + 200;
        System.out.println("invoke method changeParam(int x): x = " + x);
    }

    public static void main(String[] args) {

        ShadowingAsPrimitiveParameter shadowingParameter = new ShadowingAsPrimitiveParameter();
        System.out.println("before modify: x = " + x);

        changeParam(x);

        System.out.println("after modify: x = " + x);
    }
}


