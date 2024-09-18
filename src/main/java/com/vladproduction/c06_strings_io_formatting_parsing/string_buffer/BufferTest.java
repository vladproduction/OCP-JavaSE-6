package com.vladproduction.c06_strings_io_formatting_parsing.string_buffer;

public class BufferTest {
    public static void main(String[] args) {
        //StringBuffer instead of a String, the code would look like this:
        StringBuffer sb = new StringBuffer("abc");
        sb.append("def");
        System.out.println("sb = " + sb); // output is "sb = abcdef"

        //method will take many different arguments, including boolean, char, double, float, int, long, and others

        //public synchronized StringBuffer reverse():
        StringBuffer sb2 = new StringBuffer("A man a plan a canal Panama");
        sb2.reverse();
        System.out.println(sb2); // output: "amanaP lanac a nalp a nam A"

        //public String toString():
        StringBuffer sb3 = new StringBuffer("test string");
        System.out.println( sb3.toString() ); // output is "test string"

    }
}
