package com.vladproduction.c01_declarations_and_access_control.access_modifiers.public_mode;

public class Football extends Sport{

    public void usingFootballMethod(){
        System.out.println("Football.class is invoke method from its superclass: " + this.sportMethod());
        Sport sport = new Sport();
        System.out.println("Sport.class say: " + sport.sportMethod());
    }

}
