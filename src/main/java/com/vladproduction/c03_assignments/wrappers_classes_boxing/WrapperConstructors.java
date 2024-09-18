package com.vladproduction.c03_assignments.wrappers_classes_boxing;

import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;

public class WrapperConstructors {
    public static void main(String[] args) {

        Integer i1 = 42;
        Integer i2 = parseInt("42", 10);
        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);

        Float f1 = 3.14f;
        Float f2 = parseFloat("3.14f");
        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);

        Character c1 = 'c';
        System.out.println("c1 = " + c1);

        // valueOf():
        Integer i3 = Integer.valueOf("101011", 2);
        System.out.println("i3 = " + i3);
        Float f3 = Float.valueOf("3.14f");
        System.out.println("f3 = " + f3);

        // xxxValue():
        Integer i4 = 32;
        byte b1 = i4.byteValue();
        short s1 = i4.shortValue();
        double d1 = i4.doubleValue();
        System.out.println("b1 = " + b1);
        System.out.println("s1 = " + s1);
        System.out.println("d1 = " + d1);

        Float f4 = 32f;
        short s2 = f4.shortValue();
        System.out.println("s2 = " + s2);

        /**
         * difference between the two methods is:
         * ■ parseXxx() returns the named primitive.
         * ■ valueOf() returns a newly created wrapped object of the type that invoked the method.
         * */

    }
}
