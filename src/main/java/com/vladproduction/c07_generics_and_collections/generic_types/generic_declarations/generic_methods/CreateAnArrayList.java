package com.vladproduction.c07_generics_and_collections.generic_types.generic_declarations.generic_methods;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Imagine you want to create a method that takes an instance of any type,
 * instantiates an ArrayList of that type, and adds the instance to the ArrayList.
 * */
public class CreateAnArrayList {
    public static void main(String[] args) {

        CreateAnArrayList creator = new CreateAnArrayList();
        Number[] numbs = {0, 12.3, -15, 0.158, 405, -60.58, 1, 1000};

        //for example, we have a HomeComputer as a type
        HomeComputer homeComputer = new HomeComputer();
        //invoke the method
        creator.makeArrayList(homeComputer);


        //numbers example_1:
        // Create an array of Numbers (above)
        // Call makeArrayList method with the Number array
        List<Number> numberList = creator.makeArrayList(numbs);
        // Print the created list
        System.out.println("Created List: " + numberList);

        System.out.println();
        //in case we want to have a List<Float> in sorted by natural (smallest --> bigger)
        List<Float> floatList = numberList.stream().map(Number::floatValue).sorted().toList(); //making a list
        for (Float f : floatList) {
            System.out.print(f + " "); //print
        }

        System.out.println();
        numberList.stream().map(Number::floatValue).sorted().forEach(System.out::println); //printing



    }

    /*must declare the type variable BEFORE the return type of the method*/
    public <T> void makeArrayList(T t) { // take an object of an unknown type and use a "T" to represent the type
        List<T> list = new ArrayList<>(); // now we can create the list using "T"
        list.add(t);
        System.out.println("Added an instance of type: " + t.getClass().getSimpleName() + " to the ArrayList.");
    }

    // numbers example_1:
    // Method to accept an array of Numbers and return a list
    public <T extends Number> List<T> makeArrayList(T[] arr) {
        List<T> numbers = new ArrayList<>();

        for (T t : arr) {
            if (numbers.size() < 10) {
                numbers.add(t); // Add only if there's space
            } else {
                throw new IndexOutOfBoundsException("Cannot add more than 10 elements to the list.");
            }
        }
        return numbers;
    }


}

class HomeComputer{ }
