package com.vladproduction.c08_inner_classes.inner_classes;


/**
 * If we want to create an instance of the inner class, we must have
 * an instance of the outer class.
 * */
public class InstantiationOutsideOuter {
    public static void main(String[] args) {

        MyOuterClass mo = new MyOuterClass(); //  get an instanceof outer
        MyOuterClass.MyInnerClass inner = mo.new MyInnerClass(); //  instance inner
        inner.seeOuter();

        // or

        MyOuterClass.MyInnerClass inner2 = new MyOuterClass().new MyInnerClass();
    }
}
