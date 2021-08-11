package com.github.gamoel.roadpricing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VehicleTest {

    //TODO: BuilderPattern candidate
    //TODO: Parameterized Test

    @Test
    public void toStringRepresentationOfVehicle_A() {
        Vehicle vehicle = getVehicleWith("BB-667Z", 320, 15785, 0, 182850);
        Assertions.assertEquals("   BB-667Z 320kW 15785kg  0   1828.50 EUR", vehicle.toString());
    }

    @Test
    public void toStringRepresentationOfVehicle_B() {
        Vehicle vehicle = getVehicleWith("BP-133", 75, 210, 0, 3000);
        Assertions.assertEquals("    BP-133  75kW   210kg  0     30.00 EUR", vehicle.toString());
    }

    private Vehicle getVehicleWith(final String registration, final int power, final int weight, final int passengers, final int toll) {
        return new Vehicle(registration, power, weight, passengers) {
            @Override
            public int getToll() {
                return toll;
            }
        };
    }
}
