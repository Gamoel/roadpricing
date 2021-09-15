package com.github.gamoel.roadpricing;

public class Report {
    private RoadPricer roadPricer;

    public Report(RoadPricer roadPricer) {

        this.roadPricer = roadPricer;
    }

    public void print(Vehicle[] vehicles) {
        roadPricer.printTable(vehicles);
        roadPricer.printVehicleCount(vehicles);
        roadPricer.printTotalToll(vehicles);
        roadPricer.printMaxTollVehicles(vehicles);
    }
}
