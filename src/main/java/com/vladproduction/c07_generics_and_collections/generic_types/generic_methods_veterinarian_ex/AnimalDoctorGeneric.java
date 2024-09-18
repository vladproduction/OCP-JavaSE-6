package com.vladproduction.c07_generics_and_collections.generic_types.generic_methods_veterinarian_ex;

import java.util.ArrayList;
import java.util.List;

/**
 * version#1
 * provided code would not work (compiler error):
 * CANNOT assign the individual ArrayLists of Animal subtypes (<Dog>, <Cat>, or <Bird>) to an
 * ArrayList of the supertype <Animal>, which is the declared type of the argument;
 *
 * version#2
 * to get it around we could make more wide range parameter (List<Animal>) for method,
 * and build a common collection as List<Animals> with all included Dog, Cat and Bird
 * */
public class AnimalDoctorGeneric {
    public static void main(String[] args) {

//        version_1();
        version_2();

    }

    // version#1
    // change the argument from Animal[] to ArrayList<Animal>
    public void checkAnimals(ArrayList<Animal> animals) {
        for (Animal a : animals) {
            a.checkup();
        }
    }

    // version#2
    // change the argument from ArrayList<Animal> to List<Animal>
    public void checkAnimals(List<Animal> animals) {
        for (Animal a : animals) {
            a.checkup();
        }
    }

    private static void version_1() {
        // make ArrayLists instead of arrays for Dog, Cat, Bird
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat());
        cats.add(new Cat());
        List<Bird> birds = new ArrayList<>();
        birds.add(new Bird());
        // this code is the same as the Array version
        AnimalDoctorGeneric doc = new AnimalDoctorGeneric();
        // this worked when we used arrays instead of ArrayLists
        /*doc.checkAnimals(dogs); // send a List<Dog>
        doc.checkAnimals(cats); // send a List<Cat>
        doc.checkAnimals(birds); // send a List<Bird>*/
    }

    private static void version_2() {
        // make List<Animal> instead of Lists of different types
        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Cat());
        animals.add(new Bird());
        AnimalDoctorGeneric doc = new AnimalDoctorGeneric();
        doc.checkAnimals(animals);
    }
}
