package com.vladproduction.c02_object_orientation.overriding_overloading.example1_animal;

public class Dog extends Animal{

    @Override
    public String sound() {
        return "Dog.sound(): woof.";
    }
}
