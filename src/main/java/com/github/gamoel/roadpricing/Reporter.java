package com.github.gamoel.roadpricing;

public interface Reporter {

    void reportTable(Vehicle[] vehicles);

    void reportVehicleCount(Vehicle[] vehicles);

    void reportTotalToll(Vehicle[] vehicles);

    void reportMaxTollVehicles(Vehicle[] vehicles);

}
