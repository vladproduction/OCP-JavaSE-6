package com.vladproduction.c07_generics_and_collections.collections.iterator;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * methods of iterator:
 * -boolean hasNext() Returns true if there is at least one more element in
 * the collection being traversed. Invoking hasNext() does NOT move you to the next element of the collection.
 * -Object next() This method returns the next object in the collection,
 * AND moves you forward to the element after the element just returned.
 *
 * provided code shows: List and an Iterator
 *
 * */
public class IteratorAction {
    public static void main(String[] args) {
        //define list:
        List<Dog> dogsList = new ArrayList<>();
        Dog dog1 = new Dog("dog1");
        dogsList.add(dog1);
        dogsList.add(new Dog("dog2"));
        dogsList.add(new Dog("dog3"));

        //making iterator object:
        Iterator<Dog> dogIterator = dogsList.iterator();
        while (dogIterator.hasNext()){
            Dog next = dogIterator.next();
            System.out.print(next.name + " ");
        }
        System.out.println();

        //print some info:
        System.out.println("list size before delete: " + dogsList.size());
        System.out.println("get(1): " + dogsList.get(1).name);
        System.out.println("dog1 = indexOf: " + dogsList.indexOf(dog1));
        dogsList.remove(2); //remove element by index '2'
        Object[] arrayOfDogs = dogsList.toArray(); //convert list into array
        //iterating through array after modification (deleted element)
        for (Object element : arrayOfDogs) {
            Dog dog = (Dog) element;
            System.out.println("arrayOfDogs " + dog.name);
        }
        System.out.println("list size after delete: " + dogsList.size()); //expected : 2


    }
}

class Dog {
    public String name;
    Dog(String n) { name = n; }
}
