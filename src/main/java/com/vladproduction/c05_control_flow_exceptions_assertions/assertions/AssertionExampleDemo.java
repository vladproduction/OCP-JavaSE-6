package com.vladproduction.c05_control_flow_exceptions_assertions.assertions;

public class AssertionExampleDemo {
    public static void main(String[] args) {

        int numb = 5;
        assert numb > 0: "number must be greater '0'";
        System.out.println("square of number: " + square(numb));

    }

    public static int square(int side){
        assert side >= 0: "side must be positive and bigger '0'";
        return side * side;
    }
}
