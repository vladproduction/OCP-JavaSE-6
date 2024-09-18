package com.vladproduction.c02_object_orientation.interface_impl;

public class BeachBall extends Ball{

    //from interface Bounceable
    @Override
    public void bounce() {
        System.out.println("Beach ball bounce implementation.");
    }

    @Override
    public void setBounceFactor(int bf) {
        System.out.println("Beach ball setBounceFactor: " + bf);
    }

    //from abstract class
    @Override
    public String ballColor(String color) {
        return color;
    }

    //from interface has been extended from another interface (Movable)
    @Override
    public void move() {
        System.out.println("Beach ball is move very fast");
    }

    //from multiple extending interfaces (Spherical)
    @Override
    public void doSphericalThing() {
        System.out.println("Beach ball is round");
    }
}
