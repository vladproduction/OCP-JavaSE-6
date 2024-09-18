package com.vladproduction.c03_assignments.answers_c03.test3;

public class Dims {
    public static void main(String[] args) {
        int[][] a = {{1,2,}, {3,4}};
        int[] b = (int[]) a[1];
        Object o1 = a;
        int[][] a2 = (int[][]) o1;
        int[] b2 = (int[]) o1; //ClassCastException, must be in[][] casting type
        System.out.println(b[1]);

        //exception on Runtime
        //answer 'C'
    }
}
