package com.vladproduction.c04_operators.answers_c04.test4;

public class Feline {
    public static void main(String[] args) {
        Long x = 42L;
        Long y = 44L;
        System.out.print(" " + 7 + 2 + " "); //72
        System.out.print(foo() + x + 5 + " "); //72 foo425
        System.out.println(x + y + foo());//72 foo425 86foo
        //answer: G
    }
    static String foo(){
        return "foo";
    }
}
