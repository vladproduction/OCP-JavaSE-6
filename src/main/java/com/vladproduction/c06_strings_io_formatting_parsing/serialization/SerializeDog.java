package com.vladproduction.c06_strings_io_formatting_parsing.serialization;

import java.io.*;

public class SerializeDog {
    public static void main(String[] args) {

        Collar c = new Collar(3);
        Dog d = new Dog(c, 5, "dog1");
        System.out.println("before:");
        System.out.println(d);
        System.out.println("before: collar size is " + d.getTheCollar().getSize());
        //write object to file
        try{
            FileOutputStream fOut = new FileOutputStream("dogSer.txt");
            ObjectOutputStream out = new ObjectOutputStream(fOut);
            out.writeObject(d);
            out.close();
        }catch (Exception e){
            throw new RuntimeException(e);
        }

        //read object from file
        try{
            FileInputStream fIn = new FileInputStream("dogSer.txt");
            ObjectInputStream in = new ObjectInputStream(fIn);
            d = (Dog) in.readObject();
            in.close();
        }catch (Exception e){
            throw new RuntimeException(e);
        }

        System.out.println();
        System.out.println("after:");
        System.out.println(d);
        System.out.println("after: collar size is " + d.getTheCollar().getSize());

    }
}

class Dog implements Serializable {
    private Collar theCollar;
    private int age;
    private String name;

    public Dog(Collar theCollar, int age, String name) {
        this.theCollar = theCollar;
        this.age = age;
        this.name = name;
    }

    public Collar getTheCollar() {
        return theCollar;
    }

    public void setTheCollar(Collar theCollar) {
        this.theCollar = theCollar;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "theCollar=" + theCollar +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

class Collar implements Serializable{
    private int size;

    public Collar(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Collar{" +
                "size=" + size +
                '}';
    }
}
