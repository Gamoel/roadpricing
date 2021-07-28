package com.github.gamoel.roadpricing;

public class Bus {
    public static final int INITIAL_FLATRATE = 50000;
    public static final String IDENTIFIER = "[Bus]";
    private static int flatRate = INITIAL_FLATRATE;

    public int getToll() {
        return flatRate;
    }

    public static void setFlatRate(int flatRate) {
        Bus.flatRate = flatRate;
    }

    @Override
    public String toString() {
        return IDENTIFIER;
    }
}
