package com.github.gamoel.roadpricing;

public class PassengerCar extends Vehicle {
    static final int BASETOLL = 5000;
    static final int PASSENGERTOLL = 2000;
    static final int POWERTOLLPERKW = 99;
    static final String IDENTIFIER = "[PassengerCar]";


    public PassengerCar(String registration, int power, int weight, int passengers) {
        super(registration, power, weight, passengers);
    }

    @Override
    public int getToll() {
        return BASETOLL + (getPassengers() * PASSENGERTOLL) + (getPower() * POWERTOLLPERKW);
    }

    @Override
    public String toString() {
        return super.toString() + " " + IDENTIFIER;
    }
}
