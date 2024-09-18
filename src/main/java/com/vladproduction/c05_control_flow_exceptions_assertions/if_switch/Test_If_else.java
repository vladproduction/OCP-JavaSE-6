package com.vladproduction.c05_control_flow_exceptions_assertions.if_switch;

public class Test_If_else {
    public static void main(String[] args) {

        //no break example
        int a = 3;
        switch (a) {
            case 1:
                System.out.println("a is equal to 1");
            case 2:
                System.out.println("a is equal to 2");
            case 3:
                System.out.println("a is equal to 3");
            default:
                System.out.println("Still no idea what a is");
        }

        System.out.println("--------------");
        //break in action
        int x = 3;
        switch (x) {
            case 1:
                System.out.println("x is equal to 1");
                break;
            case 2:
                System.out.println("x is equal to 2");
                break;
            case 3:
                System.out.println("x is equal to 3");
                break;
            default:
                System.out.println("Still no idea what x is");
        }
    }

}
