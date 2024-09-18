package com.vladproduction.c06_strings_io_formatting_parsing.answers_c06.test9;

public class Theory {
    public static void main(String[] args) {
        String s1 ="abc";
        String s2 = s1;
        s1 += "d";
        System.out.println(s1 + " " + s2 + " " + (s1 == s2)); //abcd abc false

        oneObject(); //abcd abcd true

        twoObjects(); //abcd abc false

        //  first line: abcd abc false
        //  second line: abcd abcd true

        //answer: D F
    }

    private static void oneObject() {
        //the single StringBuffer object to which both StringBuffer references refer.
        System.out.println("===========sb2 = sb1=============");
        StringBuffer sb1 = new StringBuffer("abc");
        System.out.println("1) " + sb1);
        StringBuffer sb2 = sb1;
        System.out.println("2) " + sb2);
        sb1.append("d");
        System.out.println("sb1.append('d')");
        System.out.println(sb1 + " " + sb2 + " " + (sb1==sb2)); //abcd abcd true
    }

    private static void twoObjects() {
        System.out.println("===========sb2 = new StringBuffer(\"abc\");=============");
        StringBuffer sb1 = new StringBuffer("abc");
        System.out.println("1) " + sb1);
        StringBuffer sb2 = new StringBuffer("abc");
        System.out.println("2) " + sb2);
        sb1.append("d");
        System.out.println("sb1.append('d')");
        System.out.println(sb1 + " " + sb2 + " " + (sb1==sb2)); //abcd abc false
    }
}

        /*
        Answer:
                ✓ D and F are correct. While String objects are immutable, references to Strings are mutable.
        The code s1 += "d"; creates a new String object. StringBuffer objects are mutable, so the
        append() is changing the single StringBuffer object to which both StringBuffer references
        refer.
          A, B, C, E, and G are incorrect based on the above. (Objective 3.1)*/
