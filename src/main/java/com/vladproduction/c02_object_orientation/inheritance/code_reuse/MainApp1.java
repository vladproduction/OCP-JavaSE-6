package com.vladproduction.c02_object_orientation.inheritance.code_reuse;

public class MainApp1 {
    public static void main(String[] args) {

        PlayerPiece playerPiece = new PlayerPiece();
        playerPiece.displayShape(); //superclass method
        playerPiece.movePeace(); //own method

    }
}
