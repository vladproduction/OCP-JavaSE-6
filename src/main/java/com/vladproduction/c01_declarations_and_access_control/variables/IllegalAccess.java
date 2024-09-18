package com.vladproduction.c01_declarations_and_access_control.variables;

public class IllegalAccess {
    public static void main(String[] args) {
        //but it possible to access through 'shadowing'
    }

    public void loginIn(){
        int x = 10;
    }

    public void doSome(int t){
        // no access to local variable x;
//        x = t;
    }

}
