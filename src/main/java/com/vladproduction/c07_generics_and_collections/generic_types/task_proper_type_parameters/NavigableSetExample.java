package com.vladproduction.c07_generics_and_collections.generic_types.task_proper_type_parameters;

import java.util.TreeSet;

public class NavigableSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> navigableSet = new TreeSet<>();

        navigableSet.add(10);
        navigableSet.add(20);
        navigableSet.add(30);

        //print set content:
        System.out.println("Navigable Set: " + navigableSet); //Navigable Set: [10, 20, 30]

        //lower() and higher() methods from NavigableSet
        System.out.println("Lower than 25: " + navigableSet.lower(25)); //20
        System.out.println("Higher than 25: " + navigableSet.higher(25)); //30

    }
}
