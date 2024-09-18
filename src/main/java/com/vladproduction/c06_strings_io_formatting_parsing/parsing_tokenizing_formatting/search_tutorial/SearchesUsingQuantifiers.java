package com.vladproduction.c06_strings_io_formatting_parsing.parsing_tokenizing_formatting.search_tutorial;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchesUsingQuantifiers {
    public static void main(String[] args) {
        /*0[xX][0-9a-fA-F]
        The preceding expression could be stated: "Find a set of characters in which the
        first character is a "0", the second character is either an "x" or an "X", and the third
        character is either a digit from "0" to "9", a letter from "a" to "f" or an uppercase
        letter from "A" to "F" ". Using the preceding expression, and the following data,
        source: "12 0x 0x12 0Xf 0xg"
        index: 012345678901234567
        regex would return 6 and 11. (Note: 0x and 0xg are not valid hex numbers.)*/

        Pattern p = Pattern.compile("0[xX][0-9a-fA-F]");
        Matcher m = p.matcher("12 0x 0x12 0Xf 0xg");
        while (m.find()){
            System.out.print(m.start() + " ");
        }
        //6 11
        System.out.println();
        System.out.println("------group---------");
        /*quantifier that represents "one or more" is the "+" character*/
        /*source: "1 a12 234b"
        pattern: \d+*/
        p = Pattern.compile("\\d+");
        m = p.matcher("1 a12 234b");
        while (m.find()){
            System.out.print(m.start() + " " + m.group() + "\n");
        }
        /*0 1
        3 12
        6 234*/


    }
}
