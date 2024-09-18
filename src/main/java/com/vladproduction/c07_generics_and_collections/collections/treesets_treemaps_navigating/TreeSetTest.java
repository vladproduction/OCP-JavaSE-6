package com.vladproduction.c07_generics_and_collections.collections.treesets_treemaps_navigating;

import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {

        /*Imagine that the Santa Cruz–Monterey ferry has an irregular schedule. Let's
        say that we have the daily Santa Cruz departure times stored, in military time, in a
        TreeSet. Let's look at some code that determines two things:
        1. The last ferry that leaves before 4 (1600 hours)
        2. The first ferry that leaves after 8 (2000 hours)*/

        TreeSet<Integer> times = new TreeSet<>();
        times.add(1205); // add some departure times
        times.add(1505);
        times.add(1545);
        times.add(1830);
        times.add(2010);
        times.add(2100);

        // Java 5 version (used SortedSet)
        TreeSet<Integer> subset;
        subset = (TreeSet<Integer>) times.headSet(1600);
        System.out.println("Java5 - last before 4pm is: " + subset.last());

        TreeSet<Integer> sub2;
        sub2 = (TreeSet)times.tailSet(2000);
        System.out.println("Java5 - first after 8pm is: " + sub2.first());

        // Java 6 version using the new lower() and higher() methods from NavigableSet
        System.out.println("Java6 - last before 4pm is: " + times.lower(1600));
        System.out.println("Java6 - first after 8pm is: " + times.higher(2000));

    }
}
