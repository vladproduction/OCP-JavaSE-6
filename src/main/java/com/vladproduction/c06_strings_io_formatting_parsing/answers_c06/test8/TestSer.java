package com.vladproduction.c06_strings_io_formatting_parsing.answers_c06.test8;

import java.io.*;

public class TestSer {
    public static void main(String[] args) {

        SpecialSerial s = new SpecialSerial();

        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("myFileQQQ8"));

            os.writeObject(s);
            os.close();
            System.out.print(++s.z + " "); //10
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("myFileQQQ8"));
            SpecialSerial s2 = (SpecialSerial)is.readObject();
            is.close();

            System.out.println(s2.y + " " + s2.z); //0 10
        }catch (Exception x) {
            System.out.println("exc");
        }
        //final output: 10 0 10
        //answer: C

        System.out.println("main finish");


    }
}

class SpecialSerial implements Serializable {
    transient int y = 7;
    static int z = 9;

}

        /*Answer:
                ✓ C and F are correct. C is correct because static and transient variables are not
        serialized when an object is serialized. F is a valid statement.
          A, B, D, and E are incorrect based on the above. G is incorrect because you
        don't implement the defaultReadObject() method, you call it from within the
        readObject()method, along with any custom read operations your class needs.
                (Objective 3.3)*/
