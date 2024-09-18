package com.vladproduction.c08_inner_classes.inner_classes;

public class InstantiationWithinOuter {

    private int x = 7;
    public void makeInner() {
        MyInner in = new MyInner(); // make an inner instance
        in.seeOuter();
    }

    class MyInner {
        public void seeOuter() {
            System.out.println("Outer x is " + x);
        }
    }
}
