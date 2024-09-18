package com.vladproduction.c06_strings_io_formatting_parsing.file_io;

import java.io.File;

public class HowToSearchFilesTroughDirectory {
    public static void main(String[] args) {
        String[] files;
        File search = new File("searchThis");
        files = search.list(); // create the list

        for(String fn : files) // iterate through it
            System.out.println("found " + fn);

        /*found dir1
        found dir2
        found file1.txt
        found file2.txt
        found file3.txt*/
    }
}
