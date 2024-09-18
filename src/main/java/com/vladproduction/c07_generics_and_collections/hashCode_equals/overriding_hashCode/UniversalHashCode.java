package com.vladproduction.c07_generics_and_collections.hashCode_equals.overriding_hashCode;

import java.util.Objects;

public class UniversalHashCode {
    private String field1;
    private int field2;
    private double field3;

    public UniversalHashCode(String field1, int field2, double field3) {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public int getField2() {
        return field2;
    }

    public void setField2(int field2) {
        this.field2 = field2;
    }

    public double getField3() {
        return field3;
    }

    public void setField3(double field3) {
        this.field3 = field3;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        UniversalHashCode that = (UniversalHashCode) object;
        return field2 == that.field2 && Double.compare(field3, that.field3) == 0 && Objects.equals(field1, that.field1);
    }

    @Override
    public int hashCode() {
        return Objects.hash(field1, field2, field3);
    }

    /*How Objects.hash() Works
    Varargs Input: The Objects.hash(Object... values) method takes a variable number of arguments for generating the hash code.
    This means you can pass as many fields as you like.

    Handling Nulls: Objects.hash() automatically handles null values. If a field is null, it does not contribute to the hash value negatively,
    maintaining consistent results.

    Efficiency: While the method is convenient and readable, it may not be the absolute fastest in performance critical scenarios,
    but it is generally efficient and fits most use cases.*/

    @Override
    public String toString() {
        return "UniversalHashCode{" +
                "field1='" + field1 + '\'' +
                ", field2=" + field2 +
                ", field3=" + field3 +
                '}';
    }

    /*Best Practices
    Override equals() and hashCode() Together: As a rule of thumb, always override hashCode() when you override equals()
    to maintain their contract.
    Include All Relevant Fields: In your hashCode() implementation, include fields that are used in the equals() method comparison.
    This ensures that if two objects are equal, they yield the same hash code.
    Prefer Immutability: If possible, design your object so that its fields are immutable. This will ensure consistent behavior
    for hashCode() and equals() methods.*/
}
