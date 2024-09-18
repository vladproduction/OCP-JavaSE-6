package com.vladproduction.c07_generics_and_collections.generic_types.task_proper_type_parameters;

import java.util.ArrayList;
import java.util.List;

public class WildcardTypes {
    public static void main(String[] args) {

        //produce data:
        List<Object> unboundList = new ArrayList<>();
        for (int i = 0; i <= 15; i++) {
            if(i % 2 != 0) unboundList.add(new String("" + i));
            if(i % 2 == 0) unboundList.add(i);
            if (i >= 10) unboundList.add(Object.class.getSimpleName());
        }

        //consume without limits
        unbounded(unboundList);

        System.out.println("=========");
        //consume only Number abstract class extended
        List<Number> numbers = new ArrayList<>();
        for (Object object : unboundList) {
            if(object instanceof Number) numbers.add((Number) object);
        }
        upper_bounded(numbers);

        System.out.println("=========");
        //consume only Integers and it subclasses:
        List<Object> numbs = new ArrayList<>();
        for (Object object : unboundList) {
            if(object instanceof Integer) numbs.add(object);
        }
        lower_bounded(numbs);

    }

    static void unbounded(List<?> list){
        for (Object object : list) {
            System.out.print(object + " ");
        }
        System.out.println();
    }

    static void upper_bounded(List<? extends Number> list) {
        for (Number number : list) {
            System.out.print(number.doubleValue() + " "); //decide return value as double; could be any types extends Number
        }
        System.out.println();
    }

    static void lower_bounded(List<? super Integer> list){
        for (Object i : list) {
            System.out.print(i + " "); //list will print objects of Integer and subclasses (because we can add only them)
        }
        System.out.println();
    }

}
