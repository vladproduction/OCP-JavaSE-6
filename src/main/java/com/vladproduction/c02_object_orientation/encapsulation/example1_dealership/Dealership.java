package com.vladproduction.c02_object_orientation.encapsulation.example1_dealership;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dealership {

    private String name;
    private List<Car> inventory;

    public Dealership(String name) {
        this.name = name;
        this.inventory = new ArrayList<>();
    }

    // Loose coupling: Accepts a Car object (doesn't depend on Car implementation)
    public void addCarToInventory(Car car){
        inventory.add(car);
    }

    // Loose coupling: Returns a list of Car objects (doesn't modify Car)
    public List<Car> getInventory(){
        return Collections.unmodifiableList(inventory); //// Returns unmodifiable copy
    }
}
