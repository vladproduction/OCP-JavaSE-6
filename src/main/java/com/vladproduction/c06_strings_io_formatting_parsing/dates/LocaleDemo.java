package com.vladproduction.c06_strings_io_formatting_parsing.dates;

import java.util.Locale;

public class LocaleDemo {
    public static void main(String[] args) {
        /**
         * Locale class is used to represent a specific geographical, political, or cultural region.
         * It provides methods for creating locale instances and formatting various aspects of data
         * (like dates, numbers, currencies) according to a specific locale.
         *
         * a few common methods provided by the Locale class:
         *  getLanguage(): Returns the language code.
         *  getCountry(): Returns the country code.
         *  getDisplayName(): Provides a human-readable name for the locale.
         *  forLanguageTag(String languageTag): Creates a Locale using a language tag.
         * */
        //The two Locale constructors we need to understand:
        //Locale(String language)
        //Locale(String language, String country)

        Locale locale = new Locale("ukr", "UA");
        System.out.println("Language: " + locale.getLanguage());
        System.out.println("Country: " + locale.getCountry());
        System.out.println("Display Name: " + locale.getDisplayName());

        /*Language: ukr
        Country: UA
        Display Name: Ukrainian (Ukraine)*/

    }
}
