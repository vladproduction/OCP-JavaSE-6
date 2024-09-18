package com.vladproduction.c02_object_orientation.return_type;

public class TestAbstractReturn {
    public static void main(String[] args) {

        Flora flower = new Flower("Flower");
        System.out.println(flower.grow());

    }
}

abstract class Flora{
    abstract Flora grow();

}
class Flower extends Flora{

    private String name;

    public Flower(String name) {
        this.name = name;
    }

    Flora grow(){
        return new Flower(name); // OK, Flower "is-a" Flora
    }

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                '}';
    }
}
