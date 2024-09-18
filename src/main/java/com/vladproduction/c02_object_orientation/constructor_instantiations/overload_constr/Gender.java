package com.vladproduction.c02_object_orientation.constructor_instantiations.overload_constr;

public class Gender {
    private String gender;


    //constructor with args overloaded
    public Gender(String gender) {
        this.gender = gender;
    }

    //no args constructor overloaded (same as default)
    public Gender() {
    }
}
