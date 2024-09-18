package com.vladproduction.c02_object_orientation.overriding_overloading.object_as_param_in_overloaded_method;

public class MainApp {
    public static void main(String[] args) {

        Animal animal = new Animal();
        Horse horse = new Horse();
        UseAnimals ua = new UseAnimals();

        ua.doStuff(animal); //Animal doStuff()
        ua.doStuff(horse); //Horse doStuff()

        //---------- special case---------------
        /**
         * the reference
         * type (not the object type) determines which overloaded method is invoked!
         * */
        Animal animalRefToHorse = new Horse();
        ua.doStuff(animalRefToHorse); //Animal doStuff()

    }
}
