package com.vladproduction.c02_object_orientation.return_type.overload_method;

public class ClassBoo extends ClassFoo{

    /**
     * legal to overload method from superclass,
     * in case we change the parameters as well;
     * */
    int go(int x) {
        return x;
    }
}
