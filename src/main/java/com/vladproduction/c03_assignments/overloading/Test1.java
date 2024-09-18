package com.vladproduction.c03_assignments.overloading;

public class Test1 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();

        System.out.println(animal.sound()); // Generic animal sound (from Animal)
        System.out.println(dog.sound()); // Woof! (overridden in Dog)
        System.out.println("------");
        dog.sound(3); // Woof! printed 3 times (overloaded in Dog)
        System.out.println("------");
        dog.go(dog);
    }
}

class Animal {
    public String sound() {
        return "Generic animal sound";
    }
    static void eat() { }
}

class Dog extends Animal {
    // Overriding (same name, same parameter list)
    @Override
    public String sound() {
        return "Woof!";
    }

    // Overloading (same name, different parameter list)
    public void sound(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Woof!");
        }
    }

    // in this case, the compiler widens the Dog reference to an Animal
    void go(Animal a) {
        System.out.println("widening... Dog IS-A Animal");
    }
}
