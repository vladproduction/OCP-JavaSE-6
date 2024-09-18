package com.vladproduction.c08_inner_classes.answers_c08.test7;

public class Tour {
    public static void main(String[] args) {
        Cathedral c = new Cathedral();
        //inserted code here:
        Cathedral.Sanctum s = c.new Sanctum();  //A
//        Cathedral.Sanctum s = c.new Sanctum();    //D
        s.go();

    }
}

class Cathedral {
    class Sanctum {
        void go() {
            System.out.println("spooky");
        }
    }
}

/*
Which, inserted independently at line 6, compile and produce the output "spooky"? (Choose all
that apply.)
+A. Sanctum s = c.new Sanctum();
B. c.Sanctum s = c.new Sanctum();
C. c.Sanctum s = Cathedral.new Sanctum();
+D. Cathedral.Sanctum s = c.new Sanctum();
E. Cathedral.Sanctum s = Cathedral.new Sanctum();*/

