package com.vladproduction.c06_strings_io_formatting_parsing.file_io;

import java.io.File;
import java.io.IOException;

public class Writer1 {
    public static void main(String [] args) {
        firstInvoke();
        System.out.println("---");
        secondInvoke();
        /*false
        true
        true
        ---
        true
        false
        true*/

    }

    //fist time to check if file exist, create and check again
    private static void firstInvoke() {
        try { // warning: exceptions possible
            boolean newFile = false;
            File file = new File // it's only an object
                    ("fileWrite1.txt");
            System.out.println(file.exists()); // look for a real file
            newFile = file.createNewFile(); // maybe create a file!
            System.out.println(newFile); // already there?
            System.out.println(file.exists()); // look again
        } catch(IOException e) {
            e.getMessage();
        }
    }

    //just check for the output in accordance by firstInvoke scenario:
    private static void secondInvoke(){
        try{
            boolean isExist = false;
            File file = new File("fileWrite1.txt");
            System.out.println(file.exists()); //true expected
            isExist = file.createNewFile(); //creating new file
            System.out.println(isExist); //false expected
            System.out.println(file.exists()); //true expected
        }catch (IOException e){
            e.getMessage();
        }
    }
}
