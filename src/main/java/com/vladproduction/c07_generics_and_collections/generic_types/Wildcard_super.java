package com.vladproduction.c07_generics_and_collections.generic_types;

import java.util.ArrayList;
import java.util.List;

public class Wildcard_super {
    public static void main(String[] args) {
        /*can use a wildcard AND still add to
        the collection, but in a safe way—the keyword super*/

        List<Ani> animals = new ArrayList<>(); //super type collection
        List<Ani_A> animals_a = new ArrayList<>(); //extends type collection
        List<Ani_C> animals_c = new ArrayList<>(); //extends type collection

        HospitalGeneric hg = new HospitalGeneric();
        hg.addAnimal(animals); //legal to use collection with super type
        hg.addAnimal(animals_a); //legal to use collection with extend type but not higher
//        hg.addAnimal(animals_c); //NOT legal to use collection with extend type
                                    //we can not add element of type Ani_A to the collection that hold only Ani_C
                                    //legal to have elements of type Ani_C if collection defined as <Ani_A> and could hold such elements

    }
}

class HospitalGeneric{

    //can add to the collection any elements that of type Ani_A and subclasses (such as Ani_C)
    /*accept any List with a generic type that is of type
    Ani_A, or a supertype of Ani. Nothing lower in the inheritance tree can come in, but
    anything higher than Ani_A is OK.*/
    public void addAnimal(List<? super Ani_A> animals) {
        animals.add(new Ani_A()); // adding is sometimes OK with super
        animals.add(new Ani_C()); // IS-A test pass (Ani_C is-a Ani_A through the inheritance)
    }

}

abstract class Ani{
    abstract void check();
}

class Ani_A extends Ani{
    @Override
    void check() {
        System.out.println("Ani_A check.");
    }
}

class Ani_B extends Ani{
    @Override
    void check() {
        System.out.println("Ani_B check.");
    }
}

class Ani_C extends Ani_A{
    @Override
    void check() {
        System.out.println("Ani_C check.");
    }
}
