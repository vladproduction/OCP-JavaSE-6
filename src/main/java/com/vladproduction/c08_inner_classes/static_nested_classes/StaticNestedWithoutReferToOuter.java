package com.vladproduction.c08_inner_classes.static_nested_classes;

public class StaticNestedWithoutReferToOuter {

    static class StaticNestedClass {
        void display() {
            System.out.println("Inside Static Nested Class");
        }
    }

    public static void main(String[] args) {
        // Instantiate the static nested class without an OuterClass instance
        StaticNestedWithoutReferToOuter.StaticNestedClass staticNestedClass = new StaticNestedWithoutReferToOuter.StaticNestedClass();
        //such construction is looks like just simple static method we are want to invoke through reference

        staticNestedClass.display(); // Output: Inside Static Nested Class

    }
}
