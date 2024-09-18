package com.vladproduction.c06_strings_io_formatting_parsing.file_io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class WaysToCreateFile {
    public static void main(String[] args) {

        //way#1
        File file1 = new File("foo1"); //no file yet
        try {
            file1.createNewFile(); //creating file here (in the root place of the project)
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //way#2
        File file2 = new File("foo2"); // no file yet
        try {
            PrintWriter pw = new PrintWriter(file2);    // make a PrintWriter object AND
                                                        // make a file, "foo" to which
                                                        // 'file' is assigned, AND assign
                                                        // 'pw' to the PrintWriter
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
