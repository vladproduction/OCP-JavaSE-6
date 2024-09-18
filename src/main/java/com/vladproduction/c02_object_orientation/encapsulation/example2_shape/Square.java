package com.vladproduction.c02_object_orientation.encapsulation.example2_shape;

public class Square implements Shape{

    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double getArea() {
        return sideLength * sideLength;
    }
}
