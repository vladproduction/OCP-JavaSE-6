package com.vladproduction.c09_threads.synchronizing_code.task_locking_to_protect_concurrent_access.inventory_management_system;

public class InventoryOperation implements Runnable{

    private final Inventory inventory;
    private final String operation;
    private final String itemId;
    private final int quantity;

    public InventoryOperation(Inventory inventory, String operation, String itemId, int quantity) {
        this.inventory = inventory;
        this.operation = operation;
        this.itemId = itemId;
        this.quantity = quantity;
    }

    //overridden run() and using switch/case flow:
    @Override
    public void run() {
        switch (operation.toLowerCase()){
            case "add":
                inventory.addItem(itemId, quantity); // Add items
                break;
            case "remove":
                inventory.removeItem(itemId, quantity); // Remove items
                break;
            case "check":
                int stock = inventory.checkStock(itemId);
                System.out.printf("Stock of item %s: %d%n", itemId, stock);
                break;
            default:
                System.out.println("Invalid operation: " + operation);
        }
    }
}
