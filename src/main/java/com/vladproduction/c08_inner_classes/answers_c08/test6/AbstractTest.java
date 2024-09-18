package com.vladproduction.c08_inner_classes.answers_c08.test6;

public abstract class AbstractTest {
    public int getNum() {
        return 45;
    }

    public abstract class Bar {
        public int getNum() {
            return 38;
        }
    }

    public static void main(String[] args) {
        AbstractTest t = new AbstractTest() {
            public int getNum() {
                return 22;
            }
        };
        AbstractTest.Bar f = t.new Bar() {
            public int getNum() {
                return 57;
            }
        };
        System.out.println(f.getNum() + " " + t.getNum());
    }
}

/*
Answer:
        ✓ A. You can define an inner class as abstract, which means you can instantiate only
concrete subclasses of the abstract inner class. The object referenced by the variable t
is an instance of an anonymous subclass of AbstractTest, and the anonymous class
overrides the getNum() method to return 22. The variable referenced by f is an instance
of an anonymous subclass of Bar, and the anonymous Bar subclass also overrides the
getNum() method (to return 57). Remember that to create a Bar instance, we need an
instance of the enclosing AbstractTest class to tie to the new Bar inner class instance.
AbstractTest can't be instantiated because it's abstract, so we created an anonymous
subclass (non-abstract) and then used the instance of that anonymous subclass to tie
to the new Bar subclass instance.
  B, C, D, and E are incorrect based on the program logic described above.*/
