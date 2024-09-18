package com.vladproduction.c03_assignments.array_declaration_construction_initialization;

import java.util.Arrays;

public class InitializingAnArray {
    public static void main(String[] args) {
        Animal[] animals = new Animal[5];
        animals[0] = new Animal();
        animals[1] = new Animal("Monkey");
        animals[2] = new Animal();
        System.out.println(Arrays.toString(animals));
        /**
         * This code puts three new Animal objects on the heap and assigns them to the
         * three index positions (elements) in the animals array
         * */
    }
}
class Animal{
    private String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}