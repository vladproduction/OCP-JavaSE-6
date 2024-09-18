package com.vladproduction.c06_strings_io_formatting_parsing.parsing_tokenizing_formatting.tokenizing;

public class SplitTest {
    public static void main(String[] args) {
        String[] tokens = args[0].split(args[1]);
        System.out.println("count: " + tokens.length);

        for (String token : tokens) {
            System.out.println(">" + token + "<");
        }

        /*For the '.'  The correct syntax is
        String s = "ab.cde.fg";
        String[] tokens = s.split("\\.");*/
    }
}
