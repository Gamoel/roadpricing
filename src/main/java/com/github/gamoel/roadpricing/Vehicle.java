package com.github.gamoel.roadpricing;

public abstract class Vehicle {

    private String registration;
    private int power;
    private int weigt;
    private int passengers;

    public Vehicle(String registration, int power, int weigt, int passengers) {
        this.registration = registration;
        this.power = power;
        this.weigt = weigt;
        this.passengers = passengers;
    }

    protected int getPower() {
        return power;
    }

    protected int getWeigt() {
        return weigt;
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
        return String.format("%10s %3dkW %5dkg %2d %6d.%02d EUR",
                registration,
                getPower(),
                getWeigt(),
                getPassengers(),
                getToll() / 100,
                getToll() % 100);
    }
}
