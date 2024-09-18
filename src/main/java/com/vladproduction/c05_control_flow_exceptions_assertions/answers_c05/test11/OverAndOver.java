package com.vladproduction.c05_control_flow_exceptions_assertions.answers_c05.test11;

public class OverAndOver {
    static String s = "";

    public static void main(String[] args) {

        try {
            s += "1";
            throw new Exception();
        } catch (Exception e) {
            s += "2";
        } finally {
            s += "3";
            doStuff();
            s += "4";
        }
        System.out.println(s);

        //H. An exception is thrown with no other output

    }

    static void doStuff() {
        int x = 0;
        int y = 7 / x;
    }

}
