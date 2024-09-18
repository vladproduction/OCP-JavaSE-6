package com.vladproduction.c07_generics_and_collections.generic_types.task_proper_type_parameters;


/**
 * interface implementation
 * */
public class GenericInterfaceImpl<K, V> implements GenericInterface<K, V> {

    private K key;
    private V value;

    public GenericInterfaceImpl(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }
}
