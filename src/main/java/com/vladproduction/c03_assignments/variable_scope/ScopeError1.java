package com.vladproduction.c03_assignments.variable_scope;

/**
 * Attempting to access an instance variable from a static context (main() for example)
 * */
public class ScopeError1 {

    int x = 5;

    public static void main(String[] args) {
//        x++; // won't compile, x is an 'instance' variable
    }

}
