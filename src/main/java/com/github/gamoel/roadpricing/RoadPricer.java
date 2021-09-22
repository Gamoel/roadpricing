package com.github.gamoel.roadpricing;

public class RoadPricer implements Reporter {
    private TextPrinter printer;

    public RoadPricer(TextPrinter printer) {
        this.printer = printer;
    }

    @Override
    public void reportTable(Vehicle[] vehicleArray) {
        for (Vehicle vehicle : vehicleArray) {
            printer.printLine(vehicle.toString());
        }
    }

    @Override
    public void reportVehicleCount(Vehicle[] vehicles) {
        printer.printLine(String.format("%d vehicle(s)", vehicles.length));
    }

    @Override
    public void reportTotalToll(Vehicle[] vehicles) {

    }

    @Override
    public void reportMaxTollVehicles(Vehicle[] vehicles) {

    }
}
