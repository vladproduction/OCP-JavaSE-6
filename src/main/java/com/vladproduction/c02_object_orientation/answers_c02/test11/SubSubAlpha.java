package com.vladproduction.c02_object_orientation.answers_c02.test11;

public class SubSubAlpha extends Alpha {
    public static void main(String[] args) {
        new SubSubAlpha();
        System.out.println(s);
    }

    private SubSubAlpha(){
        System.out.println("3");
        s += "subsub ";
    }

}