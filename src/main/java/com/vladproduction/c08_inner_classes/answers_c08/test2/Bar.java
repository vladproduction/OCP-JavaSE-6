package com.vladproduction.c08_inner_classes.answers_c08.test2;

public class Bar extends Boo{
    Bar(){}
    Bar(String s){
        super(s);
    }
    void zoo(){
        //insert code here:
        Boo f = new Bar() { };//This creates an anonymous inner class that extends Bar.
        // It is valid syntax, and it creates a new class that has all the properties of Bar.


        Boo f2 = new Boo() {String s; };//This creates an anonymous inner class that extends Boo.
        // This syntax is valid as long as Boo has a default constructor. The line defines a new instance of a class that extends Boo,
        // and the variable s is an instance variable of that anonymous class.


    }
}

/*Which create an anonymous inner class from within class Bar? (Choose all that apply.)
-A. Boo f = new Boo(24) { }; //+ could be in case parameter in constructor is as String (but here int)
+B. Boo f = new Bar() { };
+C. Boo f = new Boo() {String s; };
-D. Bar f = new Boo(String s) { };//This line is trying to create an anonymous inner class from Boo,
                                    but it attempts to assign it to a variable of type Bar. You cannot assign a type of an anonymous inner class
                                    (that extends Boo) to a variable of type Bar.
-E. Boo f = new Boo.Bar(String s) { }; //no sense: Bar is not a member of Boo */

/*Answer:
        ✓ B and C. B is correct because anonymous inner classes are no different from any other
class when it comes to polymorphism. That means you are always allowed to declare a
reference variable of the superclass type and have that reference variable refer to an
instance of a subclass type, which in this case is an anonymous subclass of Bar. Since Bar
is a subclass of Boo, it all works. C uses correct syntax for creating an instance of Boo.
  A is incorrect because it passes an int to the Boo constructor, and there is no matching
constructor in the Boo class. D is incorrect because it violates the rules of polymorphism;
you cannot refer to a superclass type using a reference variable declared as the subclass
type. The superclass doesn't have everything the subclass has. E uses incorrect syntax.*/
