package com.vladproduction.c07_generics_and_collections.generic_types.task_genric_list_set_map;

import java.util.*;

public class GenericCollection {
    public static void main(String[] args) {

        //List
        List<String> list = new ArrayList<>();
        list.add("Hello");
        // list.add(123); // This will cause a compile-time error
        for (String str : list) {
            System.out.println(str);
        }

        //Set
        Set<String> set = new HashSet<>();
        set.add("World");
        // set.add(456); // This will cause a compile-time error
        for (String str : set) {
            System.out.println(str);
        }

        //Map
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("tree", 3);
        // map.put(4, "Four"); // This will cause a compile-time error
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


    }
}
