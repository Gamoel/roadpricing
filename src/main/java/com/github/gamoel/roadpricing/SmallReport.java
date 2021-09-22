package com.github.gamoel.roadpricing;

public class SmallReport {
    private RoadPricer roadPricer;

    public SmallReport(RoadPricer roadPricer) {
        this.roadPricer = roadPricer;
    }

    public void print(Vehicle[] vehicles) {
        roadPricer.printTable(vehicles);
        roadPricer.printVehicleCount(vehicles);
    }
}
