package com.vladproduction.c01_declarations_and_access_control.enum_example.ex1;

public enum CoffeeItem {

    BIG(10, "Grande"),
    MIDDLE(5, "Medium"),
    SMALL(2, "Short");

    private final int ounces;
    private final String description;

    CoffeeItem(int ounces, String description) {
        this.ounces = ounces;
        this.description = description;
    }

    public int getOunces() {
        return ounces;
    }

    public String getDescription() {
        return description;
    }

}
