package com.vladproduction.c04_operators.logical;

public class NonShortCircuit {
    public static void main(String[] args) {
        //they evaluate both sides of the expression, always!

        //short-circuit vs not short-circuit:

        //evaluate first part of expression and if needed the second part
        //so on this case second one skipped and give us '7'
        int z = 5;
        if(++z > 5 || ++z > 6) z++;
        System.out.println("z = " + z);// z = 7 after this code

        //the full flow here in if statement(both parts are evaluating)
        //we got '8'
        int y = 5;
        if(++y > 5 | ++y > 5) y++; //y = 8
        System.out.println("y = " + y);

    }
}
