package com.vladproduction.c01_declarations_and_access_control.variables;

/**
 * to declare a local variable with the same name as an instance
 * variable. It's known as shadowing, as the following code demonstrates
 * */
public class Shadowing {
    public static void main(String[] args) {
        new Shadowing().login();
        new Shadowing().count();
    }

    int count = 10;
     public void login(){
         int count = 11;
         System.out.println("Local variable count is: " + count);
     }

     public void count(){
         System.out.println("Instance variable is: " + count);
     }

}
