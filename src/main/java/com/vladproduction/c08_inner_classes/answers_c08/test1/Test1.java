package com.vladproduction.c08_inner_classes.answers_c08.test1;

public class Test1 {

    /*1. Which are true about a static nested class? (Choose all that apply.)
    A. You must have a reference to an instance of the enclosing class in order to instantiate it
    False. A static nested class can be instantiated without a reference to an instance of the enclosing class.

    B. It does not have access to non-static members of the enclosing class
    True. A static nested class cannot access non-static members (variables and methods) of the enclosing class directly.

    C. Its variables and methods must be static

    +D. If the outer class is named MyOuter, and the nested class is named MyInner, it can be
            instantiated using new MyOuter.MyInner();

    -E. It must extend the enclosing class*/

    /*Answer:
            ✓ B and D. B is correct because a static nested class is not tied to an instance of the
            enclosing class, and thus can't access the non-static members of the class (just as a
    static method can't access non-static members of a class). D uses the correct syntax
            for instantiating a static nested class.
             A is incorrect because static nested classes do not need (and can't use) a reference to an
            instance of the enclosing class. C is incorrect because static nested classes can declare and
            define non-static members. E is wrong because…it just is. There's no rule that says an
            inner or nested class has to extend anything.*/

}
