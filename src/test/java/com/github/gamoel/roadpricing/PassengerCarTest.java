package com.github.gamoel.roadpricing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PassengerCarTest {

    @Test
    public void tollOfLoneRider() {
        PassengerCar passengerCar = unpoweredCarWithPassengerCount(0);
        Assertions.assertEquals(PassengerCar.BASETOLL, passengerCar.getToll());
    }

    @Test
    public void tollWithOnePassenger() {
        PassengerCar passengerCar = unpoweredCarWithPassengerCount(1);
        Assertions.assertEquals(PassengerCar.BASETOLL +
                PassengerCar.PASSENGERTOLL, passengerCar.getToll());
    }

    @Test
    public void tollWithTwoPassenger() {
        PassengerCar passengerCar = unpoweredCarWithPassengerCount(2);
        Assertions.assertEquals(PassengerCar.BASETOLL + (PassengerCar.PASSENGERTOLL * 2)
                , passengerCar.getToll());
    }

    @Test
    public void tollIsAlsoBasedOnPower() {
        final int power = 100;
        PassengerCar passengerCar = loneDriverWithPower(power);
        Assertions.assertEquals(PassengerCar.BASETOLL +
                (power * PassengerCar.POWERTOLLPERKW), passengerCar.getToll());
    }

    @Test
    public void toStringAppendsIdentifier() {
        String vehicleString = somePassengerCar().toString();
        Assertions.assertEquals(PassengerCar.IDENTIFIER,
                StringSupport.getTrailingCharacters(vehicleString, PassengerCar.IDENTIFIER.length()));
    }

    private PassengerCar somePassengerCar() {
        return unpoweredCarWithPassengerCount(0);
    }

    private PassengerCar unpoweredCarWithPassengerCount(int passengerCount) {
        return new PassengerCar(0, passengerCount);
    }


    private PassengerCar loneDriverWithPower(int power) {
        return new PassengerCar(power, 0);
    }
}
