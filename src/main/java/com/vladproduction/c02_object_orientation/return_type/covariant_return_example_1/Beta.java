package com.vladproduction.c02_object_orientation.return_type.covariant_return_example_1;

public class Beta extends Alpha{

    /**
     * allowed to change the return type in the
     * overriding method as long as the new return type is a subtype of the declared return
     * type of the overridden (superclass) method.
     * */
    Beta doStuff(char y) {
        return new Beta();
    }
}
