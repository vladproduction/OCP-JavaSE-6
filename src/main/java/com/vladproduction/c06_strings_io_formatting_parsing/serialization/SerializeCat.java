package com.vladproduction.c06_strings_io_formatting_parsing.serialization;

import java.io.*;

public class SerializeCat {
    public static void main(String[] args) {

//        ObjectOutputStream.writeObject() // serialize and write

//        ObjectInputStream.readObject() // read and deserialize

        //make a new Cat object, which as we know is serializable
        Cat cat = new Cat(); // 2

        try{
            FileOutputStream fos = new FileOutputStream("testSer.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(cat); // 3
            oos.close();
        } catch (Exception e){
            e.printStackTrace();
        }
        try{
            FileInputStream fis = new FileInputStream("testSer.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            cat = (Cat) ois.readObject(); // 4
            System.out.println(cat);
            ois.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}

//Serializable is a marker interface;
class Cat implements Serializable { // 1
    @Override
    public String toString() {
        return "Cat{}";
    }
}
