package com.vladproduction.c06_strings_io_formatting_parsing.answers_c06.test4;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Computer implements Serializable {
    private Keyboard keyboard = new Keyboard(); //for success serialisation we have to mark this field as 'transient'
    //to exclude from Computer object for serialization

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.storeIt(computer);
    }
    void storeIt(Computer computer){
        try{
            /*FileOutputStream fOut = new FileOutputStream("myFile"); //?
            ObjectOutputStream out = new ObjectOutputStream(fOut);*/
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("myFile123computer"));
            out.writeObject(computer);
            out.close();
            System.out.println("done");
        }catch (Exception e){
            System.out.println("exc");
        }
    }

    /*What is the result? (Choose all that apply.)
    A. exc
    B. done
    C. Compilation fails
    D. Exactly one object is serialized
    E. Exactly two objects are serialized*/

    //A

    /*Answer:
            ✓ A is correct. An instance of type Computer Has-a Keyboard. Because Keyboard doesn't
    implement Serializable, any attempt to serialize an instance of Computer will cause an
    exception to be thrown.
             B, C, D, and E are incorrect based on the above. If Keyboard did implement Serializable
    then two objects would have been serialized. (Objective 3.3)*/

}

class Keyboard { }
