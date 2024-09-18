package com.vladproduction.c06_strings_io_formatting_parsing.answers_c06.test12;

import java.io.Serializable;


//    Instances of which class(es) can be serialized?

public class Vehicle {
    public static void main(String[] args) {

            /*A. Car
            B. Ford
            C. Dodge
            D. Wheels
            E. Vehicle
            Answer:
      ✓ A and B are correct. Dodge instances cannot be serialized because they "have" an instance
            of Wheels, which is not serializable. Vehicle instances cannot be serialized even though the
            subclass Car can be.
      C, D, and E are incorrect based on the above. (Objective 3.3)*/

    }
}
class Wheels{}
class Car extends Vehicle implements Serializable { }
class Ford extends Car { }
class Dodge extends Car {Wheels w = new Wheels();}

//answer A B