package com.vladproduction.c04_operators.assignment;

public class CompoundTest {
    public static void main(String[] args) {

        int y = 10;
        y = y - 6;
        //compound:
        y -= 6;
        System.out.println(y);

        int f = 1;
        f = f + 2 * 5;
        //compound:
        f += 2 * 5;
        System.out.println(f);


        //x = (x * 2) + 5; // incorrect precedence

        int x = 2;
        x = x * (2 + 5);
        System.out.println(x); //14
    }

}
