package com.github.gamoel.roadpricing;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class MainTest {
    private TextPrinter printer = Mockito.mock(TextPrinter.class);

    @Test
    public void printOneItemFromArray() {
        Vehicle[] vehicleArray = new Vehicle[]{
                new Truck("BB-667Z", 320, 15785, 0),
        };

        printTable(printer, vehicleArray);
        Mockito.verify(printer).printLine("   BB-667Z 320kW 15785kg  0   1828.50 EUR [Truck]");
    }

    @Test
    public void printTwoItemsFromArray() {
        Vehicle[] vehicleArray = new Vehicle[]{
                new Truck("BB-667Z", 320, 15785, 0),
                new MotorBike("BP-133", 75, 210, 0),
        };

        printTable(printer, vehicleArray);
        Mockito.verify(printer).printLine("   BB-667Z 320kW 15785kg  0   1828.50 EUR [Truck]");
        Mockito.verify(printer).printLine("    BP-133  75kW   210kg  0     30.00 EUR [MotorBike]");

    }

    private void printTable(TextPrinter printer, Vehicle[] vehicleArray) {
        for (Vehicle vehicle : vehicleArray) {
            printer.printLine(vehicle.toString());
        }
    }
}