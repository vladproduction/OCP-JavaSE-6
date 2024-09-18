package com.vladproduction.c05_control_flow_exceptions_assertions.loops_iterators;

public class AbruptlyTerminatedLoop {
    public static void main(String[] args) {
        doStuff(); //in for loop
    }
    static boolean doStuff() {
        for (int x = 0; x < 3; x++) {
            System.out.println("in for loop");
            return true;
        }
        return true;
    }
}
