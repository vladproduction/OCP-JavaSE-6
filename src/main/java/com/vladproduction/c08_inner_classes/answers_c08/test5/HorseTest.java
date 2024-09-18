package com.vladproduction.c08_inner_classes.answers_c08.test5;

public class HorseTest {
    public static void main(String[] args) {
        class Horse{
            public String name;
            Horse(String s){
                name = s;
            }
        }
        Object obj = new Horse("Zippo");
        System.out.println(((Horse) obj).name); //need to cast qualifier to Horse, than after we can use variable name from Horse object
                                                //which it is not possible from Object type object (not have any fields as name or whatever)
        //after casting we got a response: Zippo
    }
}

/*What is the result?
A. An exception occurs at runtime at line 10
B. Zippo
C. Compilation fails because of an error on line 3
D. Compilation fails because of an error on line 9
+E. Compilation fails because of an error on line 10*/

/*Answer:
        ✓ E. If you use a reference variable of type Object, you can access only those members
defined in class Object.
         A, B, C, and D are incorrect based on the program logic described above*/
