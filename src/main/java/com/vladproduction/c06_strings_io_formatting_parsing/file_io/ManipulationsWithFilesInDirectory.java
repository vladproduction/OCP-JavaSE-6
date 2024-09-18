package com.vladproduction.c06_strings_io_formatting_parsing.file_io;

import java.io.File;
import java.io.IOException;

public class ManipulationsWithFilesInDirectory {
    public static void main(String[] args) throws IOException {
        File delDir = new File("delDir");
        delDir.mkdir(); //make directory

        File delFile1 = new File(
                delDir, "delFile1.txt"); // add file to directory
        delFile1.createNewFile();
        File delFile2 = new File(
                delDir, "delFile2.txt"); // add file to directory
        delFile2.createNewFile();

        delFile1.delete(); // delete a file
        System.out.println("delDir is "
                + delDir.delete()); // attempt to delete the directory

        File newName = new File(delDir, "newName.txt"); // a new object
        delFile2.renameTo(newName); // rename file
        File newDir = new File("newDir"); // rename directory
        delDir.renameTo(newDir);
    }
}
