package com.vladproduction.c07_generics_and_collections.generic_types;

import java.util.ArrayList;
import java.util.List;

public class Wildcard_extends {
    public static void main(String[] args) {
        /*<? extends Animal> means that you can take any subtype of Animal*/
        //here we talk about collection that we can use for retrieve
        //but not for add elements, because not guaranty that new added element is that correct type
        //such wildcard make methods type-safe
        //"Is-a", as in something that passes the instanceof test.


        List<Anim> animals = new ArrayList<>(); //super type collection
        List<Anim_A> animals_a = new ArrayList<>(); //extends type collection
        List<Anim_C> animals_c = new ArrayList<>(); //extends type collection

        Hospital_Generic h_g = new Hospital_Generic();
//            h_g.printAnim_A_extends(animals); //NOT legal to use collection with super type
        h_g.printAnim_A_extends(animals_a); //legal to use collection with extend type
        h_g.printAnim_A_extends(animals_c); //legal to use collection with extend type


    }
}

class Hospital_Generic {
    //can use collection of elements that of type Anim_A and subclasses (such as Anim_C)
    public void printAnim_A_extends(List<? extends Anim_A> animals) {
        for (Anim_A animal : animals) {
            System.out.println(animal.getClass().getSimpleName());
        }
    }
}

abstract class Anim {
    abstract void check();
}

class Anim_A extends Anim {
    @Override
    void check() {
        System.out.println("Anim_A check.");
    }
}

class Anim_B extends Anim {
    @Override
    void check() {
        System.out.println("Anim_B check.");
    }
}

class Anim_C extends Anim_A {
    @Override
    void check() {
        System.out.println("Anim_C check.");
    }
}

