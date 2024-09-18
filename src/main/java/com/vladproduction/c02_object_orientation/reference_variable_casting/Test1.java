package com.vladproduction.c02_object_orientation.reference_variable_casting;

public class Test1 {
    public static void main(String[] args) {

        // 1)
        Animal_Africa [] animals = {new Animal_Africa(), new Gyraf(), new Animal_Africa()};
        for (Animal_Africa animal : animals) {
            animal.makeNoise();
            if (animal instanceof Gyraf) {
                ((Gyraf) animal).play();
            }
        }

        // 2)
        Animal_Africa[] a = {new Animal_Africa(), new Gyraf(), new Animal_Africa()};
        for (Animal_Africa animal : a) {
            animal.makeNoise();
            if (animal instanceof Gyraf) {
                //need to casting
//                animal.play();       // try to do a Dog behavior ?
                //2)casting
                Gyraf gyraf = (Gyraf) animal;      // casting the ref. var.
                gyraf.play();
            }
        }

        //3 pattern variable of casting
        Animal_Africa[] a1 = {new Animal_Africa(), new Gyraf(), new Animal_Africa()};
        for (Animal_Africa animal : a1) {
            animal.makeNoise();
            if (animal instanceof Gyraf gyraf) {
                //casting the ref. var.
                gyraf.play();
            }
        }

        //------ClassCastException-----------
        Animal_Africa animal = new Animal_Africa();
//        Gyraf gyraf = (Gyraf) animal; //compile just fine,  but if run program: ClassCastException

        //------------inconvertible type------------------
        Animal_Africa animalAfrica = new Animal_Africa();
        Gyraf gyraf = (Gyraf) animalAfrica;
//        String s = (String) animalAfrica; // animalAfrica can't EVER be a String
    }


}
