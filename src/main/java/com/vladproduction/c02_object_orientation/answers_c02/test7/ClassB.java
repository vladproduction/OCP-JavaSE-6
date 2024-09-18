package com.vladproduction.c02_object_orientation.answers_c02.test7;


/**
 *  Weak encapsulation in ClassB due to public variables
 * */
public class ClassB {

    public int someValue = 10; // Directly exposing internal data

    public void doSomethingWithInternalData() {
        System.out.println("Doing something with " + someValue);
    }

}
