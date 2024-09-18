package com.vladproduction.c02_object_orientation.inheritance.has_a;

public class MainHas_aApp {
    public static void main(String[] args) {

        // Create an Engine
        Engine v8Engine = new Engine("V8", 400);

        // Create a Car with the Engine
        Car sportsCar = new Car("Sleekster", v8Engine);

        System.out.println("Car Model: " + sportsCar.getModel());

        // Access Engine details through the Car object (without modifying the original Engine)
        Engine carEngine = sportsCar.getEngine();
        System.out.println("Engine Type: " + carEngine.getType());
        System.out.println("Engine Horsepower: " + carEngine.getH_power());

        // Start the engine using the Car object
        sportsCar.startEngine();

    }
}
