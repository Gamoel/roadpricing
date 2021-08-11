package com.github.gamoel.roadpricing;

public class PassengerCar {
    static final int BASETOLL = 5000;
    static final int PASSENGERTOLL = 2000;
    static final int POWERTOLLPERKW = 99;
    static final String IDENTIFIER = "[PassengerCar]";
    private final int power;
    private final int passenger;


    public PassengerCar(int power, int passenger) {
        this.power = power;
        this.passenger = passenger;
    }

    public int getToll() {
        return BASETOLL + (this.passenger * PASSENGERTOLL) + (power * POWERTOLLPERKW);
    }

    @Override
    public String toString() {
        return IDENTIFIER;
    }
}
