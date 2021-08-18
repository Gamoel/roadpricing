package com.github.gamoel.roadpricing;

public class MotorBike extends Vehicle {
    static final int BASETOLL = 3000;
    static final int PASSENGERTOLL = 1000;
    static final String IDENTIFIER = "[MotorBike]";

    public MotorBike(String registration, int power, int weight, int passengers) {
        super(registration, power, weight, passengers);
    }

    @Override
    public int getToll() {
        return BASETOLL + (getPassengers() * PASSENGERTOLL);
    }

    @Override
    public String toString() {
        return super.toString() + " " + IDENTIFIER;
    }
}
