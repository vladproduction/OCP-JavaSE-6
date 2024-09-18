package com.vladproduction.c03_assignments.array_declaration_construction_initialization;

import java.util.Arrays;

public class OneLineDeclarationConstructingInitializing {
    public static void main(String[] args) {

        //primitives
        int x = 20;
        int [] arr = {10, x, 30};

        System.out.println(Arrays.toString(arr));

        /**
         * The size (length of the array) is determined by the number of comma-separated
         * items between the curly braces
         * */

        //Objects
        Pet pet1 = new Pet("pet1");
        Pet pet3 = new Pet("pet3");
        Pet [] pets = {pet1, new Pet("pet2"), pet3};
        for (int i = 0; i < pets.length; i++) {
            System.out.print(pets[i] + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(pets));

        //multidimensional of primitives
        int[][] scores = {{5,2,4,7}, {9,2}, {3,4}};
    }
}

class Pet{

    String name;

    public Pet(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
