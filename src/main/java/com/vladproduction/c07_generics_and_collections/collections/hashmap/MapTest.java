package com.vladproduction.c07_generics_and_collections.collections.hashmap;

import java.util.HashMap;
import java.util.Map;



/**
 * provided code demonstrate the crude of HashMap
 */
public class MapTest {
    public static void main(String[] args) {
        Map<Object, Object> m = new HashMap<>();
        m.put("k1", new Dog("aiko")); // add some key/value pairs
        m.put("k2", Pets.DOG);
        m.put(Pets.CAT, "CAT key");
        Dog d1 = new Dog("clover"); // let's keep this reference
        m.put(d1, "Dog key");
        m.put(new Cat(), "Cat key");
        System.out.println(m.get("k1")); // #1 value will vary
        String k2 = "k2";
        System.out.println(m.get(k2)); // #2 retrieved as an enum
        Pets p = Pets.CAT;
        System.out.println(m.get(p)); // #3 retrieved is a String (enum as a key available, Enum API override equals()/hashCode())
        System.out.println(m.get(d1)); // #4 key used to retrieve the String was made of a Dog object
        System.out.println(m.get(new Cat())); // #5
        /*Why didn't we find the Cat key String? Why did it work to
        use an instance of Dog as a key, when using an instance of Cat as a key failed?
        It's easy to see that Dog overrode equals() and hashCode() while Cat didn't.*/
        System.out.println(m.size()); // #6 5 key/value pairs exist in the Map
        //output:
        /*Dog@4
          DOG
          CAT key
          Dog key
          null
          5*/

//        System.out.println("object as a key changed his value:");
        System.out.println("---------");
        /*what happens when an object used as a key has its values
        changed? If we add two lines of code to the end of the earlier MapTest.main()*/
        d1.name = "magnolia";
        System.out.println(m.get(d1)); //null
        //output now is:
        /*
            Dog@4
            DOG
            CAT key
            Dog key
            null
            5
            object as a key changed his value:
            null
        */
        //the Dog not found now - name variable is used to create a hashCode
        // (changing the name changed the value of the hashcode in this particular example)

        //more actions for hashCode:
        System.out.println("---------");
        d1.name = "magnolia"; //just assign, but not put yet, so in map it`s still 'clover'
        System.out.println(m.get(d1)); // #1 null
        d1.name = "clover";
        System.out.println(m.get(new Dog("clover"))); // #2 Dog key (names are '==' based on overridden equals()), string pool guess
        d1.name = "arthur";
        System.out.println(m.get(new Dog("clover"))); // #3 null //bucket is passed but names incorrect
        /*two stages of retrieval:
        1. Use the hashCode() method to find the correct bucket
        2. Use the equals() method to find the object in the bucket

        #1: In the first call to get(), the hashcode is 8 (magnolia) and it should be 6
        (clover) because we put with this name d1 into the map before, so the retrieval fails at step 1 and we get null.
        #2: In the second call to get(), the hashcode`s are both 6, so step 1 succeeds. Once in the correct bucket (the
        "length of name = 6" bucket), the equals() method is invoked, and since Dog's
        equals() method compares names, equals() succeeds, and the output is Dog key.
        #3: In the third invocation of get(), the hashcode test succeeds, but the equals() test
        fails because arthur is NOT equal to clover.*/

        //we can using equals() to compare the strings in overridden method equals() from Dog`s class
        //instead of compare through '==' (memory location) we compare context by equals()

        //hashCode need to modify as well, so more efficiency it could execute bucket:
        /*@Override
        public int hashCode() {
            return Objects.hash(name);
        }*/

        //behaviour equals()/hashCode() expecting responses:

        //case#1
        /*
                Dog@4
                DOG
                CAT key
                Dog key
                null
                5
                ---------
                null
                ---------
                null
                Dog key
                null
            */

        //case#2
        /*
                Dog@2dafab
                DOG
                CAT key
                Dog key
                null
                5
                ---------
                null
                ---------
                null
                Dog key
                null
          */

        //case#3
        /*
                Dog@2dafab
                DOG
                CAT key
                Dog key
                null
                5
                ---------
                null
                ---------
                null
                Dog key
                null
         */

        //case#4
        /*
                Dog@2dafab
                DOG
                CAT key
                Dog key
                null
                5
                ---------
                null
                ---------
                null
                Dog key
                null
         */

    }
}

class Dog {
    public Dog(String n) {
        name = n;
    }

    public String name;

    //-----------------------version '=='/name.length() #1------------------------------
    public boolean equals(Object o) {
        if ((o instanceof Dog) &&
                (((Dog) o).name == name)) {
            return true;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return name.length();
    }

    //-----------------------version 'equals()'/name.length() #2------------------------------
    //need to modify equals() for compare two Strings by 'equals()' but not by '=='
    //'==' compare the memory place, and 'equals()' compare behaviour
    /*public boolean equals(Object obj) {
        return obj instanceof Dog && Objects.equals(((Dog) obj).name, name);
    }

    public int hashCode() {
        return name.length();
    }*/

    //-----------------------version 'equals()'/Objects.hash(name) #3-----------------------------
    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(name, dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }*/

    //-----------------------version '=='/Objects.hash(name) #4-----------------------------
    /*public boolean equals(Object o) {
        if ((o instanceof Dog) &&
                (((Dog) o).name == name)) {
            return true;
        } else {
            return false;
        }
    }
    public int hashCode() {
        return Objects.hash(name);
    }*/
}

class Cat {
}

enum Pets {DOG, CAT, HORSE}
