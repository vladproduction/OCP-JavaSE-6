package com.vladproduction.c06_strings_io_formatting_parsing.numbers_currencies;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * use this class to format numbers or currency values:
 * */
public class NumberFormatTest {
    public static void main(String[] args) {
        float f1 = 123.4567f;
        Locale locFR = new Locale("fr"); // France
        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(locFR);
        nfa[2] = NumberFormat.getCurrencyInstance();
        nfa[3] = NumberFormat.getCurrencyInstance(locFR);
        for(NumberFormat nf : nfa)
            System.out.println(nf.format(f1));
    }
}
