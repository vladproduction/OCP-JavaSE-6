package com.vladproduction.c08_inner_classes.answers_c08.test3;

public class TestMain3 {
    public static void main(String[] args) {

        /*Analyzing Each Option

        A. It must be marked final.
        False. A method-local inner class does not have to be marked as final. It can be declared with or without the final modifier.

        B. It can be marked abstract.
        True. A method-local inner class can be marked as abstract. This means that if it is declared abstract,
        you will not be able to instantiate it directly, but it is valid.

        C. It can be marked public.
        False. Method-local inner classes cannot be marked as public, protected, or private. They have no access modifiers.
        Instead, their visibility is limited to the enclosing method.

        D. It can be marked static.
        False. Method-local inner classes cannot be declared static. Only static nested classes (defined outside of methods) can be static.

        E. It can access private members of the enclosing class.
        True. A method-local inner class can access all members (including private members) of the enclosing class.*/

    }
}

/*Which are true about a method-local inner class? (Choose all that apply.)
-A. It must be marked final
+B. It can be marked abstract
-C. It can be marked public
-D. It can be marked static
+E. It can access private members of the enclosing class*/

/*Answer:
        ✓ B and E. B is correct because a method-local inner class can be abstract, although it
means a subclass of the inner class must be created if the abstract class is to be used (so
        an abstract method-local inner class is probably not useful). E is correct because a
method-local inner class works like any other inner class—it has a special relationship to
an instance of the enclosing class, thus it can access all members of the enclosing class.
         A is incorrect because a method-local inner class does not have to be declared final
(although it is legal to do so). C and D are incorrect because a method-local inner class
cannot be made public (remember—local variables can't be public) or static.*/

