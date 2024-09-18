package com.vladproduction.c02_object_orientation.answers_c02.test7;

/**
 *  ClassA with some coupling and potential encapsulation violation
 * */
public class ClassA {

    private ClassD classD; // Example of having another class member (not relevant to coupling)
    private ClassB classB = new ClassB(); // Tight coupling by creating instance directly

    public void someMethod() {
        System.out.println("ClassA doing something");
        classB.doSomethingWithInternalData(); // Using public method of ClassB (loose coupling)
        System.out.println("ClassA accessing public variable from B: " + classB.someValue); // Encapsulation violation
    }

}
