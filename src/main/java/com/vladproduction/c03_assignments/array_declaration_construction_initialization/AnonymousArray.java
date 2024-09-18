package com.vladproduction.c03_assignments.array_declaration_construction_initialization;

import java.util.Arrays;

public class AnonymousArray {
    public static void main(String[] args) {

        anonymousArraySorted(new int[] {1,23,6,5,77});


    }

    private static void anonymousArraySorted(int [] arr){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
