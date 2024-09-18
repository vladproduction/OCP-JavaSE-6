package com.vladproduction.c07_generics_and_collections.collections.task_inventory_part;

import java.util.*;


/**
 * 1) ===HashMap=== Which collection would you
 * use if you needed to maintain and search on a list of parts, identified by their unique
 * alphanumeric serial number where the part would be of type Part?
 *
 * 2) ===TreeMap=== But now when we amend the requirement to include getting the parts in order
 * of their serial number, then we need a TreeMap—which maintains the natural order
 * of the keys. Since the key is a String, the natural order for a String will be a standard
 * alphabetical sort.
 *
 * 3) ===LinkedHashMap=== If the requirement had been to keep track of which part was last
 * accessed, then we’d probably need a LinkedHashMap.
 * But since a LinkedHashMap loses
 * the natural order (replacing it with last-accessed order), if we need to list the parts by
 * serial number, we’ll have to explicitly sort the collection, using a utility method.
 * */
public class PartInventory {

    /*1)
    best choice of collection would be a HashMap (or LinkedHashMap if you need to maintain insertion order).
    A HashMap provides efficient key-value pair management, allowing you to have fast lookups, insertions,
    and deletions based on the unique serial number.
    -a unique key (in this case, the serial number) to be associated with each part;
    -average time complexity for retrieval, insertion, and deletion operations in a HashMap is O(1);
    -automatically prevents duplicate entries
    */

    private LinkedHashMap<String, Part> parts;//key is the serial number (String), and the value is the Part object itself.
//    private TreeMap<String, Part> parts;//key is the serial number (String), and the value is the Part object itself.
//    private HashMap<String, Part> parts;//key is the serial number (String), and the value is the Part object itself.

    public PartInventory() {
//        this.parts = new HashMap<>();
        this.parts = new LinkedHashMap<>();
    }

    //add to the collection:
    public void addPart(Part part){
        parts.put(part.getSerNum(), part); // Adds part with serial number as key
    }

    //get element by key:
    public Part getPart(String serNumb){
        return parts.get(serNumb); // Retrieves part by serial number
    }

    //print all elements in collection:
    public void printParts(){
        for (Part value : parts.values()) { // Iterates through all parts
            System.out.println(value);
        }
    }

    //sorting elements by title
    public void displaySortedByTitle() {
        // Sorting parts by name using Collections
        List<Part> sortedParts = new ArrayList<>(parts.values());
        Collections.sort(sortedParts, Comparator.comparing(Part::getName));

        System.out.println("Parts sorted by name:");
        for (Part part : sortedParts) {
            System.out.println(part);
        }
    }

}
