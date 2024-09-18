package com.vladproduction.c02_object_orientation.overriding_overloading.object_as_param_in_overloaded_method;

public class UseAnimals {

    public void doStuff(Animal animal){
        System.out.println("Animal doStuff()");
    }

    public void doStuff(Horse horse){
        System.out.println("Horse doStuff()");
    }
}
