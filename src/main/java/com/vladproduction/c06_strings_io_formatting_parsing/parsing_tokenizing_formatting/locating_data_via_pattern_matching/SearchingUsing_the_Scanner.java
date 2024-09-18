package com.vladproduction.c06_strings_io_formatting_parsing.parsing_tokenizing_formatting.locating_data_via_pattern_matching;

import java.util.Scanner;

public class SearchingUsing_the_Scanner {
    public static void main(String[] args) {
        System.out.println("input: ");
        System.out.flush();
        try{
            Scanner scanner = new Scanner(System.in);
            String token;
            do{
                token = scanner.findInLine(args[0]);
                System.out.println("found " + token);
            }while (token != null);

        }catch (Exception e){
            throw new RuntimeException(e);
        }

        /*The invocation and input
            java ScanIn "\d\d" //args[0]
            input: 1b2c335f456 //scanner value

        produce the following:
            found 33
            found 45
            found null*/
    }
}
