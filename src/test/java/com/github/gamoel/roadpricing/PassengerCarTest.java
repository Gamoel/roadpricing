package com.github.gamoel.roadpricing;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.endsWith;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PassengerCarTest extends VehicleTest {

    @Test
    public void tollOfLoneRider() {
        PassengerCar passengerCar = unpoweredCarWithPassengerCount(0);
        assertEquals(PassengerCar.BASETOLL, passengerCar.getToll());
    }

    @Test
    public void tollWithOnePassenger() {
        PassengerCar passengerCar = unpoweredCarWithPassengerCount(1);
        assertEquals(PassengerCar.BASETOLL +
                PassengerCar.PASSENGERTOLL, passengerCar.getToll());
    }

    @Test
    public void tollWithTwoPassenger() {
        PassengerCar passengerCar = unpoweredCarWithPassengerCount(2);
        assertEquals(PassengerCar.BASETOLL + (PassengerCar.PASSENGERTOLL * 2)
                , passengerCar.getToll());
    }

    @Test
    public void tollIsAlsoBasedOnPower() {
        final int power = 100;
        PassengerCar passengerCar = loneDriverWithPower(power);
        assertEquals(PassengerCar.BASETOLL +
                (power * PassengerCar.POWERTOLLPERKW), passengerCar.getToll());
    }

    @Test
    public void toStringAppendsIdentifier() {
        String vehicleString = somePassengerCar().toString();
        assertThat(vehicleString, endsWith(" " + PassengerCar.IDENTIFIER));
    }

    private PassengerCar somePassengerCar() {
        return unpoweredCarWithPassengerCount(0);
    }

    private PassengerCar unpoweredCarWithPassengerCount(int passengerCount) {
        return new PassengerCar("", 0, 0, passengerCount);
    }


    private PassengerCar loneDriverWithPower(int power) {
        return new PassengerCar("", power, 0, 0);
    }

    @Override
    protected Vehicle getVehicleWith(String registration, int power, int weight, int passengers, int toll) {
        return new PassengerCar(registration, power, weight, passengers) {
            @Override
            public int getToll() {
                return toll;
            }
        };
    }
}
