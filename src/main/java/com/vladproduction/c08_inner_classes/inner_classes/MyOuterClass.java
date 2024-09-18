package com.vladproduction.c08_inner_classes.inner_classes;

public class MyOuterClass {
    private int x = 7;

    // inner class definition
    class MyInnerClass{
        public void seeOuter() {
            System.out.println("Outer x is " + x);
        }
    }

}
