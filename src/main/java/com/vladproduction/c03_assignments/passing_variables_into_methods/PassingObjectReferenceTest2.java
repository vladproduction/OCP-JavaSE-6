package com.vladproduction.c03_assignments.passing_variables_into_methods;


public class PassingObjectReferenceTest2 {
    public static void main(String[] args) {
        Foo foo = new Foo();
        foo.bar();
//        foo.doStuff(foo);
//        System.out.println(foo.getName());
    }

}

class Foo{

    private String name;

    public Foo() {

    }

    public Foo(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void bar() {
        System.out.println("bar()...start");
        Foo f = new Foo();
        System.out.println(f.getName());
        doStuff(f);
        System.out.println("after doStuff(f) in bar()");
        System.out.println(f.getName());
        System.out.println("bar()...finish");
    }
    void doStuff(Foo g) {
        System.out.println("doStuff(Foo g)...start");
        System.out.println("set name as Boo");
        g.setName("Boo");
        System.out.println("g is going as new object of Foo");
        g = new Foo();
        System.out.println("g: " + g);
        System.out.println("doStuff(Foo g)...finish");
    }

    @Override
    public String toString() {
        return "Foo{" +
                "name='" + name + '\'' +
                '}';
    }
}
