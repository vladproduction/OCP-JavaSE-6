package com.vladproduction.c04_operators.arithmetics;

public class MixingOperators {
    public static void main(String[] args) {
        int x = 2;
        int y = 3;
        if((y == x++) | (x < ++y)){ //this expression has to be true to printing
            System.out.println("x = " + x + " y = " + y);
        }
    }
}
