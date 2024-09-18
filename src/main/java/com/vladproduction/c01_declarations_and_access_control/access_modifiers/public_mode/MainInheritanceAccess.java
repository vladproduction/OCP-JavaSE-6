package com.vladproduction.c01_declarations_and_access_control.access_modifiers.public_mode;


/**
 * if a subclass inherits a member, it's
 * exactly as if the subclass actually declared the member itself. In other words, if a
 * subclass inherits a member, the subclass has the member;
 * tip: If the class itself will not be visible to another class, then
 * none of the members will be either;
 * */
public class MainInheritanceAccess {
    public static void main(String[] args) {

        Football football = new Football();
        football.usingFootballMethod();

    }
}
