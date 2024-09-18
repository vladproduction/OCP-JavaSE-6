package com.vladproduction.c07_generics_and_collections.generic_types.generic_declarations;

import java.util.ArrayList;
import java.util.List;

public class TestRental {
    public static void main(String[] args) {
        //create some data pool
        Ship ship1 = new Ship();
        Ship ship2 = new Ship();
        List<Ship> ships = new ArrayList<>();
        ships.add(ship1);
        ships.add(ship2);
        RentalGeneric<Ship> shipRentalGeneric = new RentalGeneric<>(2, ships);
        //get rental
        Ship shipRental = shipRentalGeneric.getRental();

        //return rental
        shipRentalGeneric.returnRental(shipRental);

        //???// possible to stick smth else to the collection (not Ship???)
//        ships.add(new Object()); //NO - parameterized list can hold only assigned types

    }
}

class Ship{}
