package com.vladproduction.c02_object_orientation.inheritance.has_a;

public class Car {

    private String model;
    private Engine engine;

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return new Engine(engine.getType(), engine.getH_power());
    }

    public void startEngine(){
        engine.started();
    }
}
