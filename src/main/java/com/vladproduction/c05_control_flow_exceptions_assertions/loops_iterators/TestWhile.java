package com.vladproduction.c05_control_flow_exceptions_assertions.loops_iterators;

public class TestWhile {
    public static void main(String[] args) {
        int x = 1;
//        while (x) { } // Won't compile; x is not a boolean
//        while (x = 5) { } // Won't compile; resolves to 5 (as the result of assignment)
        while (x == 5) { } // Legal, equality test
        while (true) { } // Legal
    }
}
