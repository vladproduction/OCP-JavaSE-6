package com.vladproduction.c01_declarations_and_access_control.answers_c01.testfor4;

public class TestFor4 {
    static Animal a;

    public static void main(String[] args) {

        System.out.println(a.DOG.sound + " " + a.FISH.sound);

    }
}
enum Animal{
    DOG("woof"),
    CAT("meow"),
    FISH("burble");

    String sound;

    Animal(String s){
        this.sound = s;
    }
}
