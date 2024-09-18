package com.vladproduction.c07_generics_and_collections.collections.task_inventory_part;

public class MainTask2 {
    public static void main(String[] args) {

        PartInventory inventory = new PartInventory();

        // Adding parts to the inventory
        inventory.addPart(new Part("SN12345", "Gear", "small"));
        inventory.addPart(new Part("SN54321", "Bolt", "sturdy"));
        inventory.addPart(new Part("SN784321", "Bolt", "sturdy"));
        inventory.addPart(new Part("SN24321", "Neil", "sturdy"));
        inventory.addPart(new Part("SN67890", "Nut", "standard"));

        // Displaying all parts
        System.out.println("All parts in inventory:");
        inventory.printParts();

        // Retrieving a part by its serial number
        String serialToFind = "SN54321";
        Part foundPart = inventory.getPart(serialToFind);
        if (foundPart != null) {
            System.out.println("Found part: " + foundPart);
        } else {
            System.out.println("Part with serial number " + serialToFind + " not found.");
        }

        // Display parts sorted by name
        inventory.displaySortedByTitle();


    }
}
