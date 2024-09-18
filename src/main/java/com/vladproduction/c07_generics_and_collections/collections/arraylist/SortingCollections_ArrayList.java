package com.vladproduction.c07_generics_and_collections.collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingCollections_ArrayList {
    public static void main(String[] args) {
        List<String> stuff = new ArrayList<>(); // #1
        stuff.add("Denver");
        stuff.add("Boulder");
        stuff.add("Vail");
        stuff.add("Aspen");
        stuff.add("Telluride");
        System.out.println("unsorted " + stuff);
        Collections.sort(stuff); // #2
        System.out.println("sorted " + stuff);
    }
}
