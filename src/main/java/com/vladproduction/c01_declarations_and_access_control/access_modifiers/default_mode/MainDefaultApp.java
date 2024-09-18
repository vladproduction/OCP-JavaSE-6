package com.vladproduction.c01_declarations_and_access_control.access_modifiers.default_mode;

public class MainDefaultApp extends ParentCl{
    public static void main(String[] args) {

        MainDefaultApp defaultApp = new MainDefaultApp();
        defaultApp.testMethod();

    }

    private void testMethod() {
        System.out.println("Variable as default here: x = " + x); //11
    }
}
