package com.vladproduction.c08_inner_classes.anonymous_inner_classes;

public class AnonymousFlavorOne {
    public void pop() {
        System.out.println("pop");
    }

}

class Food {
    AnonymousFlavorOne anonymousFlavorOne = new AnonymousFlavorOne() {
        public void pop() {  //whole point of making an anonymous inner class — to override one or more methods of the superclass
            System.out.println("anonymous pop");
        }
    };
}
