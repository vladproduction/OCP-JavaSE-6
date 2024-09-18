package com.vladproduction.c03_assignments.wrappers_classes_boxing;

public class Autoboxing {
    public static void main(String[] args) {

        Integer x = 567;
        Integer y = x;

        System.out.println(y == x);  // true expected; verify that they`re referring to same memory location

        y++; //unwrap (or re-wrapping)
        System.out.println(x + " " + y); //567 568
        System.out.println(y == x); //false expected

    }
}
