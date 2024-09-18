package com.vladproduction.c07_generics_and_collections.generic_types;

import java.util.ArrayList;
import java.util.List;

public class TestWildcard {
    public static void main(String[] args) {
//        List<Integer> myList = new ArrayList<>();
        List<Object> myList = new ArrayList<>();
        Barr bar = new Barr();
        bar.doInsert(myList); //have to use a collection with method argument passed collection (List<Object> is not same as List<Integer>)
    }
}
class Barr{
    /*public  void doInsert(List<?> list){
        //generics are designed to maintain type safety at compile-time
//        list.add(new Person()); //not legal to add any type, compiler do know how use such collection
    }*/

    void doInsert(List<Object> list) {
        list.add(new Person()); //perfectly compile, because Person pass IS-A test for Object
    }
}
class Person{ }
