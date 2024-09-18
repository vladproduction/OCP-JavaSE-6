package com.vladproduction.c07_generics_and_collections.answers_c07.test3;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TestMain3 {
    public static void main(String[] args) {
        before(); //ClassCastException

    }

    static void before() {
        Set set = new TreeSet();
        set.add("2");
        set.add(3);
        set.add("1");
        Iterator it = set.iterator();
        while (it.hasNext())
            System.out.print(it.next() + " ");
    }
}

/*Answer:
        ✓ E is correct. You can't put both Strings and ints into the same TreeSet. Without generics,
the compiler has no way of knowing what type is appropriate for this TreeSet, so it allows
everything to compile. At runtime, the TreeSet will try to sort the elements as they're
added, and when it tries to compare an Integer with a String it will throw a
ClassCastException. Note that although the before() method does not use generics,
it does use autoboxing. Watch out for code that uses some new features and some old
features mixed together.
  A, B, C, and D are incorrect based on the above. (Objective 6.5)*/
