package com.vladproduction.c01_declarations_and_access_control.access_modifiers.private_mode;

public class PartyClass extends FunClass{

    /**
     * Since the subclass cannot inherit a private method,
     * it therefore cannot override the method —
     * overriding depends on inheritance
     * */
    public void partyMethod(){
        System.out.println("Want to use funMethod()? - make it package-private (public/protected)");
        System.out.println("And this funMethod() can not be overridden: overriding depends on inheritance");
//        System.out.println(funMethod());
    }

}
