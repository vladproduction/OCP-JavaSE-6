package com.vladproduction.c06_strings_io_formatting_parsing.parsing_tokenizing_formatting.tokenizing;


import java.util.Scanner;

/**
 * following features:
 * ■ Scanners can be constructed using files, streams, or Strings as a source.
 * ■ Tokenizing is performed within a loop so that you can exit the process at any point.
 * ■ Tokens can be converted to their appropriate primitive types automatically.
 *
 * The program makes two Scanner objects: s1 is iterated over with the more generic
 * next() method, which returns every token as a String, while s2 is analyzed with
 * several of the specialized nextXxx() methods (where Xxx is a primitive type):
 * */
public class Tokenizing_with_Scanner {
    public static void main(String[] args) {

        boolean b2, b;
        int i;
        String s, hits = " ";
        Scanner s1 = new Scanner(args[0]);
        Scanner s2 = new Scanner(args[0]);

        while (b = s1.hasNext()){
            s = s1.next();
            hits += "s";
        }

        while (b = s2.hasNext()){

            if(s2.hasNextInt()){
                i = s2.nextInt();
                hits += "i";
            } else if (s2.hasNextBoolean()) {
                b2 = s2.nextBoolean();
                hits += "b";
            } else {
                s2.next();
                hits += "s2";
            }

        }
        System.out.println("hits " + hits); //hits  ssssibis2

    }
}
