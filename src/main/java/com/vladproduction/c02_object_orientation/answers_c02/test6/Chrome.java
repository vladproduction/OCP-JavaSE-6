package com.vladproduction.c02_object_orientation.answers_c02.test6;

public class Chrome {
    public static void main(String[] args) {
        X x1 = new X();
        X x2 = new Y();
        Y y = new Y();

        //A - no
        //x2.do2();

        //B - no
        //(Y)x2.do2();

        //C - YES
        ((Y) x2).do2();

        //D - no
        //None of the above statements will compile
    }
}
