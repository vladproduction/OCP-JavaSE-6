package com.vladproduction.c05_control_flow_exceptions_assertions.if_switch;

public class Fall_through_switch {

    enum Color {RED, GREEN, BLUE}

    public static void main(String[] args) {
        Color color = Color.GREEN;
        //If break is omitted, the program just keeps executing the remaining case blocks until either a break is found or the
        //switch statement ends.
        switch (color){
            case RED:{
                System.out.println("red");}
            case GREEN:{
                System.out.println("green");}
            case BLUE:{
                System.out.println("blue");}
            default:{
                System.out.println("default color");}
        }
        System.out.println("---------------");
        //same here:
        int x = 1;
        switch(x) {
            case 1: System.out.println("x is one");
            case 2: System.out.println("x is two");
            case 3: System.out.println("x is three");
        }
        System.out.println("out of the switch");

        //break in action to exclude fall-through:
        System.out.println("------break action--------------");
        int y = 1;
        switch(y) {
            case 1: {
                System.out.println("y is one"); break;
            }
            case 2: {
                System.out.println("y is two"); break;
            }
            case 3: {
                System.out.println("y is three"); break;
            }
        }
        System.out.println("out of the switch");
    }
}
