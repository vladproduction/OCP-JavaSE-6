package com.vladproduction.c03_assignments.literals;

public class LiteralDemo {

    char b = 'b'; // char literal
    int x = 42; // int literal
    boolean failFlag = false; // boolean literal
    double y = 2546789.343; // double literal

    //decimal
    int length = 10;

    //y may also be specified as long by placing a suffix of L or l after the
    //number
    long jo = 110599L;
    long so = 0xFFFFl; // Note the lowercase 'l'

    //float-point literal
    double d = 11301874.9881024;

//    float f = 23.467890; // Compiler error, possible loss
    // of precision
    //must attach the suffix F or f to the number
    float g = 49837849.029847F; // OK; has the suffix "F"

    double d1 = 110599.995011D; // Optional, not required
    double g1 = 987.897; // No 'D' suffix, but OK because the
    // literal is a double by default


    //character literals
    //A char literal is represented by a single character in single quotes.
    char a = 'a';
    char b2 = '@';
    char letterN = '\u004E'; // The letter 'N'

    char a2 = 0x892; // hexadecimal literal
    char b3 = 982; // int literal
    char c = (char)70000; // The cast is required; 70000 is
    // out of char range (65535 or less)
    char d3 = (char) -98; // Ridiculous, but legal


}
