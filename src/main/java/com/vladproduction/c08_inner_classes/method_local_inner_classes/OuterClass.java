package com.vladproduction.c08_inner_classes.method_local_inner_classes;

public class OuterClass {

    // Instance variable of the enclosing (Outer) class
    private String instanceVariable = "Instance Variable";

    // Static variable of the enclosing (Outer) class
    private static String staticVariable = "Static Variable";


    // Static method
    public static void staticMethod() {
        // Local class defined within a static method
        class LocalClass {
            void display() {
                // Accessing static members of the enclosing class
                System.out.println(staticVariable); // Valid: accessing static variable

                // Attempting to access instance members of the enclosing class
                //local classes in a static method cannot access instance variables of the enclosing class
                // The following line would cause a compile-time error:
//                 System.out.println(instanceVariable); // Invalid: can't access instance variable

                // Accessing local variable from the static method
                String localVariable = "Local Variable"; // Local variable in static method
                System.out.println(localVariable); // Valid
            }
        }

        // Creating instance of local class and calling its method
        LocalClass localInstance = new LocalClass();
        localInstance.display();
    }

}
