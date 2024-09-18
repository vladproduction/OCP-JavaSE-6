package com.vladproduction.c01_declarations_and_access_control.access_modifiers.protected_mode.package2;

public class SubChild {

    public void testInvoke_x(){
        System.out.println("testInvoke_x():");
        Child child = new Child();
//        System.out.println(child.x);
        child.testInheritanceAccess();
        child.testReferenceAccess();
    }

}
