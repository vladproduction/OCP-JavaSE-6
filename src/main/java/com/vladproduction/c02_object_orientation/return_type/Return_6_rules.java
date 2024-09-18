package com.vladproduction.c02_object_orientation.return_type;

import java.util.Arrays;

public class Return_6_rules {
    public static void main(String[] args) {
        //1) return null
        System.out.println("1) " + function());

        //2)array as return type
        System.out.println("2) " + Arrays.toString(names()));

        //3)with a primitive return type, you can return any value or
        //variable that can be implicitly converted to the declared return type
        System.out.println("3) " + convertImplicitly()); //hard coded

        //4)with a primitive return type, you can return any value or
        // variable that can be explicitly cast to the declared return type
        System.out.println("4) " + convertExplicitly());

        //5) void - is not return anything from a method
        System.out.print("5) " );
        bar();

        //6)a method with an object reference return type, you can return any
        // object type that can be implicitly cast to the declared return type.
        System.out.println("6)");
        System.out.print("-a- ");
        Animals animals = new Animals();
        System.out.println(animals.getAnimal());
        System.out.print("-b- ");
        System.out.println(getObject());
        System.out.print("-c- ");
        System.out.println(Gum.getChewable());



    }

    static Object function(){
        return null;
    }

    static String [] names(){
        return new String [] {"Aaa", "Bbb", "Ccc"};
    }

    static int convertImplicitly(){
        char c = 'c';
        return c;
    }

    static int convertExplicitly() {
        float f = 32.5f;
        return (int) f;
    }

    static void bar() {
        System.out.println("no return type of this method");
    }

    static Object getObject(){
        int [] numbs = {1, 2, 3};
        return Arrays.toString(numbs);
    }

}

class Animals{
    public Animals getAnimal(){

        return new Frog("Frog");
    }
}

class Frog extends Animals{
    private String name;

    public Frog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Frog{" +
                "name='" + name + '\'' +
                '}';
    }
}

interface Chewable{

}

class Gum implements Chewable{
    private String name;

    public Gum(String name) {
        this.name = name;
    }

    // Method with an interface return type
    public static Chewable getChewable(){
        return new Gum("Turbo"); // Return interface implementer
    }

    @Override
    public String toString() {
        return "Gum{" +
                "name='" + name + '\'' +
                '}';
    }
}

