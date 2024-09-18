package com.vladproduction.c07_generics_and_collections.collections.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class SearchObjectArray {
    public static void main(String[] args) {

        String [] sa = {"one", "two", "tree", "four"};
        Arrays.sort(sa);
        for (String s : sa) {
            System.out.print(s + " ");
        }
        System.out.println("\none = " + Arrays.binarySearch(sa, "one"));

        System.out.println("now reverse sort");
        ReSortComparator rs = new ReSortComparator();
        Arrays.sort(sa, rs);
        for (String s : sa) {
            System.out.print(s + " ");
        }
        System.out.println("\none = " + Arrays.binarySearch(sa, "one"));
        System.out.println("\none = " + Arrays.binarySearch(sa, "one", rs));//Search again, passing the Comparator to binarySearch().
                                                                                // This time we get the correct answer, 2

    }
    static class ReSortComparator implements Comparator<String>{ //Make a Comparator instance.
                                                                 // On the next line we re-sort the array using the Comparator.
        @Override
        public int compare(String o1, String o2) {
            return o2.compareTo(o1);
        }
    }

}
