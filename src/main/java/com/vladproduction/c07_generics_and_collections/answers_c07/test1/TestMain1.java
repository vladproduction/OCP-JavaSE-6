package com.vladproduction.c07_generics_and_collections.answers_c07.test1;

import java.util.ArrayList;
import java.util.List;


public class TestMain1 {
    public static void main(String[] args) {
        // INSERT DECLARATION HERE
        List<List<Integer>> table = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= 10; j++)
                row.add(i * j);
            table.add(row);
        }
        for (List<Integer> row : table)
            System.out.println(row);
    }
}

/*Which statements could be inserted at // INSERT DECLARATION HERE to allow this code to
compile and run? (Choose all that apply.)
-A. List<List<Integer>> table = new List<List<Integer>>();
+B. List<List<Integer>> table = new ArrayList<List<Integer>>();
-C. List<List<Integer>> table = new ArrayList<ArrayList<Integer>>();
-D. List<List, Integer> table = new List<List, Integer>();
-E. List<List, Integer> table = new ArrayList<List, Integer>();
-F. List<List, Integer> table = new ArrayList<ArrayList, Integer>();
-G. None of the above*/

/*Answer:
        ✓ B is correct.
  A is incorrect because List is an interface, so you can't say new List() regardless of
any generic types. D, E, and F are incorrect because List only takes one type parameter
        (a Map would take two, not a List). C is tempting, but incorrect. The type argument
<List<Integer>> must be the same for both sides of the assignment, even though the
constructor new ArrayList() on the right side is a subtype of the declared type List on
the left. (Objective 6.4)*/

