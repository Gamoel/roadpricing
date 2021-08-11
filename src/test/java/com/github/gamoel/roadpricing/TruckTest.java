package com.github.gamoel.roadpricing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TruckTest {

    @Test
    public void tollOfTruckWithZeroWeight() {
        Truck truck = truckWithZeroWeight();
        Assertions.assertEquals(Truck.BASETOLL, truck.getToll());
    }

    @Test
    public void tollOfTruckWithWeight() {
        int weight = 1000;
        Truck truck = truckWithWeightOf(weight);
        Assertions.assertEquals(Truck.BASETOLL + (weight * Truck.WEIGHTTOLL),
                truck.getToll());
    }

    private Truck truckWithZeroWeight() {
        return truckWithWeightOf(0);
    }

    private Truck truckWithWeightOf(int weight) {
        return new Truck(weight);
    }
}