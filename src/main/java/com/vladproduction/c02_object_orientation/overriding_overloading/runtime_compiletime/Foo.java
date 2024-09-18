package com.vladproduction.c02_object_orientation.overriding_overloading.runtime_compiletime;

public class Foo {
    public static void main(String[] args) {
        Foo foo = new Foo();
        foo.doStuff(); //superclass
        Bar bar = new Bar();
        bar.doStuff();// //superclass through inheritance
        bar.doStuff("some task description here");
    }

    public void doStuff(){
        System.out.println("doStuff(): Foo");
    }

}

class Bar extends Foo{

    public void doStuff(String s){
        System.out.println("doStuff(String s): Bar " + s);
    }

    /**
     * The Bar class has two doStuff() methods: the no-arg version it inherits
     * from Foo (and does not override), and the overloaded doStuff(String s) defined in the
     * Bar class. Code with a reference to a Foo can invoke only the no-arg version, but code
     * with a reference to a Bar can invoke either of the overloaded versions.
     * */

}
