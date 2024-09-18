package com.vladproduction.c07_generics_and_collections.collections.DVD_control_center_2;

import java.util.Comparator;

public class GenreSort implements Comparator<DVDEntity> {

    @Override
    public int compare(DVDEntity o1, DVDEntity o2) {
        return o1.getGenre().compareTo(o2.getGenre());
    }
}
