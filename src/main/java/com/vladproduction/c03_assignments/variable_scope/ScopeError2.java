package com.vladproduction.c03_assignments.variable_scope;

/**
 * Attempting to access a local variable from a nested method
 * */
public class ScopeError2 {
    public static void main(String[] args) {
        ScopeError2 scopeError2 = new ScopeError2();
        scopeError2.go();
    }

    void go() {
        int y = 5;
        go2();
        y++; // once go2() completes, y is back in scope
        System.out.println("y after incrementing in go() = " + y);
    }

    void go2() {
//        y++; // won't compile, y is local to go()
        System.out.println("go2(): y++; won't compile, y is local to go()");
    }
}
