package com.github.gamoel.roadpricing;

public class Truck {

    static final String IDENTIFIER = "[Truck]";
    static final int BASETOLL = 25000;
    static final int WEIGHTTOLL = 10;
    private final int weight;

    public Truck(int weight) {
        this.weight = weight;
    }

    public int getToll() {
        return BASETOLL + (weight * WEIGHTTOLL);
    }

    @Override
    public String toString() {
        return IDENTIFIER;
    }
}
