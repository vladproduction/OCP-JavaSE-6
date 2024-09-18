package com.vladproduction.c06_strings_io_formatting_parsing.parsing_tokenizing_formatting.formatting_printf_format;

public class Printf_Demo {
    public static void main(String[] args) {
        System.out.printf("%2$d + %1$d", 123, 456);
        //456 + 123
        //%[arg_index$][flags][width][.precision]conversion char

        /*
        * arg_index An integer followed directly by a $, this indicates which argument
        should be printed in this position.

        * flags need to know:
        ■ "-" Left justify this argument
        ■ "+" Include a sign (+ or -) with this argument
        ■ "0" Pad this argument with zeroes
        ■ "," Use locale-specific grouping separators (i.e., the comma in 123,456)
        ■ "(" Enclose negative numbers in parentheses

        * width This value indicates the minimum number of characters to print. (If you
        want nice even columns, you'll use this value extensively.)

        * precision For the exam you'll only need this when formatting a floating-point
        number, and in the case of floating point numbers, precision indicates the number of
        digits to print after the decimal point.

        * conversion The type of argument you'll be formatting. You'll need to know:
        ■ b boolean
        ■ c char
        ■ d integer
        ■ f floating point
        ■ s string*/

        System.out.println();
        int i1 = -123;
        int i2 = 12345;
        System.out.printf(">%1$(7d< \n", i1);
        System.out.printf(">%0,7d< \n", i2);
        System.out.format(">%+-7d< \n", i2);
        System.out.printf(">%2$b + %1$5d< \n", i1, false);

        //case if mismatch between the type specified in your conversion character
//        System.out.format("%d", 12.3); //d != java.lang.Double


    }
}
