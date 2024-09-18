package com.vladproduction.c02_object_orientation.encapsulation.example1_dealership;

public class Car {

    private String model;
    private int year;
    private double price;

    // Private constructor prevents direct object creation (encapsulation)
    private Car(String model, int year, double price){
        this.model = model;
        this.year = year;
        this.price = price;
    }

    // Public static method to create Car objects with validation (encapsulation)
    public static Car createCar(String model, int year, double price){
        if(year < 1998 || price < 0){
            throw new IllegalArgumentException("Incorrect Car detail");
        }
        return new Car(model, year, price);
    }

    // Getters (encapsulation)
    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }
}
