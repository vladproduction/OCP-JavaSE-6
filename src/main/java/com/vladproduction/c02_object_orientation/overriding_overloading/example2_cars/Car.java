package com.vladproduction.c02_object_orientation.overriding_overloading.example2_cars;

public class Car extends Vehicle{

    private int year;

    //overloaded constructor (diff prams list)

    public Car(String make, String model, int year) {
        super(make, model);
        this.year = year;
    }

    //overridden method with more specific details
    @Override
    public String getDetails() {
        return super.getDetails() + ", Year: " + year;
    }
}
