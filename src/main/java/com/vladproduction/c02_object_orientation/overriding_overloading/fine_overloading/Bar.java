package com.vladproduction.c02_object_orientation.overriding_overloading.fine_overloading;

public class Bar extends Foo{

    //overloading example method
    public void doStuff(int x, String  y) throws IllegalArgumentException {
        System.out.println("doStuff(int x, String  y) throws IllegalArgumentException from class Bar.");

        /**
         * It's tempting to see the IllegalArgumentException as the problem, because the
         * overridden doStuff() method doesn’t declare an exception, and IllegalArgumentException is checked
         * by the compiler. But the doStuff() method is not overridden! Subclass Bar overloads the
         * doStuff() method, by varying the argument list, so the IOException is fine.
         * */
    }
}
