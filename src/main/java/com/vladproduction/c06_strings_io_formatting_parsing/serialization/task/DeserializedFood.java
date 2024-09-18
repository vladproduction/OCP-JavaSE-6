package com.vladproduction.c06_strings_io_formatting_parsing.serialization.task;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * code for deserializing the Food object using ObjectInputStream and FileInputStream:
 * */
public class DeserializedFood {
    public static void main(String[] args) {
        Food food = null;

        try (FileInputStream fileInputStream = new FileInputStream("food.ser");
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            food = (Food) objectInputStream.readObject();
            System.out.println("Food object deserialized: " + food);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

/*In summary:

The Food class implements Serializable.
The serialization process involves writing a Food object to a file named food.ser.
The deserialization process reads that file and reconstructs the Food object.
Run the SerializeFood class first to create the serialized object file,
and then run the DeserializeFood class to read and display the Food object.
 */

 /*cautious with the serialVersionUID;
 changing it will require the class to be re-serialized since Java uses this ID to ensure class compatibility during deserialization.*/



