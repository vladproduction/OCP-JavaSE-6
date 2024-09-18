package com.vladproduction.c05_control_flow_exceptions_assertions.loops_iterators;

public class MultipleVariablesInLoop {
    public static void main(String[] args) {


        for (int i = 0,j = 0; (i<10) && (j<10); i++, j++) {
            System.out.println("i is " + i + " j is " +j);
        }

    }
}
