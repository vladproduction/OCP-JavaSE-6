package com.vladproduction.c05_control_flow_exceptions_assertions.loops_iterators;

public class ScopeVariable {
    public static void main(String[] args) {

        int x = 3;
        for (x = 12; x < 20; x++) { }
        System.out.println(x);

        //while this is not
//        for (int x = 3; x < 20; x++) { } System.out.println(x);

    }
}
