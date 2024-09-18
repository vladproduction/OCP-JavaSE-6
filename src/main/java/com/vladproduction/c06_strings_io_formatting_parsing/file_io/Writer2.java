package com.vladproduction.c06_strings_io_formatting_parsing.file_io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Using FileWriter and FileReader
 * */
public class Writer2 {
    public static void main(String[] args) {
        char [] bucket = new char[50];
        int size = 0;
        try{
            File file = new File("fileWrite2.txt"); //create obj File
            FileWriter fileWriter = new FileWriter(file); //create obj FileWriter on the base of file
            fileWriter.write("elementA\nelementB\n"); //write content to the file
            fileWriter.flush(); // flush before closing
            fileWriter.close(); // close file when done

            FileReader fileReader = new FileReader(file); // create a FileReader object
            size = fileReader.read(bucket); //read content from file whole file!
            System.out.print(size + " \n"); // how many bytes read
            for(char c : bucket) // print the array with read content
                System.out.print(" " + c);
            fileReader.close(); //always close source
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
