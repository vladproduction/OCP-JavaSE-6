package com.vladproduction.c07_generics_and_collections.collections.task_inventory_part;


/**
 * which collection would you
 * use if you needed to maintain and search on a list of parts, identified by their unique
 * alphanumeric serial number where the part would be of type Part?
 * */
public class Part {

    private String serNum; // Unique alphanumeric serial number
    private String name; // Part name
    private String description; // Description of the part

    public Part(String serNum, String name, String description) {
        this.serNum = serNum;
        this.name = name;
        this.description = description;
    }

    public String getSerNum() {
        return serNum;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    /*//used StringBuilder:
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Part{");
        sb.append("serNum='").append(serNum).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append('}');
        return sb.toString();
    }*/

    //used custom format:
    @Override
    public String toString() {
        return String.format("Part [serNum=%s, name=%s, description=%s]", serNum, name, description);
    }
}
