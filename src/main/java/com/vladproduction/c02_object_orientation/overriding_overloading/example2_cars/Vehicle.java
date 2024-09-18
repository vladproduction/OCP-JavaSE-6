package com.vladproduction.c02_object_orientation.overriding_overloading.example2_cars;

public class Vehicle {

    private String make;
    private String model;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getDetails(){
        return "Make: " + make + ", Model: " + model;
    }
}
