package com.vladproduction.c02_object_orientation.answers_c02.test8;

public class DogShow {
    public static void main(String[] args) {
        new DogShow().go();
    }

    void go(){
        new Hound().bark();
        ((Dog)new Hound()).bark();
//        ((Dog)new Hound()).sniff();
    }
}
