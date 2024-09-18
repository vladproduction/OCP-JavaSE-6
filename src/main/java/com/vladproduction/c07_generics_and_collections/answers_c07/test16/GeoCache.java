package com.vladproduction.c07_generics_and_collections.answers_c07.test16;

import java.util.Arrays;
import java.util.Comparator;

public class GeoCache {
    public static void main(String[] args) {
        String[] s = {"map", "pen", "marble", "key"};
        Othello o = new Othello();
        Arrays.sort(s, o);
        for (String s2 : s)
            System.out.print(s2 + " ");//sorted: pen marble map key
        System.out.println();
        System.out.println(Arrays.binarySearch(s, "pen")); //-5
        /*performs a binary search for the string "pen" in the sorted array.
        However, the result of the search will depend on the specific sorting order and the method.
        Given that the sorted order is descending, the implementation of the binary search will
        return an index based on the original (unsorted) positions.

        will be -5, indicating that "pen" was found at index 0 of the sorted array as per the rules of binarySearch.
        The result is usually negated to indicate its presence at the expected position plus one, resulting in the output -5.*/

        /*sorted order after [pen, map, marble, key]
            Binary Search (step-by-step):
        The line Arrays.binarySearch(s, "pen");
        The binarySearch method performs a search in the sorted version of the array s for the string "pen".
        If the string is found at index 0, the binary search returns the negative of the index minus one,
        hence - (index + 1), resulting in - (0 + 1) = -1.
        Since binarySearch uses the natural order and criteria used to sort the array, it does not properly function with the custom comparator being used.
        The position is based on order determined by the alphabetical sorting.
        Therefore, if "pen" should be found at index 2 or index 1 of the sorted array by the natural order, following the logic it returns -5.*/

        /*This indicates that "pen" was not found based on the natural ordering,
        reflecting that it actually would be in the 5th spot of the original list of sorted items if you consider 1-based indexing.*/

    }

    /*implements the Comparator<String> interface.
    The compare method compares two strings in reverse order (i.e., in descending lexicographic order) because it uses b.compareTo(a).*/
    static class Othello implements Comparator<String> {
        public int compare(String a, String b) {
            return b.compareTo(a);
        }
    }
}

/*Which are true? (Choose all that apply.)
A. Compilation fails
B. The output will contain a 1
C. The output will contain a 2
D. The output will contain a –1
E. An exception is thrown at runtime
F. The output will contain "key map marble pen"
+G. The output will contain "pen marble map key"*/

/*Answer:
        ✓ D and G are correct. First, the compareTo() method will reverse the normal sort.
Second, the sort() is valid. Third, the binarySearch() gives –1 because it needs to be
invoked using the same Comparator (o), as was used to sort the array. Note that when the
binarySearch() returns an "undefined result" it doesn’t officially have to be a -1, but it
        usually is, so if you selected only G, you get full credit!
         A, B, C, E, and F are incorrect based on the above. (Objective 6.5)*/
