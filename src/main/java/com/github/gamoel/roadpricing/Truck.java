package com.github.gamoel.roadpricing;

public class Truck extends Vehicle {

    static final String IDENTIFIER = "[Truck]";
    static final int BASETOLL = 25000;
    static final int WEIGHTTOLL = 10;

    public Truck(String registration, int power, int weight, int passengers) {
        super(registration, power, weight, passengers);
    }

    @Override
    public int getToll() {
        return BASETOLL + (getWeight() * WEIGHTTOLL);
    }

    @Override
    public String toString() {
        return super.toString() + " " + IDENTIFIER;
    }
}
