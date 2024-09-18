package com.vladproduction.c06_strings_io_formatting_parsing.file_io;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class HowToCreateDirectory {
    public static void main(String[] args) throws IOException {
        File myDir = new File("mydir"); // create an object
        myDir.mkdir(); // create an actual directory

        File myFile = new File(myDir, "myFile.txt"); //create a file in mydir
        myFile.createNewFile();

        PrintWriter pw = new PrintWriter(myFile); //write some info into the file
        pw.println("new stuff");
        pw.flush();
        pw.close();

        /*As we've seen, constructing a
        Writer or a Stream will often create a file for you automatically if one doesn't exist,
        but that's not true for a directory:
        File myDir = new File("mydir");
        // myDir.mkdir(); // call to mkdir() omitted!
        File myFile = new File(myDir, "myFile.txt");
        myFile.createNewFile(); // exception if no mkdir!
        This will generate an exception something like
        java.io.IOException: No such file or directory*/
    }
}
