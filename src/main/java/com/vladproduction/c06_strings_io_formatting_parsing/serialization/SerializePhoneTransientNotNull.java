package com.vladproduction.c06_strings_io_formatting_parsing.serialization;

import java.io.*;

public class SerializePhoneTransientNotNull {

    public static final String PHONE_TXT = "phone.txt";

    public static void main(String[] args) {
        Processor processor = new Processor("c7-pro", 10.2d);
        Phone phone = new Phone(processor, "phone-new", 100, Color.BLACK);

        //write to file:
        try(FileOutputStream fOut = new FileOutputStream(PHONE_TXT);
        ObjectOutputStream out = new ObjectOutputStream(fOut)){
            out.writeObject(phone);
        }catch (Exception e){
            throw new RuntimeException(e);
        }

        //read from file:
        try(FileInputStream fIn = new FileInputStream(PHONE_TXT);
        ObjectInputStream in = new ObjectInputStream(fIn)){
            phone = (Phone) in.readObject();
        }catch (Exception e){
            throw new RuntimeException(e);
        }

        //print result of (write and read):
        System.out.println(phone); //expected not null for processor

    }
}

class Phone implements Serializable{
    private transient Processor processor;
    private String brand;
    private int price;
    private Color color;

    public Phone(Processor processor, String brand, int price, Color color) {
        this.processor = processor;
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    //"If anyone invokes writeObject() or readObject() concerning a Phone object, use this code as part of the read and write
    //need to add methods to help us by saving object (Phone) evaluate Processor as not null value:
    @Serial
    private void writeObject(ObjectOutputStream os) {
        //could: throws IOException
        try {
            os.defaultWriteObject();
            os.writeUTF(processor.getType());
            os.writeDouble(processor.getWeight());
        } catch (Exception e) { throw new RuntimeException(e); }
    }
    @Serial
    private void readObject(ObjectInputStream is) {
        // could: throws IOException, ClassNotFoundException
        try {
            is.defaultReadObject();
            processor = new Processor(is.readUTF(), is.readDouble());
        } catch (Exception e) { throw new RuntimeException(e); }
    }

    @Override
    public String toString() {
        return "Phone{" +
                "processor=" + processor +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", color=" + color +
                '}';
    }
}

class Processor{
    private String type;
    private double weight;


    public Processor(String type, double weight) {
        this.type = type;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "type='" + type + '\'' +
                ", weight=" + weight +
                '}';
    }
}

enum Color{
    BLACK, WHITE,GRAY
}
