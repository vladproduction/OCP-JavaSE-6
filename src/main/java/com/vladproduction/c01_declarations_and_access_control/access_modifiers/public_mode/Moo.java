package com.vladproduction.c01_declarations_and_access_control.access_modifiers.public_mode;

public class Moo {

    public void mooMethod(){
        Zoo zoo = new Zoo();
        System.out.println(this.getClass().getSimpleName());
        System.out.println("mooMethod() is using method from Zoo.class: " + zoo.zooMethod());
    }
}
