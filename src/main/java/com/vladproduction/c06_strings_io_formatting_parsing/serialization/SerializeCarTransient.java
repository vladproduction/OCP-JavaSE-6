package com.vladproduction.c06_strings_io_formatting_parsing.serialization;

import java.io.*;

public class SerializeCarTransient {
    public static void main(String[] args) {
        //assume we`re not able to stand Engine as Serializable
        //we are going to have try-with-resources type option (no .close() needed)
        Engine engine = new Engine("d-2.0");
        Car car = new Car(engine, "bmw", 1);

        //write object to file
        try(FileOutputStream fOut = new FileOutputStream("car-trans.txt");
            ObjectOutputStream out = new ObjectOutputStream(fOut)){
            out.writeObject(car);
        }catch (Exception e){
            throw new RuntimeException(e);
        }

        //read object from file
        try(FileInputStream fIn = new FileInputStream("car-trans.txt");
            ObjectInputStream in = new ObjectInputStream(fIn)){
            car = (Car) in.readObject();
        }catch (Exception e){
            throw new RuntimeException(e);
        }

        //just print it out
        System.out.println(car);

    }
}


class Car implements Serializable{

    private transient Engine theEngine; //we have to mark it transient, so it will skip for Car new instance
    private String name;
    private int age;

    public Car(Engine theEngine, String name, int age) {
        this.theEngine = theEngine;
        this.name = name;
        this.age = age;
    }

    public Engine getTheEngine() {
        return theEngine;
    }

    public void setTheEngine(Engine theEngine) {
        this.theEngine = theEngine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Car{" +
                "theEngine=" + theEngine +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Engine{
    private String type;

    public Engine(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "type='" + type + '\'' +
                '}';
    }
}
