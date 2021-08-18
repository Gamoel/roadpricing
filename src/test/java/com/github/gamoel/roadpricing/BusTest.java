package com.github.gamoel.roadpricing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BusTest extends VehicleTest {
    private Bus bus = someBus();

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

    @Override
    protected Vehicle getVehicleWith(String registration, int power, int weight, int passengers, int toll) {
        return new Bus(registration, power, weight, passengers) {
            @Override
            public int getToll() {
                return toll;
            }
        };
    }

    private Bus someBus() {
        return new Bus("", 0, 0, 0);
    }
}
