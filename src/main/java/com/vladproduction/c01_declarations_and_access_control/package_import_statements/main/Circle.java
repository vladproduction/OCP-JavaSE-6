package com.vladproduction.c01_declarations_and_access_control.package_import_statements.main;

import com.vladproduction.c01_declarations_and_access_control.package_import_statements.util.Color;

public class Circle extends Shape{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    //creating nested class
    public static class ColorPalette{ //static nested class
        public static Color getColorRandomly(){ // Static method within nested class
            return Color.values()[(int) (Math.random() * Color.values().length)];
        }

    }
}
