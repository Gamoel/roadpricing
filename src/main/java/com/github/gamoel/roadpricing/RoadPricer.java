package com.github.gamoel.roadpricing;

public interface RoadPricer {

    void printTable(Vehicle[] vehicles);

    void printVehicleCount(Vehicle[] vehicles);

    void printTotalToll(Vehicle[] vehicles);

    void printMaxTollVehicles(Vehicle[] vehicles);

}
