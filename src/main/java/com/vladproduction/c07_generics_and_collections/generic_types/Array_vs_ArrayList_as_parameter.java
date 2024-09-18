package com.vladproduction.c07_generics_and_collections.generic_types;

import java.util.ArrayList;
import java.util.List;

public class Array_vs_ArrayList_as_parameter {
    public static void main(String[] args) {

        /*The
        compiler does not realize that out on the heap somewhere is an array of type Cat[],
        not Animal[], and you're about to try to add a Dog to it. To the compiler, you have
        passed in an array of type Animal, so it has no way to recognize the problem.*/

        /*But it does NOT work for generic collection*/
        /*The reason the compiler won't let you pass an ArrayList<Dog> into a method
        that takes an ArrayList<Animal>, is because within the method, that parameter is
        of type ArrayList<Animal>, and that means you could put any kind of Animal into
        it*/

        /*all that matters is the type of the parameter*/


    }

    //case#1 (only one type added to array)
    public void addAnimals(Animals[] animals){
        animals[0] = new Dogs(); // ok, any Animal subtype works
    }
    public void foo(){
        Dogs[] dogs = {new Dogs(), new Dogs()};
        addAnimals(dogs); // no problem, send the Dogs[] to the method
    }

    //case#2 (different types added to array)
    public void addAnimals_multi(Animals[] animals){
        animals[0] = new Dogs(); // Eeek! We just put a Dogs
                                // in a Cat array!
    }
    public void foo2(){
        Cats[] cats = {new Cats(), new Cats()};
        addAnimals_multi(cats); // no problem, send the Cats[] to the method
    }

    //case#3 (Collection with Animals (more abstract) as a parameter)
    //still work with legal parameter incoming to te method
    public void addAnimal_List_Animals(List<Animals> animals) {
        animals.add(new Dogs()); // this is always legal,
        // since Dogs can be assigned to an Animals reference
    }
    public void foo3(){
        List<Animals> animals = new ArrayList<>();
        animals.add(new Dogs());
        animals.add(new Dogs());
        addAnimal_List_Animals(animals); // OK, since animals matches the method arg
    }

    //case#4 (not work for a specific type parameter, OTHER type of ArrayList)
    //since at runtime the JVM would have no way to stop you from adding a Dog
    //to what was created as a Cat collection
    public void addAnimal_List_Animals_2(List<Animals> animals) {
        animals.add(new Dogs()); // still Ok, as always
    }
    public void foo4(){
        List<Dogs> animals = new ArrayList<>();
        animals.add(new Dogs());
        animals.add(new Dogs());
        //addAnimal_List_Animals_2(animals); //here the compiler break! (provided Dogs but wants as Animals)
    }


}

abstract class Animals{
    abstract void checkup();
}
class Dogs extends Animals{
    @Override
    void checkup() {
        System.out.println("Dogs checkup.");
    }
}
class Cats extends Animals{
    @Override
    void checkup() {
        System.out.println("Cats checkup.");
    }
}
class Birds extends Animals{
    @Override
    void checkup() {
        System.out.println("Birds checkup.");
    }
}

