package com.github.gamoel.roadpricing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PassengerCarTest {

    @Test
    public void tollOfLoneRider() {
        PassengerCar passengerCar = passengerCarWithPassengerCount(0);
        Assertions.assertEquals(PassengerCar.BASETOLL, passengerCar.getToll());
    }

    @Test
    public void tollWithOnePassenger() {
        PassengerCar passengerCar = passengerCarWithPassengerCount(1);
        Assertions.assertEquals(PassengerCar.BASETOLL +
                PassengerCar.PASSENGERTOLL, passengerCar.getToll());
    }

    @Test
    public void tollWithTwoPassenger() {
        PassengerCar passengerCar = passengerCarWithPassengerCount(2);
        Assertions.assertEquals(PassengerCar.BASETOLL + (PassengerCar.PASSENGERTOLL * 2)
                , passengerCar.getToll());
    }

    @Test
    public void toStringAppendsIdentifier() {
        String vehicleString = somePassengerCar().toString();
        Assertions.assertEquals(PassengerCar.IDENTIFIER,
                StringSupport.getTrailingCharacters(vehicleString, PassengerCar.IDENTIFIER.length()));
    }

    private PassengerCar somePassengerCar() {
        return passengerCarWithPassengerCount(0);
    }

    private PassengerCar passengerCarWithPassengerCount(int passengerCount) {
        return new PassengerCar(passengerCount);
    }

}
