package com.vladproduction.c02_object_orientation.answers_c02.test15;

public class ComingThru {
    static String s = "-";
    public static void main(String[] args) {
        A[] aa = new A[2];
        B[] ba = new B[2];
         sifter(aa); //-4
         sifter(ba); //-43
         sifter(7); //-434
         System.out.println(s);
    }

    static void sifter(A[]... a2) { s += "1"; }
    static void sifter(B[]... b1) { s += "2"; }
    static void sifter(B[] b1) { s += "3"; }
    static void sifter(Object o) { s += "4"; }

}
