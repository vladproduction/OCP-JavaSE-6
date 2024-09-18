package com.vladproduction.c06_strings_io_formatting_parsing.serialization.task;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * code for serializing a Food object using ObjectOutputStream and FileOutputStream:
 */
public class SerializedFood {
    public static void main(String[] args) {
        Food food = new Food("Pizza", 285, 8.99);

        try (FileOutputStream fileOutputStream = new FileOutputStream("food.ser");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(food);
            System.out.println("Food object serialized: " + food);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
