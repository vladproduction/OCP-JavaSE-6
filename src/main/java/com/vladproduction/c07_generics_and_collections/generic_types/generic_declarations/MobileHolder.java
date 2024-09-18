package com.vladproduction.c07_generics_and_collections.generic_types.generic_declarations;

public class MobileHolder<T extends Mobile> {// use "T" instead of "?"
    T mobile;

    public static void main(String[] args) {
        MobileHolder<Mobile> mobileHolder = new MobileHolder<>(); // OK
//        MobileHolder<Integer> x = new MobileHolder<Integer>(); // NO!
    }

}
class Mobile{}
