package com.vladproduction.c03_assignments.passing_variables_into_methods;

import java.awt.*;

public class PassingObjectReferenceTest {
    public static void main(String[] args) {
        Dimension dimension = new Dimension(5, 10);
        System.out.println("before modification(): " + dimension.width + ", " + dimension.height);
        PassingObjectReferenceTest passingObjectRef = new PassingObjectReferenceTest();
        passingObjectRef.modification(dimension);
        System.out.println("after  modification(): " + dimension.width + ", " + dimension.height);
    }

    private void modification(Dimension dimension) {
        dimension.width += 10;
        dimension.height += 10;
    }
}
