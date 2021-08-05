package com.github.gamoel.roadpricing;

public class PassengerCar {
    public static final int BASETOLL = 5000;
    public static final int PASSENGERTOLL = 2000;
    //99cent /kw Power
    public static final String IDENTIFIER = "[PassengerCar]";
    private final int passenger;

    public PassengerCar(int passenger) {
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
