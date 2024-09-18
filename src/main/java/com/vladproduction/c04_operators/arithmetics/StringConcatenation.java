package com.vladproduction.c04_operators.arithmetics;

public class StringConcatenation {
    public static void main(String[] args) {
        String a = "String";
        int b = 3;
        int c = 7;
        System.out.println(a + b + c); //String37

        //but if add parentheses:
        System.out.println(a + (b + c)); //String10

        /*  If either operand is a String, the + operator becomes a String concatenation
            operator. If both operands are numbers, the + operator is the addition operator.
        */

        /*it's legal to mush together the compound additive
        operator (+=) and Strings, like so:*/
        String s = "123";
        s += "45";
        s += 67;
        System.out.println(s);

        //so we can see the difference of incoming data flow:
        int u = 2;
        System.out.println("" + u + 3);
//        which prints 23
//        but if the print statement changes to
        System.out.println(u + 3);
//        then the result becomes 5
    }
}
