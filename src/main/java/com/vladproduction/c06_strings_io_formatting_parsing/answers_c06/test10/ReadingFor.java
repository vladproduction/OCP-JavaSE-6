package com.vladproduction.c06_strings_io_formatting_parsing.answers_c06.test10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFor {
    public static void main(String[] args) {
        String s;
        try {
            FileReader fr = new FileReader("my_file_task10.txt");
            BufferedReader br = new BufferedReader(fr);
            while ((s = br.readLine()) != null){
                System.out.println(s);
            }
//            br.flush(); // compilation fails
        } catch (IOException e) {
            System.out.println("io error");
        }
    }

    //answer: E

        /*Answer:
                ✓ E is correct. You need to call flush() only when you're writing data. Readers don't have
        flush() methods. If not for the call to flush(), answer C would be correct.
                 A, B, C, and D are incorrect based on the above. (Objective 3.2)*/


}
