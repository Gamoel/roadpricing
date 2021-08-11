package com.github.gamoel.roadpricing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VehicleTest {

    @Test
    public void toStringRepresentationOfVehicle_A() {
        Vehicle vehicle = new Vehicle("BB-667Z", 320, 15785, 0) {
            @Override
            public int getToll() {
                return 182850;
            }
        };
        Assertions.assertEquals("   BB-667Z 320kW 15785kg  0   1828.50 EUR", vehicle.toString());
    }

    @Test
    public void toStringRepresentationOfVehicle_B() {
        Vehicle vehicle = new Vehicle("BP-133", 75, 210, 0) {
            @Override
            public int getToll() {
                return 3000;
            }
        };
        Assertions.assertEquals("    BP-133  75kW   210kg  0     30.00 EUR", vehicle.toString());
    }
}
