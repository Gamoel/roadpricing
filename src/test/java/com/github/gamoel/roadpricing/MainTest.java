package com.github.gamoel.roadpricing;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class MainTest {
    private TextPrinter printer = Mockito.mock(TextPrinter.class);

    @Test
    public void printOneItemFromArray() {
        Vehicle[] vehicleArray = new Vehicle[]{
                getSomeVehicle("Vehicle A"),
        };

        printTable(printer, vehicleArray);
        Mockito.verify(printer).printLine("Vehicle A");
    }

    @Test
    public void printTwoItemsFromArray() {
        Vehicle[] vehicleArray = new Vehicle[]{
                getSomeVehicle("Vehicle A"),
                getSomeVehicle("Vehicle B"),
        };

        printTable(printer, vehicleArray);
        Mockito.verify(printer).printLine("Vehicle A");
        Mockito.verify(printer).printLine("Vehicle B");
    }

    private Vehicle getSomeVehicle(final String toStringResult) {
        Vehicle printVehicle = Mockito.mock(Vehicle.class);
        Mockito.when(printVehicle.toString()).thenReturn(toStringResult);
        return printVehicle;
    }

    private void printTable(TextPrinter printer, Vehicle[] vehicleArray) {
        for (Vehicle vehicle : vehicleArray) {
            printer.printLine(vehicle.toString());
        }
    }
}