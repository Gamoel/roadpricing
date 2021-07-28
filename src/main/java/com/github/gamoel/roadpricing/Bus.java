package com.github.gamoel.roadpricing;

public class Bus {
    public static final int INITIAL_FLATRATE = 50000;
    private static int flatRate = INITIAL_FLATRATE;

    public int getToll() {
        return flatRate;
    }

    public static void setFlatRate(int flatRate) {
        Bus.flatRate = flatRate;
    }
}
