package com.vladproduction.c07_generics_and_collections.answers_c07.test15;

import java.util.Objects;
import java.util.TreeSet;

public class FirstGrade {
    public static void main(String[] args) {
        TreeSet<Integer> i = new TreeSet<>(); //Integer.class already implements Comparable by default (so no exception expected)
        TreeSet<Dog> d = new TreeSet<>();
        /*d.add(new Dog(1));
        d.add(new Dog(2));
        d.add(new Dog(1));*/
        i.add(1);
        i.add(2);
        i.add(1);
        System.out.println(d.size() + " " + i.size());
//        ClassCastException: All elements inserted into the set must implement the Comparable interface.
//        Dog cannot be cast to class java.lang.Comparable
//        Compiler have no idea how to compare inserted elements (because collection defined as TreeSet - must have Comparable)
    }

    /*What is the result?
    A. 1 2
    B. 2 2
    C. 2 3
    D. 3 2
    E. 3 3
    F. Compilation fails
    +G. An exception is thrown at runtime*/

    /*Answer:
            ✓ G is correct. Class Dog needs to implement Comparable in order for a TreeSet (which keeps its elements sorted)
            to be able to contain Dog objects.
             A, B, C, D, E, and F are incorrect based on the above. (Objective 6.5)*/
}

class Dog { // to avoid exception need:  implements Comparable<Dog> and implement method compareTo(Dog o){...}

    int size;

    public Dog(int size) {
        this.size = size;
    }

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return size == dog.size;
    }

    @Override
    public int hashCode() {
        return Objects.hash(size);
    }*/

    /*@Override
    public int compareTo(Dog o) {
        return Integer.compare(this.size, o.size);

    }*/
}
