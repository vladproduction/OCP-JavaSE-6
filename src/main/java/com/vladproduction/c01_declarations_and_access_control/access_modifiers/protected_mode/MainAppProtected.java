package com.vladproduction.c01_declarations_and_access_control.access_modifiers.protected_mode;

import com.vladproduction.c01_declarations_and_access_control.access_modifiers.protected_mode.package2.Child;
import com.vladproduction.c01_declarations_and_access_control.access_modifiers.protected_mode.package2.SubChild;

public class MainAppProtected {


    /**
     * For a subclass outside the package, the protected member can be accessed only
     * through inheritance.
     * */
    public static void main(String[] args) {

        Child child = new Child();
        child.testInheritanceAccess();
        child.testReferenceAccess();

        System.out.println("===========");
        SubChild subChild = new SubChild();
        subChild.testInvoke_x();

    }
}
