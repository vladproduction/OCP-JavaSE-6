package com.vladproduction.c02_object_orientation.inheritance.polymorfism_demo;

public class MainApp2 {
    public static void main(String[] args) {


        PlayerPiece player = new PlayerPiece();
        TilePiece tile = new TilePiece();
        doShapes(player);
        doShapes(tile);

    }

    public static void doShapes(GameShape shape){
        shape.displayShape();
    }

}
