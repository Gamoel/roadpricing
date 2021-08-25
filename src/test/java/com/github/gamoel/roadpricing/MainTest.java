package com.github.gamoel.roadpricing;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

class MainTest {
    private String text = "";
    private TextPrinter printer = new TextPrinter() {

        @Override
        public void printLine(String string) {
            text = text + string + "\n";
        }
    };

    @Test
    public void printOneItemFromArray() {
        Vehicle[] vehicleArray = new Vehicle[]{
                new Truck("BB-667Z", 320, 15785, 0),
        };

        printTable(printer, vehicleArray);
        assertThat(text, equalTo("   BB-667Z 320kW 15785kg  0   1828.50 EUR [Truck]\n"));
    }

    @Test
    public void printTwoItemsFromArray() {
        Vehicle[] vehicleArray = new Vehicle[]{
                new Truck("BB-667Z", 320, 15785, 0),
                new MotorBike("BP-133", 75, 210, 0),
        };

        printTable(printer, vehicleArray);
        assertThat(text, equalTo(
                "" +
                        "   BB-667Z 320kW 15785kg  0   1828.50 EUR [Truck]\n" +
                        "    BP-133  75kW   210kg  0     30.00 EUR [MotorBike]\n"));
    }

    private void printTable(TextPrinter printer, Vehicle[] vehicleArray) {
        for (Vehicle vehicle : vehicleArray) {
            printer.printLine(vehicle.toString());
        }
    }
}