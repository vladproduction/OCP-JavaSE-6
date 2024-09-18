package com.vladproduction.c07_generics_and_collections.collections.DVD_control_center_2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ManagerData {

    private static final File FILE_DVD_CONTENT = new File("dvd-content.txt");

    // Method to write DVDInfo objects to a file
    public static void writeDVDInfo(List<DVDEntity> dvds) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_DVD_CONTENT))) {
            for (DVDEntity dvd : dvds) {
                writer.write(dvd.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to read DVDInfo objects from a file
    public static List<DVDEntity> readDVDInfo() {
        List<DVDEntity> dvds = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_DVD_CONTENT))) {
            String line;
            while ((line = reader.readLine()) != null) {
                dvds.add(DVDEntity.fromStringToDVDObject(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dvds;
    }
}





