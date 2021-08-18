package com.github.gamoel.roadpricing;

public abstract class Vehicle {

    private String registration;
    private int power;
    private int weight;
    private int passengers;

    public Vehicle(String registration, int power, int weight, int passengers) {
        this.registration = registration;
        this.power = power;
        this.weight = weight;
        this.passengers = passengers;
    }

    protected int getPower() {
        return power;
    }

    protected int getWeight() {
        return weight;
    }

    protected int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public abstract int getToll();

    @Override
    public String toString() {
        int toll = getToll();
        return String.format("%10s %3dkW %5dkg %2d %6d.%02d EUR",
                registration,
                getPower(),
                getWeight(),
                getPassengers(),
                toll / 100,
                toll % 100);
    }
}
