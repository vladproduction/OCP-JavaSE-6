package com.vladproduction.c05_control_flow_exceptions_assertions.answers_c05.test8;

public class Ebb {
    static int x = 7;
    static {
        x++;
    }
    public static void main(String[] args) {

        String s = "";
        for(int y = 0; y < 3; y++){
            x++;
            switch (x){
                case 8: s += "8 ";
                case 9: s += "9 ";
                case 10: { s+= "10 "; break; }
                default: s += "d ";
                case 13: s+= "13 ";
            }
        }
        //1) "" + 9  + 10
        //2) 9 10 + 10
        //3) 9 10 10  + d + 13 //fall-through
        System.out.println(s);//9 10 10 d 13
    }
    //answer: D
}


