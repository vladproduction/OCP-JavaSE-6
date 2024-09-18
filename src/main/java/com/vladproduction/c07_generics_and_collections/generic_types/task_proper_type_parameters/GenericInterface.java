package com.vladproduction.c07_generics_and_collections.generic_types.task_proper_type_parameters;

/**
 * define a generic interface by using type parameters
 * */
public interface GenericInterface<K, V> {

    K getKey();
    V getValue();

}
