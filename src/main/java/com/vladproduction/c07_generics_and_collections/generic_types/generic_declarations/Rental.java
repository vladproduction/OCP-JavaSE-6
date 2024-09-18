package com.vladproduction.c07_generics_and_collections.generic_types.generic_declarations;

import java.util.List;

public class Rental {
    private List rentalPool;
    private int maxNum;
    public Rental(int maxNum, List rentalPool) {
        this.maxNum = maxNum;
        this.rentalPool = rentalPool;
    }
    public Object getRental() {
        // blocks until there's something available
        return rentalPool.get(0);
    }
    public void returnRental(Object o) {
        rentalPool.add(o);
    }
}
