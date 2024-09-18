package com.vladproduction.c06_strings_io_formatting_parsing.string;

public class StringDemo {
    public static void main(String[] args) {
        String x = "abc";
        x.concat("def");
        System.out.println("x = " + x); // output is "x = abc"
        /*Because no new assignment was made, the new String object created with the
        concat() method was abandoned instantly.*/

        //also:
        String x2 = "abc";
        x2 = x2.concat("def");
        System.out.println("x2 = " + x2); // output is "x = abcdef"
        /*We got a nice new String out of the deal, but the downside is that the old String
        "abc" has been lost in the String pool, thus wasting memory.*/

        //chain-flow example:
        String x3 = "abc";
        String y = x3.concat("def").toUpperCase().replace('C','x');
        //chained methods
        System.out.println("y = " + y); // result is "y = ABxDEF"
        /*The literal def was concatenated to abc,
          creating a temporary, intermediate String (soon to be lost), with the value abcdef.
          The toUpperCase() method created a new (soon to be lost) temporary String with
          the value ABCDEF. The replace() method created a fi nal String with the value ABxDEF,
          and referred y to it.*/

    }
}
