package com.vladproduction.c03_assignments.answers_c03.test5;

public class Fizz {
    int x = 5;

    public static void main(String[] args) {
        final Fizz f1 = new Fizz();
        Fizz f2 = new Fizz();
        Fizz f3 = fizzSwitch(f1,f2);
        System.out.println((f1 == f3) + " " + (f1.x == f3.x)); //true true
        System.out.println("=========");
        System.out.println("f1.x = " + f1.x);
        System.out.println("f3.x = " + f3.x);

    }
    static Fizz fizzSwitch(Fizz x, Fizz y){
        final Fizz z = x;
        z.x = 6;
        return z;
    }
}
