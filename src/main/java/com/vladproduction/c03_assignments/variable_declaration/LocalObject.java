package com.vladproduction.c03_assignments.variable_declaration;

import java.util.Date;

public class LocalObject {
    public static void main(String[] args) {
        Date date = null; //explicitly initialization, so compiler can run
        if(date == null){
            System.out.println("date is null");
        }
    }
}
