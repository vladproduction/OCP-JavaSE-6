package com.vladproduction.c02_object_orientation.overriding_overloading.runtime_compiletime;

public class MainApp {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.eat(); //Generic Animal Eating Generically

        Animal animal_horse = new Horse();
        animal_horse.eat(); //Horse eating hay
//        animal_horse.eat("Hay"); //compile error

        Horse horse2 = new Horse();
        horse2.eat(); //Horse eating hay
        horse2.eat("Hay"); //Horse eating: Hay
    }
}
