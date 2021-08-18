package com.github.gamoel.roadpricing;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.endsWith;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TruckTest extends VehicleTest {

    @Test
    public void tollOfTruckWithZeroWeight() {
        Truck truck = truckWithZeroWeight();
        assertEquals(Truck.BASETOLL, truck.getToll());
    }

    @Test
    public void tollOfTruckWithWeight() {
        int weight = 1000;
        Truck truck = truckWithWeightOf(weight);
        assertEquals(Truck.BASETOLL + (weight * Truck.WEIGHTTOLL),
                truck.getToll());
    }

    @Test
    public void toStringAppendsIdentifier() {
        String vehicleString = someTruck().toString();
        assertThat(vehicleString, endsWith(" " + Truck.IDENTIFIER));
    }

    private Truck someTruck() {
        return truckWithZeroWeight();
    }

    private Truck truckWithZeroWeight() {
        return truckWithWeightOf(0);
    }

    private Truck truckWithWeightOf(int weight) {
        return new Truck("", 0, weight, 0);
    }

    @Override
    protected Vehicle getVehicleWith(String registration, int power, int weight, int passengers, int toll) {
        return new Truck(registration, power, weight, passengers) {
            @Override
            public int getToll() {
                return toll;
            }
        };
    }
}
