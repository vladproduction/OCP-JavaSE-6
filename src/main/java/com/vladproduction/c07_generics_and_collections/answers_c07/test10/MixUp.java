package com.vladproduction.c07_generics_and_collections.answers_c07.test10;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MixUp {
    public static void main(String[] args) {
        Object o = new Object();
        //insert code here(make one uncommented)

//        Set s = new HashSet();//I. no exception
//        TreeSet s = new TreeSet();//II. exception: ClassCasException (treeSet does not know how to compare Object and String)
        LinkedHashSet s = new LinkedHashSet();//III. no exception

        s.add("o");
        s.add(o);

    }
}

/*When fragments I, II, or III are inserted, independently, at line 7, which are true?
        (Choose all that apply.)
+A. Fragment I compiles
+B. Fragment II compiles
+C. Fragment III compiles
+D. Fragment I executes without exception
-E. Fragment II executes without exception
+F. Fragment III executes without exception*/

/*Answer:
        ✓ A, B, C, D, and F are all correct.
  Only E is incorrect. Elements of a TreeSet must in some way implement Comparable.
        (Objective 6.1)*/
