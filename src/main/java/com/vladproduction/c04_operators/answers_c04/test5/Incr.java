package com.vladproduction.c04_operators.answers_c04.test5;

public class Incr {
    public static void main(String[] args) {
        Integer x = 7;
        int y = 2;

        x *= x; //x = x * x = 7 * 7 = 49
        y *= y; //y = y * y = 2 * 2 = 4
        y *= y; //y = y * y = 4 * 4 = 16
        x -= y; //x = x - y = 49 - 16 = 33

        System.out.println(x); //33
    }

    //y     y     y     y
    //y     x     x
    //-=    *=    *=    *=

}





