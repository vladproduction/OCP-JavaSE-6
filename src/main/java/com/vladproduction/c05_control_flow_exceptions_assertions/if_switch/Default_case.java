package com.vladproduction.c05_control_flow_exceptions_assertions.if_switch;

public class Default_case {
    public static void main(String[] args) {
//        int x = 8; //as even
        int x = 7; //as odd
        switch (x) {
            case 2:
            case 4:
            case 6:
            case 8:
            case 10: {
                System.out.println("x is an even number");
                break;
            }
            default: System.out.println("x is an odd number");
        }

        System.out.println("-----------------------");
        //default does not have to be at the end, could be in the middle of cases:
        //but not good practice in my point:
        int y = 2;
        switch (y) {
            case 2: System.out.println("2");
            default: System.out.println("default");
            case 3: System.out.println("3");
            case 4: System.out.println("4");
        }
    }
}
