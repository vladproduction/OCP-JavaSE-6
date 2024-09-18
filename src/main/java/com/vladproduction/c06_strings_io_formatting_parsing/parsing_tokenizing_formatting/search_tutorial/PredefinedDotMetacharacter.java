package com.vladproduction.c06_strings_io_formatting_parsing.parsing_tokenizing_formatting.search_tutorial;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * "." (dot) metacharacter mean: any character can serve here"
 * */
public class PredefinedDotMetacharacter {
    public static void main(String[] args) {

        /*source: "ac abc a c"
        pattern: a.c
        will produce the output
        3 abc
        7 a c*/

        Pattern p = Pattern.compile("a.c");
        Matcher m = p.matcher("ac abc a c");
        while (m.find()){
            System.out.println(m.start() + " " + m.group());
        }





    }
}
