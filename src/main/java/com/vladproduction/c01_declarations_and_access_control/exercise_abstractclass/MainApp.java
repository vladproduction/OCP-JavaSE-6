package com.vladproduction.c01_declarations_and_access_control.exercise_abstractclass;

/**
 * Create an abstract superclass named Fruit and a concrete
 * subclass named Apple. The superclass should belong to a package called food and
 * the subclass can belong to the default package (meaning it isn't put into a package
 * explicitly). Make the superclass public and give the subclass default access.
 * */
public class MainApp {
    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.printInfo();

        System.out.println(apple.fruitShape("apple is round"));
    }
}
