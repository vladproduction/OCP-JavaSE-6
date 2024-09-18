package com.vladproduction.c07_generics_and_collections.generic_types.generic_methods_veterinarian_ex;

/**
 * in case of array declared as param for the method:
 * array can actually HOLD—in this case, any
 * subtype of Animal
 * */
public class AnimalDoctor {
    public static void main(String[] args) {
        //testing :
        Dog[] dogs = {new Dog(), new Dog()};
        Cat[] cats = {new Cat(), new Cat(), new Cat()};
        Bird[] birds = {new Bird()};
        AnimalDoctor doc = new AnimalDoctor();
        doc.checkAnimals(dogs); // pass the Dog[]
        doc.checkAnimals(cats); // pass the Cat[]
        doc.checkAnimals(birds); // pass the Bird[]

    }

    //polymorphic method:
    public void checkAnimal(Animal a) {
        a.checkup(); // does not matter which animal subtype each
        // Animal's overridden checkup() method runs
    }

    /*we don't want overloaded methods with arrays for each potential Animal
    subtype, so we use polymorphism in the AnimalDoctor class:*/
    public void checkAnimals(Animal[] animals) {
        for(Animal a : animals) {
            a.checkup();
        }
    }

}
