package com.vladproduction.c07_generics_and_collections.hashCode_equals.task_override_hashCode_equals;

import java.util.Objects;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //correct overridden equals:
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Person person = (Person) object;
        return age == person.age && Objects.equals(name, person.name);
    }

    /*incorrect Equality Logic: For instance, the following implementation would not properly follow symmetry:*/
    /*@Override
    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            Person other = (Person) obj;
            return this.name.equals(other.name); // Only comparing name
        }
        return false;
    }*/

    //correct overridden hashCode
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    //incorrect overridden hashCode:
    /*@Override
    public int hashCode() {
        return name.hashCode(); // Missing age in hash code computation
    }*/

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
