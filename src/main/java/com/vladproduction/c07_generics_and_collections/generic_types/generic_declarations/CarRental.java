package com.vladproduction.c07_generics_and_collections.generic_types.generic_declarations;

import java.util.List;

public class CarRental extends Rental {

    public CarRental(int maxNum, List<Carr> rentalPool) {
        super(maxNum, rentalPool);
    }

    public Carr getRental() {
        return (Carr) super.getRental();
    }

    public void returnRental(Carr c) {
        super.returnRental(c);
    }

    public void returnRental(Object o) {
        if (o instanceof Carr) {
            super.returnRental(o);
        } else {
            System.out.println("Cannot add a non-Car");
            // probably throw an exception
        }
    }
}
class Carr{}
