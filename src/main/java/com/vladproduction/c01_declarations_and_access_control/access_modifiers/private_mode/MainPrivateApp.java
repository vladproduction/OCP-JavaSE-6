package com.vladproduction.c01_declarations_and_access_control.access_modifiers.private_mode;

public class MainPrivateApp {
    public static void main(String[] args) {

        FunClass funClass = new FunClass();
//        funClass.funMethod(); can not access - method is private;

        PartyClass partyClass = new PartyClass();
        partyClass.partyMethod();

    }
}
