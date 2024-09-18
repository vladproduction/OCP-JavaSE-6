package com.vladproduction.c07_generics_and_collections.collections.DVD_control_center;

import java.io.Serializable;
import java.util.Objects;

public class DVDInfo implements Serializable {

    private String title;
    private String genre;
    private String leadActor;

    public DVDInfo(String title, String genre, String leadActor) {
        this.title = title;
        this.genre = genre;
        this.leadActor = leadActor;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getLeadActor() {
        return leadActor;
    }

    public void setLeadActor(String leadActor) {
        this.leadActor = leadActor;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        DVDInfo dvdInfo = (DVDInfo) object;
        return Objects.equals(title, dvdInfo.title) && Objects.equals(genre, dvdInfo.genre) && Objects.equals(leadActor, dvdInfo.leadActor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, genre, leadActor);
    }


    @Override
    public String toString() {
        return String.format("[Title: %s, Genre: %s, Lead Actor: %s]", title, genre, leadActor);
    }
}
