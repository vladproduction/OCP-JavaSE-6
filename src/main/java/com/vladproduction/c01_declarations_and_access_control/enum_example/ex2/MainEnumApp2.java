package com.vladproduction.c01_declarations_and_access_control.enum_example.ex2;

public class MainEnumApp2 {
    public static void main(String[] args) {

        System.out.println("==================");

        Coffee2 coffee2 = new Coffee2();
        coffee2.size = Coffee2.CoffeeSize2.SMALL;
        System.out.println(coffee2.size.name());

    }
}
