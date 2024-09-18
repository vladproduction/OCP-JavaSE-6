package com.vladproduction.c06_strings_io_formatting_parsing.answers_c06.test7;

import java.io.File;

public class Directories {
    static String [] dirs = {"dir1", "dir2"};

    public static void main(String[] args) {
        for (String d : dirs) {
            //output expected: false true

//            fragA(args, d); //false true
//            fragB(args, d); //false true
//            fragC(args, d); //false false
//            fragD(args, d); //false false

            //answer: A B

        }
    }

    private static void fragD(String[] args, String d) {
        // insert code 1 here
        String path = File.separator + d;

        File file = new File(path, args[0]);

        // insert code 2 here
        System.out.print(file.isFile() + " ");
    }

    private static void fragC(String[] args, String d) {
        // insert code 1 here
        String path = File.separator + d;

        File file = new File(path, args[0]);

        // insert code 2 here
        System.out.print(file.exists() + " ");
    }

    private static void fragB(String[] args, String d) {
        // insert code 1 here
        String path = d;

        File file = new File(path, args[0]);

        // insert code 2 here
        System.out.print(file.isFile() + " ");
    }

    private static void fragA(String[] args, String d) {
        // insert code 1 here
        String path = d;

        File file = new File(path, args[0]);

        // insert code 2 here
        System.out.print(file.exists() + " ");
    }


}
/*the invocation
java Directories file2.txt*/

//task:
/*is issued from a directory that has two subdirectories, "dir1" and "dir2", and that "dir1" has a file
"file1.txt" and "dir2" has a file "file2.txt", and the output is "false true"; which set(s)
of code fragments must be inserted? (Choose all that apply.)*/

//code fragments:
/*
A. (+)
String path = d;
System.out.print(file.exists() + " ");

B. (+)
String path = d;
System.out.print(file.isFile() + " ");

C. (-)
String path = File.separator + d;
System.out.print(file.exists() + " ");

D. (-)
String path = File.separator + d;
System.out.print(file.isFile() + " ");
*/

/*Answer:
        ✓ A and B are correct. Because you are invoking the program from the directory whose
direct subdirectories are to be searched, you don't start your path with a File.separator
character. The exists() method tests for either files or directories; the isFile()
method tests only for files. Since we're looking for a file, both methods work.
         C and D are incorrect based on the above. (Objective 3.2)*/
