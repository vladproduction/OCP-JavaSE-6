package com.vladproduction.c03_assignments.variable_declaration;

public class ObjectReferenceInstanceVariableDeclaration {
    public static void main(String[] args) {
        Book book = new Book();
        System.out.println("The title of the book is: " + book.getTitle());
        System.out.println("The title_default of the book is: " + book.getTitle_default());

    }
}

class Book{

    private String title = "Lord of the Ring"; //instance variable reference
    private String title_default;

    public String getTitle() {
        return title;
    }

    public String getTitle_default() {
        return title_default;
    }
}
