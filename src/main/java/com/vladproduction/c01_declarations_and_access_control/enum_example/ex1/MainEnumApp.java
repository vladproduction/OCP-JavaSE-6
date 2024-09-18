package com.vladproduction.c01_declarations_and_access_control.enum_example.ex1;

public class MainEnumApp {
    public static void main(String[] args) {

        Coffee drink1 = new Coffee();
        drink1.coffeeItem = CoffeeItem.BIG;
        System.out.println("drink1.coffeeItem.getOunces(): " + drink1.coffeeItem.getOunces());
        System.out.println("drink1.coffeeItem.getDescription(): " + drink1.coffeeItem.getDescription());

        Coffee drink2 = new Coffee();
        drink2.coffeeItem = CoffeeItem.MIDDLE;
        System.out.println("drink2.coffeeItem.getOunces(): " + drink2.coffeeItem.getOunces());
        System.out.println("drink2.coffeeItem.getDescription(): " + drink2.coffeeItem.getDescription());

        //retrieve all existing values of enum class (in the order they're declared):
        for (CoffeeItem cs : CoffeeItem.values()) {
            System.out.println(cs + " " + cs.getOunces()+ " " + cs.getDescription());
        }

    }
}
