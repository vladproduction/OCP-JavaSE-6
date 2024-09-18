package com.vladproduction.c05_control_flow_exceptions_assertions.handling_exceptions.situations.no_class_def_found;

public class TestNoClassDefFound {
    public static void main(String[] args) {
        /*A NoClassDefFoundError in Java is thrown if the JVM cannot find the definition of a class that was available
        during compile time but is not found during runtime. This can occur for various reasons, such as:

        1.The class file was deleted or has become inaccessible at runtime.
        2.The class was not included in the classpath when the application started.
        3.The class is found during initialization, but an exception is thrown while initializing a static initializer.
        While this error is typically thrown by the JVM and not programmatically, you will generally encounter
        it when you try to run a program that references a class that isn’t available.*/

        // Attempt to create an instance of the MissingClass
        MissingClass missing = new MissingClass();
        missing.display();

        //delete MissingClass.class
        /*since MissingClass has been deleted, it can't be loaded at runtime.
        Runtime Error: When executing java MainClass, the JVM attempts to load MissingClass,
        but since it's missing, it throws a NoClassDefFoundError.*/
    }

}



