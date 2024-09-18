package com.vladproduction.c01_declarations_and_access_control.package_import_statements.main;

import com.vladproduction.c01_declarations_and_access_control.package_import_statements.util.Color;// Static import for Color enum


/**
 * Develop code that declares classes (including abstract and all forms of nested classes),
 * interfaces, and enums, and includes the appropriate use of package and import statements
 * (including static imports).
 * */
public class MainApp {
    public static void main(String[] args) {

        Circle circle = new Circle(5);
        System.out.println("Circle Area: " + circle.getArea());
        circle.draw(); //inherited method

        Color randomColor = Circle.ColorPalette.getColorRandomly(); // Accessing static nested class
        System.out.println("Random Color: " + randomColor);
    }
}
