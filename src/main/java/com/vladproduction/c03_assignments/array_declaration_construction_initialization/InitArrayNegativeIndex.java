package com.vladproduction.c03_assignments.array_declaration_construction_initialization;

public class InitArrayNegativeIndex {
    public static void main(String[] args) {

        int [] arr1 = new int[3];
        arr1[0] = 10;
        arr1[2] = 10;
//        arr1[4] = 10; //ArrayIndexOutOfBoundsException (no index '4' in current array)

        int [] arr2 = new int[3];
        int y = -4;
//        arr2[y] = 23; //ArrayIndexOutOfBoundsException: Index -4 out of bounds for length 3

    }
}
