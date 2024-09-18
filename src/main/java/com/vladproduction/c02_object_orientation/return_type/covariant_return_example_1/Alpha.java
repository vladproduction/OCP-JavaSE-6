package com.vladproduction.c02_object_orientation.return_type.covariant_return_example_1;

public class Alpha {

    Alpha doStuff(char x){
        return new Alpha();
    }

}
