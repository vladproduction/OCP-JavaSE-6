package com.vladproduction.c03_assignments.variable_declaration;

public class NullPointerTrouble {
    public static void main(String[] args) {
        Journal journal = new Journal();
        System.out.println("journal.getTitle(): " + journal.getTitle());
        String s = journal.getTitle(); // compile OK
        System.out.println("s = " + s);

        //trouble:
        /*
        String t = s.toLowerCase(); //Runtime Exception: NullPointerException
        System.out.println("t = " + t);
        */

        //We can check to see whether an object has been instantiated by using the
        //keyword null, as the following revised code shows

        if(s != null){
            String t = s.toLowerCase();
            System.out.println("t = " + t);
        }
    }
}

class Journal{

//    private String title;
    //if it` not null:
    private String title = "Magazine-Journal";


    public String getTitle() {
        return title;
    }
}
