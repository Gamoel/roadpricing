package com.github.gamoel.roadpricing;

public class Truck {

    final static int BASETOLL = 25000;
    final static int WEIGHTTOLL = 10;
    private final int weight;

    public Truck(int weight) {
        this.weight = weight;
    }

    public int getToll() {
        return BASETOLL + (weight * WEIGHTTOLL);
    }
}
