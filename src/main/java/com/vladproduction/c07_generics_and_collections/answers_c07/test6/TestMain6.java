package com.vladproduction.c07_generics_and_collections.answers_c07.test6;

public class TestMain6 {
    public static void main(String[] args) {
        //provided hierarchy

        /*Which of the following changes (taken separately) would allow this code to compile?
                (Choose all that apply.)
        -A. Change the Carnivore interface to
        interface Carnivore<E extends Plant> extends Hungry<E> {}
        +B. Change the Herbivore interface to
        interface Herbivore<E extends Animal> extends Hungry<E> {}
        -C. Change the Sheep class to
        class Sheep extends Animal implements Herbivore<Plant> {
            public void munch(Grass x) {}
        }
        -D. Change the Sheep class to
        class Sheep extends Plant implements Carnivore<Wolf> {
            public void munch(Wolf x) {}
        }
        -E. Change the Wolf class to
        class Wolf extends Animal implements Herbivore<Grass> {
            public void munch(Grass x) {}
        }
        -F. No changes are necessary*/
    }
}

interface Hungry<E> { void munch(E x); }
interface Carnivore<E extends Animal> extends Hungry<E> {}

//interface Herbivore<E extends Plant> extends Hungry<E> {} //was
interface Herbivore<E extends Animal> extends Hungry<E> {}//choose B (compile fine)
abstract class Plant {}
abstract class Animal {}
class Grass extends Plant {}
class Sheep extends Animal implements Herbivore<Sheep> {
    public void munch(Sheep x) {}
}
class Wolf extends Animal implements Carnivore<Sheep> {
    public void munch(Sheep x) {}
}

/*Answer:
        ✓ B is correct. The problem with the original code is that Sheep tries to implement
Herbivore<Sheep> and Herbivore declares that its type parameter E can be any type that
extends Plant. Since a Sheep is not a Plant, Herbivore<Sheep> makes no sense—
the type Sheep is outside the allowed range of Herbivore's parameter E. Only solutions
that either alter the definition of a Sheep or alter the definition of Herbivore will be able
to fix this. So A, E, and F are eliminated. B works, changing the definition of an Herbivore
to allow it to eat Sheep solves the problem. C doesn't work because an Herbivore<Plant>
must have a munch(Plant) method, not munch(Grass). And D doesn't work, because
in D we made Sheep extend Plant, now the Wolf class breaks because its munch(Sheep)
method no longer fulfills the contract of Carnivore. (Objective 6.4)*/

