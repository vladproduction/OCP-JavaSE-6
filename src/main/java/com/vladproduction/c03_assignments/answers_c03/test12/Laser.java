package com.vladproduction.c03_assignments.answers_c03.test12;

public class Laser {
    public static void main(String[] args) {
        Box b1 = new Box(5);
        Box[] ba = go(b1, new Box(6));
        ba[0] = b1;
        for(Box b : ba) {
            System.out.print(b.size + " "); //4 4 --> 'A'
        }
    }

    static Box[] go(Box b1, Box b2) {
        b1.size = 4;
        Box[] ma = {b2, b1};
        return ma;
    }

}

class Box {
    int size;

    Box(int s) {
        size = s;
    }
}
