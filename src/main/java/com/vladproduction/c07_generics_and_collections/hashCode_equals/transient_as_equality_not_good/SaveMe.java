package com.vladproduction.c07_generics_and_collections.hashCode_equals.transient_as_equality_not_good;


import java.io.Serializable;

/**
 * provided SaveMe class demonstrates several important concepts in Java regarding serialization,
 * equality checks, and hash code generation.
 * Below is a breakdown of the code, followed by an explanation of why certain practices in it are not ideal;
 * */
public class SaveMe implements Serializable {

    transient int x; // This field will not be serialized
    int y; // This field will be serialized

    public SaveMe(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int hashCode() {
        return (x ^ y); // Binary XOR of x and y
    }
    /*if an object is serialized and then deserialized, the hashCode() will likely change because x will be reset to its default value (0).
    This can lead to inconsistencies, especially when the object is stored in hash-based collections (like HashMap or HashSet).*/

    @Override
    public boolean equals(Object o) {
        SaveMe test = (SaveMe) o;
        if (test.y == y && test.x == x) { // Checks equality based on x and y
            return true;
        } else {
            return false;
        }
    }
    /*In the equals(Object o) method, there’s an unchecked cast from Object to SaveMe.
    If the passed object is not of type SaveMe, this would throw a ClassCastException.
    It's better to use the instanceof operator to perform a safe type check before casting.*/

    /*The equals() method checks the value of x as well, which might be 0 after deserialization.
    Therefore, if two objects of SaveMe were equal before serialization (based on y and x),
    they may not be considered equal after deserialization if x was non-zero. This is a violation of the equals() contract.*/

    /*Inconsistency Between hashCode() and equals():
    According to the general contract for hashCode() and equals(), if two objects are equal according to the equals() method,
    they must return the same hashCode(). In this implementation, if you have two SaveMe objects that are equal before serialization
    (with the same values of x and y), after serialization, if one object is deserialized,
    its x field will be lost, and thus it may not be equal when compared to the original object, leading to potential logical errors.*/

    /*      Conclusion
    The use of a transient variable as a part of both hashCode() and equals() is problematic due to serialization. Here's a summarized conclusion of the issues:
    -Inconsistent Behavior: The transient field x does not survive serialization, leading to inconsistencies between the object's state
    during live execution and its state after deserialization.
    -Potential Runtime Errors: The unchecked type cast in equals() is unsafe and could lead to runtime exceptions.
    -Contract Violations: Inconsistencies regarding the contract between equals() and hashCode() can lead to significant logical errors when
    the objects are used in collections.

            Recommendations
    To improve this implementation:
    -Remove Transient: If x is intended to be part of the identity of the object, do not mark it as transient.
    -Fix Equals Method: Use the instanceof operator for type checking and handle nulls appropriately.
    -Choose Fields Judiciously: Only include fields in hashCode() and equals() that are essential for defining the object's identity
    and that should remain consistent after serialization.*/
}
