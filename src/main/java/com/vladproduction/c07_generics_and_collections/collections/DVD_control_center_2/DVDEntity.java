package com.vladproduction.c07_generics_and_collections.collections.DVD_control_center_2;

import java.util.Objects;

public class DVDEntity implements Comparable<DVDEntity>{
    private String title;
    private Genre genre;
    private String leadingActor;
    private int yearRelease;

    public DVDEntity(String title, Genre genre, String leadingActor, int yearRelease) {
        this.title = title;
        this.genre = genre;
        this.leadingActor = leadingActor;
        this.yearRelease = yearRelease;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getLeadingActor() {
        return leadingActor;
    }

    public void setLeadingActor(String leadingActor) {
        this.leadingActor = leadingActor;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public void setYearRelease(int yearRelease) {
        this.yearRelease = yearRelease;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        DVDEntity dvdEntity = (DVDEntity) object;
        return yearRelease == dvdEntity.yearRelease && Objects.equals(title, dvdEntity.title) && genre == dvdEntity.genre && Objects.equals(leadingActor, dvdEntity.leadingActor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, genre, leadingActor, yearRelease);
    }

    // Static method to create a DVDInfo instance from a string
    public static DVDEntity fromStringToDVDObject(String dvdString) {
        String[] parts = dvdString.split("/");
        String title = parts[0];
        Genre genre = Genre.valueOf(parts[1].toUpperCase());
        String leadingAuthor = parts[2];
        int releaseYear = Integer.parseInt(parts[3]);

        return new DVDEntity(title, genre, leadingAuthor, releaseYear);
    }

    //overridden method from Comparable (so we can sort or entities)
    @Override
    public int compareTo(DVDEntity o) {
        return title.compareTo(o.getTitle());
    }

    @Override
    public String toString() {
        return String.format("[Title: %s, Genre: %s, Lead Actor: %s, Release: %d]", title, genre, leadingActor, yearRelease);
    }
}
