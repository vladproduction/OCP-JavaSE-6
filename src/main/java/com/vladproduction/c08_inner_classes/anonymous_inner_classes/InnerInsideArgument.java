package com.vladproduction.c08_inner_classes.anonymous_inner_classes;

public class InnerInsideArgument {
    public static void main(String[] args) {
        MySuperClass mySuper = new MySuperClass();
        mySuper.go();
        mySuper.go_lambda();

    }
}

class MySuperClass{
    void go(){
        Barr b = new Barr();
        b.actionMethod(new Typer() {
            @Override
            public void makeType() {
                System.out.println("Barr class type");
            }
        });
    }
    void go_lambda(){
        Barr b = new Barr();
        b.actionMethod(() -> System.out.println("Barr class type (lambda)"));
    }
}
interface Typer{
    void makeType();
}
class Barr{
    void actionMethod(Typer typer){
        //to invoke anonymous parameter (which defined as implementer of interface)
        //need to act overrode method (makeType()) right here:
        // Call the makeType method on the Typer object
        typer.makeType(); // This line is added to invoke the method
    }
}
