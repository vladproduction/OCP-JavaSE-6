package com.vladproduction.c08_inner_classes.answers_c08.test4;

public class TestObj {
    public static void main(String[] args) {
        Object o = new Object(){
            public boolean equals(Object object){
                return true;
            }
        }; //#7 from a task: semicolon were missed
        System.out.println(o.equals("Fred"));
    }
}

/*
What is the result?
A. An exception occurs at runtime
B. true
C. Fred
D. Compilation fails because of an error on line 3
E. Compilation fails because of an error on line 4
F. Compilation fails because of an error on line 8
+G. Compilation fails because of an error on a line other than 3, 4, or 8*/

/*Answer:
        ✓ G. This code would be legal if line 7 ended with a semicolon. Remember that line 3 is a
statement that doesn't end until line 7, and a statement needs a closing semicolon!
         A, B, C, D, E, and F are incorrect based on the program logic described above. If the
semicolon were added at line 7, then answer B would be correct—the program would
print true, the return from the equals() method overridden by the anonymous
subclass of Object.*/
