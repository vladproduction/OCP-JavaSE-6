package com.vladproduction.c02_object_orientation.overriding_overloading.runtime_compiletime;

public class Horse extends Animal{

    @Override
    public void eat() {
        System.out.println("Horse eating hay");
    }

    //Overloaded
    public void eat(String s){
        System.out.println("Horse eating: " + s);
    }
}
