package com.vladproduction.c02_object_orientation.answers_c02.test12;

class Building {

    Building() {
        System.out.print("b ");
    }

    Building(String name) {
        this();
        System.out.print("bn " + name);
    }
}
