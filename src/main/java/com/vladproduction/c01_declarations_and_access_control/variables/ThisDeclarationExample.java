package com.vladproduction.c01_declarations_and_access_control.variables;

/**
 * The keyword this always,
 * always, always refers to the object currently running.
 * */
public class ThisDeclarationExample {

    int size = 10;

    //in constructor
    public ThisDeclarationExample(int size) {
        this.size = size;
    }

    //in method
    public void setSize(int size){
        this.size = size;
        // this.size means the current object's
        // instance variable, size. The size
        // on the right is the parameter
    }
}
