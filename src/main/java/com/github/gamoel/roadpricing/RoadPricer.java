package com.github.gamoel.roadpricing;

public class RoadPricer {
    private TextPrinter printer;

    public RoadPricer(TextPrinter printer) {
        this.printer = printer;
    }

    void reportTable(Vehicle[] vehicleArray) {
        for (Vehicle vehicle : vehicleArray) {
            printer.printLine(vehicle.toString());
        }
    }
}
