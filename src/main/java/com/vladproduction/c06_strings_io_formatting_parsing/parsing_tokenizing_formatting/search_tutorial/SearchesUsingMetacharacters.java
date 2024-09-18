package com.vladproduction.c06_strings_io_formatting_parsing.parsing_tokenizing_formatting.search_tutorial;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * the following expression is
 * used to look for numeric digits:
 * \d
 * */
public class SearchesUsingMetacharacters {
    public static void main(String[] args) {

        System.out.println("---------digit character---------------");

        /*source: a12c3e456f
        index: 0123456789*/

        Pattern p = Pattern.compile("\\d");
        Matcher m = p.matcher("a12c3e456f");
        while (m.find()){
            System.out.print(m.start() + "; ");
        }
        //1, 2, 4, 6, 7, 8
        System.out.println();

        System.out.println("---------whitespace character---------------");
        /*
        \d A digit
        \s A whitespace character
        \w A word character (letters, digits, or "_" (underscore))
        So for example, given
        source: "a 1 56 _Z"
        index: 012345678
        pattern: \w*/
        p = Pattern.compile("\\s");
        m = p.matcher("a 1 56 _Z");
        while (m.find()){
            System.out.print(m.start() + "; ");
        }
        //1, 3, 6
        System.out.println();
        System.out.println("---------word character (letters, digits, or \"_\" (underscore)---------------");
        p = Pattern.compile("\\w");
        m = p.matcher("a 1 56 _Z");
        while (m.find()){
            System.out.print(m.start() + "; ");
        }
        //0 2 4 5 7 8


    }
}
