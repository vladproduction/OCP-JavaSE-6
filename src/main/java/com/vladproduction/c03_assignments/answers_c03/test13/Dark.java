package com.vladproduction.c03_assignments.answers_c03.test13;

public class Dark {
    int x = 3;

    public static void main(String[] args) {
        new Dark().go1();
    }

    void go1() {
        int x;
//        go2(++x);//compilation fails --> 'E'
    }

    void go2(int y) {
        int x = ++y;
        System.out.println(x);
    }
}
