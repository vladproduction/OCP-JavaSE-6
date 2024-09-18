package com.vladproduction.c07_generics_and_collections.generic_types;

import java.util.ArrayList;
import java.util.List;

public class Cast_or_NotCast {
    public static void main(String[] args) {

        List test = new ArrayList();
        test.add(43);
        int x = (Integer)test.get(0); // you must cast !!

        List<Integer> test2 = new ArrayList<Integer>();
        test2.add(343);
        int x2 = test2.get(0); // cast not necessary
    }
}
