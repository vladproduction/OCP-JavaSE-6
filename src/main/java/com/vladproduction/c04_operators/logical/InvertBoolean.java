package com.vladproduction.c04_operators.logical;

public class InvertBoolean {
    public static void main(String[] args) {

        //1)
        if(!(7 == 5)) {
            System.out.println("not equal");
        }

        //2)
        boolean t = true;
        boolean f = false;
        System.out.println("! " + (t & !f) + " " + f);
        /*the & test succeeded (printing true), and
        that the value of the boolean variable f did not change, so it printed false.*/
    }
}
