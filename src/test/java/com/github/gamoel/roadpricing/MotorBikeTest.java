package com.github.gamoel.roadpricing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MotorBikeTest {

    @Test
    public void tollOfLoneRider() {
        MotorBike motorBike = motorBikeWithPassengerCount(0);
        Assertions.assertEquals(MotorBike.BASETOLL, motorBike.getToll());
    }

    @Test
    public void tollWithOnePassenger() {
        MotorBike motorBike = motorBikeWithPassengerCount(1);
        Assertions.assertEquals(MotorBike.BASETOLL +
                MotorBike.PASSENGERTOLL, motorBike.getToll());
    }

    @Test
    public void tollWithTwoPassenger() {
        MotorBike motorBike = motorBikeWithPassengerCount(2);
        Assertions.assertEquals(MotorBike.BASETOLL + (MotorBike.PASSENGERTOLL * 2)
                , motorBike.getToll());
    }

    @Test
    public void toStringAppendsIdentifier() {
        String vehicleString = someMotorBike().toString();
        Assertions.assertEquals(MotorBike.IDENTIFIER,
                StringSupport.getTrailingCharacters(vehicleString, MotorBike.IDENTIFIER.length()));
    }

    private MotorBike someMotorBike() {
        return motorBikeWithPassengerCount(0);
    }

    private MotorBike motorBikeWithPassengerCount(int passengerCount) {
        return new MotorBike(passengerCount);
    }

}
