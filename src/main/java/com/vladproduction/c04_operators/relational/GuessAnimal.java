package com.vladproduction.c04_operators.relational;

public class GuessAnimal {
    public static void main(String[] args) {
        String animal = "unknown";
        int weight = 700;
        char sex = 'm';
        double colorWaveLength = 1.630;
        if (weight >= 500) { animal = "elephant"; }
        if (colorWaveLength > 1.621) { animal = "gray " + animal; }
        if (sex <= 'f') { animal = "female " + animal; }
        System.out.println("The animal is a " + animal);

    }
}
