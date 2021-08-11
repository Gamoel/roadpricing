package com.github.gamoel.roadpricing;

public class MotorBike {
    static final int BASETOLL = 3000;
    static final int PASSENGERTOLL = 1000;
    static final String IDENTIFIER = "[MotorBike]";
    private final int passenger;

    public MotorBike(int passenger) {
        this.passenger = passenger;
    }

    public int getToll() {
        return BASETOLL + (this.passenger * PASSENGERTOLL);
    }

    @Override
    public String toString() {
        return IDENTIFIER;
    }
}
