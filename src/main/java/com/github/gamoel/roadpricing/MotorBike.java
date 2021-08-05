package com.github.gamoel.roadpricing;

public class MotorBike {
    public static final int BASETOLL = 3000;
    public static final int PASSENGERTOLL = 1000;
    private final int passenger;

    public MotorBike(int passenger) {
        this.passenger = passenger;
    }

    public int getToll() {
        return BASETOLL + (this.passenger * PASSENGERTOLL);
    }
}
