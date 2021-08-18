package com.github.gamoel.roadpricing;

public class Bus extends Vehicle {
    public static final int INITIAL_FLATRATE = 50000;
    public static final String IDENTIFIER = "[Bus]";
    private static int flatRate = INITIAL_FLATRATE;


    public Bus(String registration, int power, int weight, int passengers) {
        super(registration, power, weight, passengers);
    }

    @Override
    public int getToll() {
        return flatRate;
    }

    public static void setFlatRate(int flatRate) {
        Bus.flatRate = flatRate;
    }

    @Override
    public String toString() {
        return super.toString() + " " + IDENTIFIER;
    }
}
