package com.vladproduction.c02_object_orientation.reference_variable_casting;

public class MainClassAB {
    public static void main(String[] args) {
        ClassB b = new ClassB();
        ClassA a1 = b; // upcast ok with no explicit cast
        ClassA a2 = (ClassA) b; // upcast ok with an explicit cast

    }
}
