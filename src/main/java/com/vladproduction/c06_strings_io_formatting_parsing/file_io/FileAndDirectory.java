package com.vladproduction.c06_strings_io_formatting_parsing.file_io;

import java.io.*;

public class FileAndDirectory {
    public static void main(String[] args) throws IOException {

        //assume that we already have a directory and file in it with some lines of text;

        File existingDir = new File("existingDir"); // assign a dir
        System.out.println(existingDir.isDirectory()); //true

        File existingDirFile = new File(existingDir, "existingDirFile.txt"); // assign a file
        System.out.println (existingDirFile.isFile()); //true

        FileReader fr = new FileReader(existingDirFile);
        BufferedReader br = new BufferedReader(fr); // make a Reader
        String s;
        while( (s = br.readLine()) != null) // read data
            System.out.println(s);
                                    //        line 1  - FileReader
                                    //        line 2  - BufferedReader

        br.close();


    }
}
