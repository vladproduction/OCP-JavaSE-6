package com.vladproduction.c04_operators.answers_c04.test3;

public class Fork {
    public static void main(String[] args) {
        if(args.length == 1 | args[1].equals("test")) {
            System.out.println("test case");
        } else {
            System.out.println("production " + args[0]);
        }
        //E. An exception is thrown at runtime
    }
}
