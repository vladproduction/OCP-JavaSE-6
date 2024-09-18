package com.vladproduction.c04_operators.answers_c04.test1;

public class Hex {
    public static void main(String[] args) {
        Integer i = 42;
        String s = (i<40)?"life":(i>50)?"universe":"everything";
        System.out.println(s); // everything
        //answer: D
    }
}
