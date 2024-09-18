package com.vladproduction.c07_generics_and_collections.generic_types.task_genric_list_set_map;

import java.util.Vector;

public class NonGenericCollection {
    public static void main(String[] args) {
        Vector vector = new Vector();

        vector.add("Hello");
        vector.add(123); // This is allowed, but it's unsafe

        for (Object obj : vector) {
            String str = (String) obj; // Might throw ClassCastException
            System.out.println(str);
        }
    }
}
