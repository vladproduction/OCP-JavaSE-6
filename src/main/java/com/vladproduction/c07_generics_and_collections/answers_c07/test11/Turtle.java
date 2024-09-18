package com.vladproduction.c07_generics_and_collections.answers_c07.test11;

public class Turtle {
    int size;

    public Turtle(int size) {
        this.size = size;
    }
    public boolean equals(Object o){
        return (this.size == ((Turtle)o).size);
    }

    //I.
//    public int hashCode(){
//        return size/5;
//    }

    //II.
    // no hashCode method declared

}
