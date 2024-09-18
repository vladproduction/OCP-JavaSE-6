package com.vladproduction.c04_operators.instanceOfComparison;

public class ClassB extends ClassA{
    public static void main(String[] args) {
        ClassA a = new ClassB();
        method(a);
        ClassB b = new ClassB();
        if (b instanceof Object) {
            System.out.print("'b' is definitely an Object");
        }
    }
    public static void method(ClassA a){
        if(a instanceof ClassB){
            ((ClassB)a).doStaff();
        }
    }
    public static void doStaff(){
        System.out.println("'a' refers to classB");
    }
}
