package com.github.gamoel.roadpricing;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.endsWith;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MotorBikeTest extends VehicleTest {

    @Test
    public void tollOfLoneRider() {
        MotorBike motorBike = motorBikeWithPassengerCount(0);
        assertEquals(MotorBike.BASETOLL, motorBike.getToll());
    }

    @Test
    public void tollWithOnePassenger() {
        MotorBike motorBike = motorBikeWithPassengerCount(1);
        assertEquals(MotorBike.BASETOLL +
                MotorBike.PASSENGERTOLL, motorBike.getToll());
    }

    @Test
    public void tollWithTwoPassenger() {
        MotorBike motorBike = motorBikeWithPassengerCount(2);
        assertEquals(MotorBike.BASETOLL + (MotorBike.PASSENGERTOLL * 2)
                , motorBike.getToll());
    }

    @Test
    public void toStringAppendsIdentifier() {
        String vehicleString = someMotorBike().toString();
        assertThat(vehicleString, endsWith(" " + MotorBike.IDENTIFIER));
    }

    private MotorBike someMotorBike() {
        return motorBikeWithPassengerCount(0);
    }

    private MotorBike motorBikeWithPassengerCount(int passengerCount) {
        return new MotorBike("", 0, 0, passengerCount);
    }

    @Override
    protected Vehicle getVehicleWith(String registration, int power, int weight, int passengers, int toll) {
        return new MotorBike(registration, power, weight, passengers) {
            @Override
            public int getToll() {
                return toll;
            }
        };
    }
}
