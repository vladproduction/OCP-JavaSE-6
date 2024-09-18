package com.vladproduction.c01_declarations_and_access_control.answers_c01.testfor5.pack2;

import com.vladproduction.c01_declarations_and_access_control.answers_c01.testfor5.pack1.ClassA;

public class ClassB {
    public static void main(String[] args) {
        ClassA classA = new ClassA();
//        System.out.println(classA.x); //x is not public; Cannot be accessed from outside package (it has a default modifier access);
//        System.out.println(classA.y); //'y' has protected access;
        System.out.println("classA.z = " + classA.z); //full access available, 'z' is public

        //accessing through inheritance(need to: extends ClassA):
//        ClassB classB = new ClassB();
//        int y_B = classB.y;
//        System.out.println("y_B = " + y_B);
    }
}
