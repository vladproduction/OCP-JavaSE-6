package com.vladproduction.c01_declarations_and_access_control.package_import_statements.main;

import com.vladproduction.c01_declarations_and_access_control.package_import_statements.util.Drawable;

public abstract class Shape implements Drawable { // Abstract class implementing an interface

    public abstract double getArea(); //abstract method

    @Override
    public void draw() {
        System.out.println("Default drawing of shape"); //default implementation
    }
}
