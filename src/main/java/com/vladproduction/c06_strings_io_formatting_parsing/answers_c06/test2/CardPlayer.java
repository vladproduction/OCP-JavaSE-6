package com.vladproduction.c06_strings_io_formatting_parsing.answers_c06.test2;

import java.io.*;

public class CardPlayer extends Player implements Serializable {
    CardPlayer() { System.out.print("c"); }

    public static void main(String[] args) {
        CardPlayer c1 = new CardPlayer();

        try {
            FileOutputStream fos = new FileOutputStream("play.txt");
            ObjectOutputStream os = new ObjectOutputStream(fos);
            os.writeObject(c1);
            os.close();
            FileInputStream fis = new FileInputStream("play.txt");
            ObjectInputStream is = new ObjectInputStream(fis);
            CardPlayer c2 = (CardPlayer) is.readObject();
            is.close();

        } catch (Exception x ) { }
    }

    //answer: psp
    // C

    /*Answer:
            ✓ C is correct. It's okay for a class to implement Serializable even if its superclass doesn't.
            However, when you deserialize such an object, the non-serializable superclass must run its
    constructor. Remember, constructors don't run on deserialized classes that implement
    Serializable.
  A, B, D, E, and F are incorrect based on the above. (Objective 3.3)*/



}
