package com.vladproduction.c02_object_orientation.encapsulation.example1_dealership;

public class MainDealershipApp {
    public static void main(String[] args) {

        // Create Dealership
        Dealership dealership = new Dealership("Milan dealership distributor; Milan-100, Rosso Neri str. 1;");

        //Create cars
        Car car1 = Car.createCar("Tesla M", 2023, 55235);
        Car car2 = Car.createCar("BMW M-6", 2022, 68200);
        Car car3 = Car.createCar("Honda Civic", 1999, 25120); //throwing exception: Incorrect Car detail if (year < 1998 || price < 0)

        //Trying to add cars to inventory list (exception handling for invalid car)
        try{
            dealership.addCarToInventory(car1);
            dealership.addCarToInventory(car2);
            dealership.addCarToInventory(car3);
        }catch (IllegalArgumentException e){
            System.out.println("Error during adding car: " + e.getMessage());
        }

        //Create customers
        Customer customer_alice = new Customer("Alice", 80000);
        Customer customer_bob = new Customer("Bob", 20000);

        // Scenario 1: Customer can afford a car
        if (customer_alice.canAfford(car1)) {
            System.out.println(customer_alice.getName() + " can afford the " + car1.getModel());
        } else {
            System.out.println(customer_alice.getName() + " cannot afford the " + car1.getModel());
        }

        // Scenario 2: Customer cannot afford a car
        if (customer_bob.canAfford(car1)) {
            System.out.println(customer_bob.getName() + " can afford the " + car1.getModel());
        } else {
            System.out.println(customer_bob.getName() + " cannot afford the " + car1.getModel());
        }

    }
}
