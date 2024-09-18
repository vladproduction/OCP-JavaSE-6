package com.vladproduction.c01_declarations_and_access_control.final_declaration;

/**
 * there are no final objects in Java. A reference variable
 * marked final can never be changed, but the object it refers to can be modified.
 * */
public class FinalVariable {
    public static void main(String[] args) {

        Car car = new Car("Toyota", 2);
        System.out.println(car); //Car{brand='Toyota', year=2}
        car.incrementYear();
        System.out.println(car); //Car{brand='Toyota', year=3} --> year is incremented

    }
}

class Car{
    private final String brand;
    private int year;

    //reference variable brand can't be reassigned to point to a different String object after it's initialized in the constructor.
    //year is not final: This allows the incrementYear method to modify the value stored in the year variable.
    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void incrementYear(){
        year++;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", year=" + year +
                '}';
    }
}
