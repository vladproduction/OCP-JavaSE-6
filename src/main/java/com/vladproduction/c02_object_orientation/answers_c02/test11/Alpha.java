package com.vladproduction.c02_object_orientation.answers_c02.test11;
class Alpha {
    static String s = " ";
    protected Alpha(){
        System.out.println("1");
        s += "alpha ";
    }
}

class SubAlpha extends Alpha {
    private SubAlpha(){
        System.out.println("2");
        s += "sub ";
    }
}


