package com.vladproduction.c01_declarations_and_access_control.exercise_interface;

public class Square extends Shape{

    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double getArea() {
        return sideLength * sideLength;
    }
}
