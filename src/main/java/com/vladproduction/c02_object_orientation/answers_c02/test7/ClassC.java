package com.vladproduction.c02_object_orientation.answers_c02.test7;


/**
 *  ClassC tightly coupled to ClassA
 * */
public class ClassC {

    private ClassA classA; // Dependency on ClassA

    public ClassC(ClassA classA) {
        this.classA = classA;
    }

    public void useClassAMethod() {

        classA.someMethod(); // Tight coupling through direct method call
    }

}
