package com.vladproduction.c07_generics_and_collections.collections.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertingArrayToList {
    public static void main(String[] args) {
        String [] arrStr = {"a", "b", "c", "d"};
        List<String> listStr = Arrays.asList(arrStr);
        System.out.println("list size: " + listStr.size());
        System.out.println("list index 2: " + listStr.get(2));

        //change list:
        listStr.set(3, "six");
        //change array:
        arrStr[1] = "five";

        //print arrStr:
        for (String s : arrStr) {
            System.out.print(s + " ");
        }
        //check the index '1' for list now:
        System.out.println("\nsl[1] " + listStr.get(1));

        System.out.println("--------------------------------------");
        /*Now let's take a look at the toArray() method. There's nothing too fancy going
        on with the toArray() method; it comes in two flavors: one that returns a new
        Object array, and one that uses the array you send it as the destination array:*/
        List<Integer> iL = new ArrayList<>();
        for(int x=0; x<3; x++)
            iL.add(x);
        Object[] oa = iL.toArray(); // create an Object array
        Integer[] ia2 = new Integer[3];
        ia2 = iL.toArray(ia2); // create an Integer array


    }
}
