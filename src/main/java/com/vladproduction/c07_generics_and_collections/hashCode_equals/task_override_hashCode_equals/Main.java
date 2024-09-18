package com.vladproduction.c07_generics_and_collections.hashCode_equals.task_override_hashCode_equals;


/**
 * the hashCode() and equals() methods are essential for comparing object instances and are especially important when objects
 * are used in collections like HashSet, HashMap, etc.
 * Here’s how to correctly override these methods and distinguish between correct and incorrect implementations,
 * along with an explanation of == versus equals().
 * */
public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("Alice", 30);
        Person p2 = new Person("Alice", 30);

        System.out.println(p1 == p2); // false, because p1 and p2 reference different instances
        System.out.println(p1.equals(p2)); // true, assuming equals() is correctly overridden

    }
}
