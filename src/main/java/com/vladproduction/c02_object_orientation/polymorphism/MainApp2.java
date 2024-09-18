package com.vladproduction.c02_object_orientation.polymorphism;

public class MainApp2 {
    public static void main(String[] args) {


        PlayerPiece player = new PlayerPiece();
        TilePiece tile = new TilePiece();
        doShapes(player);
        doShapes(tile);

        //---------legal to declare like this----------
        PlayerPiece playerPiece = new PlayerPiece();
        Object o = playerPiece;
        GameShape gameShape = playerPiece;
        Animatable mover = playerPiece;
        //only two type of variable amount represented here is able to invoke displayShape() method by compile time:
        playerPiece.displayShape(); //first appearance
        gameShape.displayShape(); //second one

        /**
         * Polymorphic method invocations apply only to instance methods. You can
         * always refer to an object with a more general reference variable type (a superclass or interface), but at runtime,
         * the ONLY things that are dynamically
         * selected based on the actual object (rather than the reference type) are instance
         * methods. Not static methods. Not variables. Only overridden instance methods are dynamically invoked based on the real object's type.
         * */

    }

    public static void doShapes(GameShape shape){
        shape.displayShape();
    }

}
