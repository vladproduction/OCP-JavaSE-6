package com.vladproduction.c08_inner_classes.static_nested_classes;

public class BigOuter {
    static class Nested{ //is simply a class that's a static member of the enclosing class
        void go(){
            System.out.println("go");
        }
    }
}

class Broom{
    public static void main(String[] args) {
        BigOuter.Nested nested = new BigOuter.Nested();// both class names
        nested.go();
        B2 b2 = new B2();// access the enclosed class
        b2.goB2();
    }
    static class B2{
        void goB2(){
            System.out.println("goB2");
        }
    }
}



