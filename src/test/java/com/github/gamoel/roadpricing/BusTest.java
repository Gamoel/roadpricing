package com.github.gamoel.roadpricing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BusTest {
    private Bus bus = new Bus();
    /*
    Passes the tests
    Reveals intention
    No duplication
    Fewest elements
    */

    @Test
    public void defaultValueOfInitialFlatRate() {
        Assertions.assertEquals(50000, Bus.INITIAL_FLATRATE);
    }

    @Test
    public void tollEqualsFlatRate() {
        int newFlatrate = 60000;
        Bus.setFlatRate(newFlatrate);
        Assertions.assertEquals(newFlatrate, bus.getToll());
    }

    @Test
    public void toStringAppendsIdentifier() {
        String busString = bus.toString();
        Assertions.assertEquals(Bus.IDENTIFIER,
                getTrailingCharacters(busString, Bus.IDENTIFIER.length()));
    }

    private String getTrailingCharacters(String string, int count) {
        return string.substring(string.length() - count);
    }
    
}
