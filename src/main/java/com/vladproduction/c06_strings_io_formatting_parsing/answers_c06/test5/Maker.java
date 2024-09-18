package com.vladproduction.c06_strings_io_formatting_parsing.answers_c06.test5;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Using the fewest fragments possible (and filling the fewest slots possible), complete the code
 * below so that the class builds a directory named "dir333" and creates a file named "file333" inside
 * "dir333". Note you can use each fragment either zero or one times.
 *
 * Fragments:
 *  File; FileDescriptor; FileWriter; Directory;
 *  try { .createNewDir(); File dir File
 *  { } (Exception x) ("dir333"); file
 *  file .createNewFile(); = new File = new File
 *  dir (dir, "file333"); (dir, file); .createFile();
 *  } catch ("dir333", "file333"); .mkdir(); File file
 *
 * */
public class Maker {
    public static void main(String[] args) {

        //variant#1
        try {
        //1) builds a directory named "dir333":
        File dir333 = new File("dir333");
        dir333.mkdir();

        //2) creates a file named "file333" inside "dir333"
        File file333 = new File(dir333, "file333");
        file333.createNewFile();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //variant#2
        try {
            Path dir = Paths.get("dir444");
            Files.createDirectory(dir); // Create the directory

            Path file = dir.resolve("file444"); // Define the file path
            Files.createFile(file); // Create the file
        } catch (Exception e) {
            e.printStackTrace(); // Handle exceptions if necessary
        }

        /*Answer:
        import java.io.File;
        class Maker {
            public static void main(String[] args) {
                try {
                    File dir = new File("dir3");
                    dir.mkdir();
                    File file = new File(dir, "file3");
                    file.createNewFile();
                } catch (Exception x) { }
            } }
        Notes: The new File statements don't make actual files or directories, just objects. You
        need the mkdir() and createNewFile() methods to actually create the directory and
        the file. (Objective 3.2)*/


    }
}
