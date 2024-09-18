package com.vladproduction.c01_declarations_and_access_control.enum_example.ex3;

public class Position {
    public static void main(String[] args) {

        System.out.println(ONE);

    }

    //constructor to build Position clas object
    public Position(String enumName, int enumIndex) {
        System.out.println("constructor is in act now.");
    }

    public static final Position ONE = new Position("ONE", 0);
    public static final Position TWO = new Position("TWO", 1);
    public static final Position THREE = new Position("Three", 2);


}
