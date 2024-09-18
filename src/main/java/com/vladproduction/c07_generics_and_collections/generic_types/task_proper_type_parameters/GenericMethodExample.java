package com.vladproduction.c07_generics_and_collections.generic_types.task_proper_type_parameters;

import java.util.List;

/**
 * provided of using generic method
 * */
public class GenericMethodExample {

    // A generic method that accepts a list and returns the first element
    public static <T> T getFirstElement(List<T> list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

}
