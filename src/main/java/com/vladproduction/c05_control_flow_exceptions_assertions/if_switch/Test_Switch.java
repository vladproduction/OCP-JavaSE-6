package com.vladproduction.c05_control_flow_exceptions_assertions.if_switch;

public class Test_Switch {
    public static void main(String[] args) {
        String s = "xyz";
        switch (s.length()) {
            case 1:
                System.out.println("length is one");
                break;
            case 2:
                System.out.println("length is two");
                break;
            case 3:
                System.out.println("length is three");
                break;
            default:
                System.out.println("no match");
        }

        //example of compile error #1:
        byte g = 2;
        switch(g) {
            case 23:
//            case 128: //value is bigger than byte capacity
        }

        //example of compile error #2:
        int temp = 90;
        switch(temp) {
            case 80 : System.out.println("80");
//            case 80 : System.out.println("80"); // won't compile! not available identical case name defining
            case 90 : System.out.println("90");
            default : System.out.println("default");
        }
    }
}
