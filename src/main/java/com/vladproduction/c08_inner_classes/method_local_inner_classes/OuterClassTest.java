package com.vladproduction.c08_inner_classes.method_local_inner_classes;


/**
 * concept implemented:
 * Just as a static method does not have access to the instance variables and
 * nonstatic methods of the class, a static nested class does not have access to the instance
 * variables and nonstatic methods of the outer class. Look for static nested classes with
 * code that behaves like a nonstatic (regular inner) class.
 * */
public class OuterClassTest {
    public static void main(String[] args) {

        // Calling the static method of OuterClass
        OuterClass.staticMethod();

        // Note: Uncommenting the next line will result in a compile-time error
        // because LocalClass cannot be accessed from outside the static method.
//         OuterClass.LocalClass local = new OuterClass.LocalClass(); // Invalid

    }
}

/*the limitations of a local class defined within a static method in Java regarding its access to members of the enclosing class:

1)Local Class in a Static Method:
A local class is a class defined within a method. If this method is static, it means the method belongs to the class itself,
rather than to any particular instance of the class.

2)Access to Members:
In Java, there are two types of members in a class: static members and instance members (variables and methods).
-Static Members: These belong to the class itself and can be accessed without creating an instance of the class.
-Instance Members: These belong to a particular instance of the class and require an object of the class to be accessed.

3)No Instance Context: When a class is defined within a static method:
-There is no instance of the enclosing class, which means the local class cannot access instance members
(instance variables and instance methods) of the enclosing class.
-'this' refers to the current instance of the class. In a static context, since there's no instance,
you cannot use this to refer to any instance members.

4)Restrictions:
Because of this, the local class in the static method can only access:
-Static members of the enclosing class.
-Other static members within the static method itself.
-Any parameters that are passed into the static method or local variables declared within the static method (if they are effectively final).*/
