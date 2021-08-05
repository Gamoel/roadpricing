package com.github.gamoel.roadpricing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MotorBikeTest {

    @Test
    public void tollOfLoneRider() {
        MotorBike motorBike = motorBikeWithLoneRider();
        Assertions.assertEquals(MotorBike.BASETOLL, motorBike.getToll());
    }

    @Test
    public void tollWithOnePassenger() {
        MotorBike motorBike = motorBikeWithOnePassenger();
        Assertions.assertEquals(MotorBike.BASETOLL +
                MotorBike.PASSENGERTOLL, motorBike.getToll());
    }

    private MotorBike motorBikeWithLoneRider() {
        return new MotorBike();
    }

    private MotorBike motorBikeWithOnePassenger() {
        return new MotorBike(1);
    }
}
