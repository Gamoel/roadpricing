package com.github.gamoel.roadpricing;

public class Main {

    public static void main(String[] args) {
        TextPrinter printer = System.out::println;

        printTable(printer, init());
    }

    public static Vehicle[] init() {
        return new Vehicle[]{
                new Truck("BB-667Z", 320, 15785, 0),
                new MotorBike("BP-133", 75, 210, 0),
                new PassengerCar("W-1", 270, 2500, 1),
                new PassengerCar("DAD OF 3", 102, 1700, 4),
                new Bus("PT-4712 X", 205, 7050, 60),
                new Bus("PT-4711 X", 205, 7050, 75),
        };
    }

    static void printTable(TextPrinter printer, Vehicle[] vehicleArray) {
        for (Vehicle vehicle : vehicleArray) {
            printer.printLine(vehicle.toString());
        }
    }
}
