package com.vladproduction.c08_inner_classes.anonymous_inner_classes;

public class AnonymousFlavorTwo {

    CookFood c = new CookFood() { // creating an instance of a new, anonymous, implementer of CookFood (not interface instance)
        @Override
        public void cook() {
            System.out.println("anonymous CookFood implementer");
        }
    };

    //or we can use lambda expression (same logic but shorter typing):
    PrepareDrink p = () -> System.out.println("anonymous PrepareDrink implementer");

}

interface CookFood{
    void cook();
}

interface PrepareDrink{
    void makeDrink();
}
