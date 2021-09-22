package com.github.gamoel.roadpricing;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.stream.Stream;

class RoadPricerTest {
    private TextPrinter printer = Mockito.mock(TextPrinter.class);

    @Test
    public void printOneItemFromArray() {
        Vehicle[] vehicleArray = new Vehicle[]{
                getSomeVehicle("Vehicle A"),
        };

        new RoadPricer(printer).reportTable(vehicleArray);
        Mockito.verify(printer).printLine("Vehicle A");
    }

    @Test
    public void printTwoItemsFromArray() {
        Vehicle[] vehicleArray = new Vehicle[]{
                getSomeVehicle("Vehicle A"),
                getSomeVehicle("Vehicle B"),
        };

        new RoadPricer(printer).reportTable(vehicleArray);
        Mockito.verify(printer).printLine("Vehicle A");
        Mockito.verify(printer).printLine("Vehicle B");
    }

    @Test
    public void printVehicleCount() {
        int count = 3;
        new RoadPricer(printer).reportVehicleCount(getSomeVehicles(count));
        Mockito.verify(printer).printLine(String.format("%d vehicle(s)", count));
    }

    private Vehicle getSomeVehicle(final String toStringResult) {
        Vehicle printVehicle = getSomeVehicle();
        Mockito.when(printVehicle.toString()).thenReturn(toStringResult);
        return printVehicle;
    }

    private Vehicle[] getSomeVehicles(int count) {
        return Stream.generate(this::getSomeVehicle).limit(count).toArray(Vehicle[]::new);
    }

    private Vehicle getSomeVehicle() {
        return Mockito.mock(Vehicle.class);
    }

}