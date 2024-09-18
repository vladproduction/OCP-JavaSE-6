package com.vladproduction.c02_object_orientation.statics;

import static com.vladproduction.c02_object_orientation.statics.Counter.count;

public class Test1 {
    public static void main(String[] args) {

        new Counter();
        new Counter();
        new Counter();
        //1)access through import static reference to an instance variable
        Counter counter_instance = new Counter();
        int count = counter_instance.count;
        System.out.println("count = " + count);//4

        //2)or access through using the dot (.) operator on the class name (more preferable)
        System.out.println("Counter count is now: " + Counter.count); //4
    }
}

class Counter{
    static int count = 0;

    public Counter() {
        count += 1;
    }
}
