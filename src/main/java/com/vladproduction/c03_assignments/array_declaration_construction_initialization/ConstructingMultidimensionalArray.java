package com.vladproduction.c03_assignments.array_declaration_construction_initialization;

import java.util.Arrays;

public class ConstructingMultidimensionalArray {
    public static void main(String[] args) {

        //two-dimensional array of type int:
        int[][] myArray = new int[3][];
        myArray[0] = new int[2];
        myArray[0][0] = 6;
        myArray[0][1] = 7;
        myArray[1] = new int[3];
        myArray[1][0] = 9;
        myArray[1][1] = 8;
        myArray[1][2] = 5;
        myArray[2] = new int[1];
        myArray[2][0] = 23;

        for (int i = 0; i < myArray.length; i++) {
            System.out.println(Arrays.toString(myArray[i]));
        }

    }
}
