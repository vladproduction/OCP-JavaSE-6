package com.vladproduction.c07_generics_and_collections.generic_types.task_proper_type_parameters;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapExample {
    public static void main(String[] args) {

        NavigableMap<String, Integer> navigableMap = new TreeMap<>();
        navigableMap.put("One", 1);
        navigableMap.put("Two", 2);
        navigableMap.put("Three", 3);

        System.out.println("Navigable Map: " + navigableMap);
        System.out.println("Lower than 'Two': " + navigableMap.lowerEntry("Two"));
        System.out.println("Higher than 'One': " + navigableMap.higherEntry("One"));

    }
}

