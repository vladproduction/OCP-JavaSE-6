package com.vladproduction.c02_object_orientation.overriding_overloading.example2_cars;

/**
 * an overriding method must fulfill the
 * contract of the superclass
 * */
public class MainCarsApp {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Generic", "Vehicle"); // Base class object
        Car car = new Car("Toyota", "Camry", 2023); // Overload constructor

        System.out.println(vehicle.getDetails()); // Make: Generic, Model: Vehicle
        System.out.println(car.getDetails());     // Make: Toyota, Model: Camry, Year: 2023
    }
}
