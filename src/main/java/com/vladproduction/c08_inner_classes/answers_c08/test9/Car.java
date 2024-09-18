package com.vladproduction.c08_inner_classes.answers_c08.test9;

public class Car {

    class Engine{
        //insert code here
//        { Car.this.drive(); } //outer class(Car) invoke by reference inner class(this)(which is Engine) it method (which is drive())
//        Engine() { Car.drive(); } //could be legal in case drive() method defined as static (by task default it is not)
//        Engine() { this.drive(); } //Engine has no method drive(), in case we refer to Car(where it is), code will work Engine() { Car.this.drive(); }
        Engine() { Car.this.drive(); } //as above case we invoke drive() through flow by referencing this(Engine - inner) to the Car (outer) class
                                        //where we have such method

    }

    public static void main(String[] args) {
        new Car().go();
    }
    void go(){
        new Engine();
    }
    void drive(){
        System.out.println("hi");
    }

}

/*Which, inserted independently at line 5, produce the output "hi"? (Choose all that apply.)
             -A. { Car.drive(); }
             -B. { this.drive(); }
             +C. { Car.this.drive(); }
             -D. { this.Car.this.drive(); }
        (+/-) E. Engine() { Car.drive(); }
        (+/-) F. Engine() { this.drive(); }
             +G. Engine() { Car.this.drive(); }*/

/*Answer:
        ✓ C and G are correct. C is the correct syntax to access an inner class’s outer instance
method from an initialization block, and G is the correct syntax to access it from
a constructor.
         A, B, D, E, and F are incorrect based on the above. (Objectives 1.1, 1.4*/
