package com.vladproduction.c07_generics_and_collections.generic_types.task_proper_type_parameters;

/**
 * define a generic class by using type parameters
 * */
public class GenericBox<T> {

    private T context;

    public T getContext() {
        return context;
    }

    public void setContext(T context) {
        this.context = context;
    }
}
