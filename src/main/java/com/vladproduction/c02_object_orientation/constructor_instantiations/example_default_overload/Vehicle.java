package com.vladproduction.c02_object_orientation.constructor_instantiations.example_default_overload;

public class Vehicle {
    public static void main(String[] args) {

        Vehicle v1 = new Vehicle();
        System.out.println(v1.type);

        Vehicle v2 = new Vehicle("My-Car-Type");
        System.out.println(v2.type);

    }

    String type;

    Vehicle(String type) {
        this.type = type;
    }

    Vehicle(){
        this(makeRandomType());
    }

    static String makeRandomType(){
//        int x = (int) (Math.random() * 5);
//        String name = new String[] {"Sport","SUV","City","Off-road","Bus"} [x];
//        return name;

        String[] types = {"Sport", "SUV", "City", "Off-road", "Bus"};
        return types[(int) (Math.random() * types.length)];
    }
}
