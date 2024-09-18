package com.vladproduction.c02_object_orientation.polymorphism;

public class PlayerPiece extends GameShape implements Animatable{

    public void movePeace(){
        System.out.println("moving game piece.");
    }

    @Override
    public void animate() {
        System.out.println("PlayerPiece can animate(), it is implement Animatable interface.");
    }
}
