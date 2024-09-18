package com.vladproduction.c07_generics_and_collections.collections.DVD_control_center;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class DataManger {
    private static final String FILE_DVD = "dvdInfo.txt";


    //write data to file:
    public static void writeData(List<DVDInfo> dvdInfoContent){
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILE_DVD))){
            out.writeObject(dvdInfoContent);
            for (DVDInfo content : dvdInfoContent) {
                System.out.println(content);
            }
            System.out.println("write data DONE");
            System.out.println("=========================");
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    //read data from file:
    public static void readData(){
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(FILE_DVD))){

            List<DVDInfo> content = (List<DVDInfo>) in.readObject();
            for (DVDInfo dvdInfo : content) {
                System.out.println(dvdInfo);
            }
            System.out.println("read data DONE");
            System.out.println("=========================");
        }catch (Exception e){
            throw new RuntimeException(e);
        }

    }

}
