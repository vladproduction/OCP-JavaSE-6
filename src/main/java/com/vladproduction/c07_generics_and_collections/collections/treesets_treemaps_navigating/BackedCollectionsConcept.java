package com.vladproduction.c07_generics_and_collections.collections.treesets_treemaps_navigating;

import java.util.SortedMap;
import java.util.TreeMap;

public class BackedCollectionsConcept {
    public static void main(String[] args) {

        TreeMap<String, String> map = new TreeMap<>();
        map.put("a", "ant");
        map.put("d", "dog");
        map.put("h", "horse");

        SortedMap<String, String> submap;
        submap = map.subMap("b", "g"); // #1 create a backed collection
        System.out.println(map + " " + submap); // #2 show contents

        //add more data:
        map.put("b", "bat"); // #3 add to original
        submap.put("f", "fish"); // #4 add to copy

        map.put("r", "raccoon"); // #5 add to original - out of range
//        submap.put("p", "pig"); // #6 add to copy - out of range
        System.out.println(map + " " + submap); // #7 show final contents
    }
}
