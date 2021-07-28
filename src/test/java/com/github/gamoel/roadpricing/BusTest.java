package com.github.gamoel.roadpricing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BusTest {

    /*
    Passes the tests
    Reveals intention
    No duplication
    Fewest elements
    */

    @Test
    public void defaultValueOfInitialToll() {
        Assertions.assertEquals(50000, Bus.INITIAL_TOLL);
    }

    @Test
    public void tollEqualsFlatRate() {
        Bus bus = new Bus();
        int newFlatrate = 60000;
        bus.setFlatRate(newFlatrate);
        Assertions.assertEquals(newFlatrate, bus.getToll());
    }
}
