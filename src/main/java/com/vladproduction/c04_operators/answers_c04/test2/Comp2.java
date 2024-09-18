package com.vladproduction.c04_operators.answers_c04.test2;

public class Comp2 {
    public static void main(String[] args) {
        float f1 = 2.3f;
        float[][] f2 = {{42.0f}, {1.7f, 2.3f}, {2.6f, 2.7f}};
        float[] f3 = {2.7f};
        Long x = 42L;
        // insert code here:
//        if(f1 == f2) //comp fail
        if(f1 == f2[2][1]) //false
            if(x == f2[0][0]) //true
//                if(f1 == f2[1,1]) //comp fail
                if(f3 == f2[2]) //false
        System.out.println("true");
    }

    //answer compile 3 'if statements' and only one is true;
    // D
}
