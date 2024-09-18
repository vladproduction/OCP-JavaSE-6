package com.vladproduction.c07_generics_and_collections.collections.DVD_control_center;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainDVD {
    public static void main(String[] args) {
        System.out.println("#####MAIN START#####");
        System.out.println();
        /*Donnie Darko/sci-fi/Gyllenhall, Jake
        Raiders of the Lost Ark/action/Ford, Harrison
        2001/sci-fi/??
        Caddy Shack/comedy/Murray, Bill
        Star Wars/sci-fi/Ford, Harrison
        Lost in Translation/comedy/Murray, Bill
        Patriot Games/action/Ford, Harrison*/
        DVDInfo dvdInfo1 = new DVDInfo("Donnie Darko", "sci-fi", "Gyllenhall, Jake");
        DVDInfo dvdInfo2 = new DVDInfo("Raiders of the Lost Ark", "action", "Ford, Harrison");
        DVDInfo dvdInfo3 = new DVDInfo("2001", "sci-fi", "??");
        DVDInfo dvdInfo4 = new DVDInfo("Caddy Shack", "comedy", "Murray, Bill");
        DVDInfo dvdInfo5 = new DVDInfo("Star Wars", "sci-fi", "Ford, Harrison");
        DVDInfo dvdInfo6 = new DVDInfo("Lost in Translation", "comedy", "Murray, Bill");
        DVDInfo dvdInfo7 = new DVDInfo("Patriot Games", "action", "Ford, Harrison");
        List<DVDInfo> contentDVD = new ArrayList<>();
        contentDVD.add(dvdInfo1);
        contentDVD.add(dvdInfo2);
        contentDVD.add(dvdInfo3);
        contentDVD.add(dvdInfo4);
        contentDVD.add(dvdInfo5);
        contentDVD.add(dvdInfo6);
        contentDVD.add(dvdInfo7);

        DataManger.writeData(contentDVD);

        DataManger.readData();


        System.out.println();
        System.out.println("#####MAIN FINISH#####");
    }
}
