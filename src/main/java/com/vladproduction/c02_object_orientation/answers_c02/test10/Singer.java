package com.vladproduction.c02_object_orientation.answers_c02.test10;

public class Singer {

    public static String sing(){
        return "la";
    }

}
class Tenor extends Singer {
    public static void main(String[] args) {
        Tenor t = new Tenor();
        Singer s = new Tenor();
        System.out.println(t.sing() + " " + s.sing()); //fa la
    }

    public static String sing(){
        return "fa";
    }
}
