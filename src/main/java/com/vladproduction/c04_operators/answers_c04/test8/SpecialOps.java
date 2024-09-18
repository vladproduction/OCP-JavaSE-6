package com.vladproduction.c04_operators.answers_c04.test8;

public class SpecialOps {
    public static void main(String[] args) {
        String s = "";
        Boolean b1 = true;
        Boolean b2 = false;

        if((b2 = false) | (21 % 5) > 2) { //false | false
            s += "x"; //no action
        }

        if(b1 || (b2 == true)) { //true || true (but it`s enough only one true -> short-circuit)
            s += "y"; //so action here
        }

//        System.out.println(b2);
        if(b2 == true) { //Here, b2 is still false, so (b2 == true) evaluates to false.
                         //since condition inside if block give false, statement does not execute
            s += "z";
        }
        //at the end we have:
        System.out.println(s); // y
        //answer: C
    }
}
