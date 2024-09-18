package com.vladproduction.c07_generics_and_collections.collections.DVD_control_center_2;

import java.util.Collections;
import java.util.List;

public class DVDAppMain {
    public static void main(String[] args) {
        List<DVDEntity> dvdEntities = ManagerData.readDVDInfo();
        for (DVDEntity dvd : dvdEntities) {
            System.out.println(dvd);
        }
        Collections.sort(dvdEntities);
        System.out.println();
        System.out.println("after sorting utility:");
        for (DVDEntity dvd : dvdEntities) {
            System.out.println(dvd);
        }
        System.out.println();
        System.out.println("after sorting by genre:");
        GenreSort gs = new GenreSort();
//        Collections.sort(dvdEntities, gs);
        dvdEntities.sort(gs);
        for (DVDEntity dvd : dvdEntities) {
            System.out.println(dvd);
        }

    }
}
