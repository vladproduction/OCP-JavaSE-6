package com.vladproduction.c06_strings_io_formatting_parsing.string_builder;

public class BuilderDemo {
    public static void main(String[] args) {
        /*method calls can be chained to each other:*/
        StringBuilder sb = new StringBuilder("abc");
        sb.append("def").reverse().insert(3, "---");
        System.out.println( sb ); // output is: "fed---cba"

        //public StringBuilder delete(int start, int end):
        StringBuilder sb2 = new StringBuilder("0123456789");
        System.out.println(sb2.delete(4,6)); // output is "01236789"

        //public StringBuilder insert(int offset, String s); (the offset is zero-based):
        StringBuilder sb3 = new StringBuilder("01234567");
        sb3.insert(4, "---");
        System.out.println( sb3 ); // output is "0123---4567"


    }
}
