package com.github.gamoel.roadpricing;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
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
        String vehicleString = bus.toString();
        Assertions.assertEquals(Bus.IDENTIFIER,
                StringSupport.getTrailingCharacters(vehicleString, Bus.IDENTIFIER.length()));
    }

    @Test
    public void toStringIncludesInformationFromVehicle() {
        // TODO: Make Better Next Time!
        String vehicleString = bus.toString();
        MatcherAssert.assertThat(vehicleString.length(), Matchers.greaterThan(Bus.IDENTIFIER.length()));
    }
}
