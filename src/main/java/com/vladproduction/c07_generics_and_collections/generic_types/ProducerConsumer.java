package com.vladproduction.c07_generics_and_collections.generic_types;

import java.util.ArrayList;
import java.util.List;

/**
 * Producer: You can get (produce) Dog or its subclasses from List<? extends Dog>.
 * Consumer: You cannot add (consume) any Dog or its subclasses to List<? extends Dog> without getting a compile-time error.
 * This is why we refer to List<? extends Dog> as a producer type in the context of the producer-consumer principle in generics.
 * */
public class ProducerConsumer {
    public static void main(String[] args) {

        List<Puppy> puppies = new ArrayList<>();
        puppies.add(new Puppy());

        // This is valid: Retrieving elements from the list
        List<? extends Dog> dogList = puppies; // List of Puppies can be treated as List of Dogs
        Dog myDog = dogList.get(0); // Can get element, treated as Dog

        myDog.bark(); // Output: Yip!

        // This is NOT valid: Trying to add elements to the list
        // dogList.add(new Dog()); // Compile-time error
        // dogList.add(new Puppy()); // Compile-time error

        /*Producer: You can read from the collection and treat the elements as type Dog or its subclasses.
        Since the wildcard indicates "any type that is a subclass of Dog", you can safely retrieve items from the list,
        knowing they are at least of type Dog or a subtype.

        Consumer: You cannot add elements to the collection (except for null), since the compiler can't guarantee
        the safety of adding a Dog or any specific subclass of Dog to a list of an unknown specific subtype.
        This is due to generics not allowing a type-safe way to add items when the specific type of the collection is unknown.*/

    }
}

class Dog {
    public void bark() {
        System.out.println("Woof!");
    }
}

class Puppy extends Dog {
    @Override
    public void bark() {
        System.out.println("Yip!");
    }
}
