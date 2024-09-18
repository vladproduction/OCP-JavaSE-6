package com.vladproduction.c02_object_orientation.inheritance.has_a;

public class Engine {

    private String type;
    private double h_power;

    public Engine(String type, double h_power) {
        this.type = type;
        this.h_power = h_power;
    }

    public String getType() {
        return type;
    }

    public double getH_power() {
        return h_power;
    }

    public void started(){
        System.out.println("engine is started");
    }
}
