package com.vladproduction.c06_strings_io_formatting_parsing.string;

import java.util.Arrays;
import java.util.List;

public class StringImportantMethodsReview {
    public static void main(String[] args) {

        //1) Creating Strings:
        String str1 = "Hello"; //(String Literal)
        String str2 = new String("Hello2"); //(String Object)

        //2) int length() return length of the String
        str1.length();

        //3) Character Access:
        //char charAt(int index) - Returns the character at the specified index.
        str1.charAt(0);
        //char[] toCharArray() - Converts the string to a new character array.
        str1.toCharArray();

        //4) String Comparison:
        //boolean equals(Object obj) - Compares two strings for content equality.
        str1.equals(str2);
        //boolean equalsIgnoreCase(String anotherString) - Compares two strings, ignoring case considerations.
        str1.equalsIgnoreCase(str2);
        //int compareTo(String anotherString) - Compares two strings lexicographically.
        str1.compareTo(str2);

        //5) Substring:
        //String substring(int beginIndex) - Returns the substring starting from the specified index.
        str1.substring(0);
        //String substring(int beginIndex, int endIndex) - Returns the substring from the specified beginning index to the end index.
        str1.substring(1, 3);

        //6) Searching:
        //int indexOf(String str) - Returns the index of the first occurrence of the specified substring.
        str1.indexOf(2);
        //int lastIndexOf(String str) - Returns the index of the last occurrence of the specified substring.
        str1.lastIndexOf(3);

        //7) Case Conversion:
        //String toLowerCase() - Converts all characters in the string to lower case.
        str1.toLowerCase();
        //String toUpperCase() - Converts all characters in the string to upper case.
        str2.toUpperCase();


        //8) Trimming:
        //String trim() - Removes any leading and trailing whitespace from the string.
        str1.trim();

        //9) Concatenation:
        //String concat(String str) - Concatenates the specified string to the end of this string.
        System.out.println(str1 + str2);
        //String + String - You can also use the + operator to concatenate strings.

        //10) Replacement:
        //String replace(char oldChar, char newChar) - Replaces all occurrences of a specified character with a new character.
        str1.replace('H', 'M');
        //String replaceAll(String regex, String replacement) - Replaces each substring of this string that matches the
        // given regular expression with the given replacement.
        String str3 = "Barcelona";
        String replaced_Barcelona = str3.replaceAll("l", "L");
        System.out.println("replaced_Barcelona = " + replaced_Barcelona);

        //11) Splitting:
        //String[] split(String regex) - Splits the string around matches of the given regular expression.
        String strings = "abc1def2ghj";
        String[] split_by_deci = strings.split("\\d");
        System.out.println("split_by_deci = " + Arrays.toString(split_by_deci));

        //12) Joining Strings:
        //static String join(CharSequence delimiter, Iterable<? extends CharSequence> elements) - Joins the elements of an iterable with a delimiter.
        // Create a list of strings
        List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry", "Mellon");
        // Use String.join to join the strings with a comma as the delimiter
        String result = String.join(", ", fruits);
        // Output the result
        System.out.println(result);
    }
}
