package com.github.gamoel.roadpricing;

public class Bus {
    public static final int INITIAL_TOLL = 50000;
    private static int flatRate;

    public int getToll() {
        return flatRate;
    }

    public void setFlatRate(int flatRate) {
        Bus.flatRate = flatRate;
    }
}
