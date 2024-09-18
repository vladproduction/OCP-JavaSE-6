package com.vladproduction.c02_object_orientation.answers_c02.test7;

public class Main {
    public static void main(String[] args) {
        ClassA classA = new ClassA();
        ClassC classC = new ClassC(classA); // Tight coupling by creating ClassC with ClassA dependency

        classA.someMethod(); // Calls methods using ClassB and potentially violating encapsulation
        classC.useClassAMethod(); // Tight coupling through method call on ClassA
    }
}

/**
 * 7. Given:
 *  1. ClassA has a ClassD
 *  2. Methods in ClassA use public methods in ClassB
 *  3. Methods in ClassC use public methods in ClassA
 *  4. Methods in ClassA use public variables in ClassB
 *  Which is most likely true? (Choose the most likely.)
 *  A. ClassD has low cohesion
 *  B. ClassA has weak encapsulation
 *  C. ClassB has weak encapsulation
 *  D. ClassB has strong encapsulation
 *  E. ClassC is tightly coupled to ClassA
 * Answer:
 *  ® ✓ C is correct. Generally speaking, public variables are a sign of weak encapsulation.
 *  ®˚ A, B, D, and E are incorrect, because based on the information given, none of these
 * statements can be supported.
 * (Objective 5.1)
 * */
