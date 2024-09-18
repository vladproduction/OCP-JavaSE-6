package com.vladproduction.c02_object_orientation.encapsulation.example1_dealership;

public class Customer {

    private String name;
    private double budget;

    // Constructor with validation for budget (encapsulation)
    public Customer(String name, double budget) {
        if (budget < 0) {
            throw new IllegalArgumentException("Budget cannot be negative");
        }
        this.name = name;
        this.budget = budget;
    }

    // Getters (encapsulation)
    public String getName() {
        return name;
    }

    public double getBudget() {
        return budget;
    }

    // Method to check if a customer can afford a car (loose coupling)
    public boolean canAfford(Car car) {
        return car.getPrice() <= budget;
    }


}
