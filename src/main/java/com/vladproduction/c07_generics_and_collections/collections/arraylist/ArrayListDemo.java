package com.vladproduction.c07_generics_and_collections.collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        /*  ■ It can grow dynamically.
            ■ It provides more powerful insertion and search mechanisms than arrays*/

        //some capabilities:
        List<String> test = new ArrayList<>();
        String s = "hi";
        test.add("string");
        test.add(s);
        test.add(s+s);
        System.out.println(test.size());
        System.out.println(test.contains(42));
        System.out.println(test.contains("hihi"));
        test.remove("hi");
        System.out.println(test.size());

        //autoboxing with collections:
        List list = new ArrayList(); // pre Java 5 declaration
        list.add(42);   //we are still adding an Integer object to list (not an int primitive);
                        // had to wrap an int
    }
}
