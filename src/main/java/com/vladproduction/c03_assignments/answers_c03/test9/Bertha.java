package com.vladproduction.c03_assignments.answers_c03.test9;

public class Bertha {
    static String s = "";

    public static void main(String[] args) {
        int x = 4;
        Boolean y = true;
        short[] sa = {1, 2, 3};
        doStuff(x, y); //2
        doStuff(x); //1
        doStuff(sa, sa);//2
        System.out.println(s);//2+1+2 = 212
        //answer: 'A'
    }

    static void doStuff(Object o) {
        s += "1";
    }

    static void doStuff(Object... o) {
        s += "2";
    }

    static void doStuff(Integer... i) {
        s += "3";
    }

    static void doStuff(Long L) {
        s += "4";
    }


}
