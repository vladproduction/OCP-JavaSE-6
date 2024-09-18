package com.vladproduction.c06_strings_io_formatting_parsing.parsing_tokenizing_formatting.tokenizing;


/**
 * look at two classes in the API that provide tokenizing capabilities:
 * String (using the split() method)
 * and Scanner;
 * */
public class Tokens_and_Delimiters {
    public static void main(String[] args) {

        //source: "ab,cd5b,6x,z4"
        String source = "ab,cd5b,6x,z4";
        String[] strings_split = source.split(","); //delimiter as comma
        int count = 1;
        for (String s : strings_split) {
            System.out.print(count + ") " + s + " ");
            count++;
        }
        System.out.println();
        System.out.println("--------------------------------");

        /*but declare our delimiter to be \d, we get three tokens:
        ab,cd
        b,
        x,z*/
        strings_split = source.split("\\d"); //defined digits to be delimiters, so the 5, 6, and 4 do not appear in the final tokens
        count = 1;
        for (String s : strings_split) {
            System.out.print(count + ") " + s + " ");
            count++;
        }



    }
}
