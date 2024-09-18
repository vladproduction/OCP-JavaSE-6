package com.vladproduction.c01_declarations_and_access_control.access_modifiers.protected_mode.package2;

import com.vladproduction.c01_declarations_and_access_control.access_modifiers.protected_mode.package1.Parent;

public class Child extends Parent {

    public void testInheritanceAccess(){
        System.out.println("testReferenceAccess(): access is completed!");
        System.out.println("x = " + x);
    }

    public void testReferenceAccess(){
        Parent parent = new Parent();
        System.out.println("testReferenceAccess(): make variable 'x' public to get access");
//        System.out.println("parent.x = " + parent.x);

    }


}
