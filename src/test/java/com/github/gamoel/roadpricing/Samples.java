package com.github.gamoel.roadpricing;

import org.mockito.Mockito;

public class Samples {
    public static Vehicle[] someVehicles() {
        return new Vehicle[]{
                Mockito.mock(Vehicle.class),
                Mockito.mock(Vehicle.class),
                Mockito.mock(Vehicle.class)
        };
    }
}
