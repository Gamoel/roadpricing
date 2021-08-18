package com.github.gamoel.roadpricing;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.startsWith;

public abstract class VehicleTest {

    //TODO: BuilderPattern candidate
    //TODO: Parameterized Test

    @Test
    public void toStringRepresentationOfBaseValuesOfVehicle_A() {
        Vehicle vehicle = getVehicleWith("BB-667Z", 320, 15785, 0, 182850);
        assertThat(vehicle.toString(), startsWith("   BB-667Z 320kW 15785kg  0   1828.50 EUR"));
    }

    @Test
    public void toStringRepresentationOfBaseValuesOfVehicle_B() {
        Vehicle vehicle = getVehicleWith("BP-133", 75, 210, 0, 3000);
        assertThat(vehicle.toString(), startsWith("    BP-133  75kW   210kg  0     30.00 EUR"));
    }

    protected abstract Vehicle getVehicleWith(final String registration, final int power, final int weight, final int passengers, final int toll);

}
