package com.vladproduction.c03_assignments.passing_variables_into_methods;

public class ShadowingAsObjectParameter {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        System.out.println("vehicle.myCar.weight before changeIt() is: " + vehicle.myCar.weight); //2000
        vehicle.changeIt(vehicle.myCar);//3000
        //4000
        System.out.println("vehicle.myCar.weight after changeIt() is: " + vehicle.myCar.weight); //3000

        vehicle = new Vehicle();
        System.out.println("vehicle.myCar.weight before changeIt() and as new created again is: 2000 ? = " + vehicle.myCar.weight); //2000

        /**
         * Shadowing variable (the local parameter car in changeIt()) can still
         * affect the myCar instance variable, because the car parameter receives a reference to the same
         * Car object;
         * But when the local car is reassigned a new Car object, which we then modify by
         * changing its weight value, Vehicle’s original myCar instance variable is untouched;
         * */


    }
}

class Car{
    int weight = 2000;
}

class Vehicle{
    Car myCar = new Car();

    void changeIt(Car car){
        car.weight = 3000;
        System.out.println("changeIt(Car car) is: 3000 = ? " + car.weight);
        car = new Car();
        car.weight = 4000;
        System.out.println("changeIt(Car car) is now (car = new Car()): 4000 = ? " + car.weight);

    }
}
