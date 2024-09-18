package com.vladproduction.c02_object_orientation.overriding_overloading.example1_animal;

public class MainAnimalApp {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();

        System.out.println("animal = " + animal.sound());
        System.out.println("dog = " + dog.sound());

        //upcasting:
        Animal otherAnimal = new Dog();
        System.out.println("otherAnimal = " + otherAnimal.sound()); // Dog.sound(): woof.
    }
}
