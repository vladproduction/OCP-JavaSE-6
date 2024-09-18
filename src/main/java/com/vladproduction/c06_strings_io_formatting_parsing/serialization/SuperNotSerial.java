package com.vladproduction.c06_strings_io_formatting_parsing.serialization;

import java.io.*;

public class SuperNotSerial {

    //assume super class 'Equipment' is not serializable
    //but inherited is
    //super constructor by deserialization come into play first; so child value changed (with parent came)
    //in this example weight value;

    private static final String BIKE_TXT = "bike.txt";

    public static void main(String[] args) {

        Bike bike = new Bike(150, "Tuareg");

        writeToFile(bike);
        readFromFile();

    }

    private static void readFromFile() {
        Bike bike;
        try {
            FileInputStream fis = new FileInputStream(BIKE_TXT);
            ObjectInputStream ois = new ObjectInputStream(fis);
            bike = (Bike) ois.readObject();
            ois.close();
        } catch (Exception e) { throw new RuntimeException(e); }

        System.out.println("after: " + bike);
    }

    private static void writeToFile(Bike bike) {
        System.out.println("before: " + bike);
        try {
            FileOutputStream fs = new FileOutputStream(BIKE_TXT);
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(bike);
            os.close();
        } catch (Exception e) { throw new RuntimeException(e); }
    }
}

class Bike extends Equipment implements Serializable {
    String name;
    Bike(int w, String name) {
        weight = w; // inherited
        this.name = name; // not inherited
    }

    @Override
    public String toString() {
        return "Bike{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}

class Equipment{ // not serializable !
    int weight = 100;

}
