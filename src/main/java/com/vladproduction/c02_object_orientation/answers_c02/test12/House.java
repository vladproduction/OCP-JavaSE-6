package com.vladproduction.c02_object_orientation.answers_c02.test12;

public class House extends Building{

    House(){
        System.out.print("h ");
    }

    House(String name){
        this();
        System.out.print("hn " + name);
    }

    public static void main(String[] args) {
        new House("x"); //b h hn x
    }
}
