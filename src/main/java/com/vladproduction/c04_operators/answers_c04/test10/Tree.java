package com.vladproduction.c04_operators.answers_c04.test10;

public class Tree {
    public static void main(String[] args) {

        String s = "0";
        Boat b = new Boat();
        Boat b2 = new Speedboat();
        Speedboat s2 = new Speedboat();
        if ((b instanceof Vessel) && (b2 instanceof Toy)) s += "1";//01
        if ((s2 instanceof Vessel) && (s2 instanceof Toy)) s += "2";//012
        System.out.println(s);//012
        //answer: D

    }
}
