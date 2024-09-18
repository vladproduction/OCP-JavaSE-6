package com.vladproduction.c05_control_flow_exceptions_assertions.loops_iterators;

public class ForArray {
    public static void main(String[] args) {
        int [] a = {1,2,3,4};
        for(int x = 0; x < a.length; x++) // basic for loop
            System.out.print(a[x]);
        for(int n : a) // enhanced for loop
            System.out.print(n);
    }
}
