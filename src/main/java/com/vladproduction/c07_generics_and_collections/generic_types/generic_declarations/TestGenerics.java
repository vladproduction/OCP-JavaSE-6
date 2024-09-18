package com.vladproduction.c07_generics_and_collections.generic_types.generic_declarations;

public class TestGenerics<T> { //class type

    T anInstance; //instance variable
    T [] anArrayOfTs; //as an array type

    TestGenerics(T anInstance) { // as an argument type
        this.anInstance = anInstance;
    }

    T getT() {
        return anInstance; //as a return type
    }
}
