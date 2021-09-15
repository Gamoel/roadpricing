package com.github.gamoel.roadpricing;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

public class ReportTest {

    @Test
    public void methodsCalledInOrder() {
        RoadPricer roadPricer = Mockito.mock(RoadPricer.class);
        Report report = new Report(roadPricer);

        Vehicle[] vehicles = someVehicles();
        report.print(vehicles);
        InOrder order = Mockito.inOrder(roadPricer);
        order.verify(roadPricer).printTable(vehicles);
        order.verify(roadPricer).printVehicleCount(vehicles);
        order.verify(roadPricer).printTotalToll(vehicles);
        order.verify(roadPricer).printMaxTollVehicles(vehicles);
    }

    private Vehicle[] someVehicles() {
        return new Vehicle[]{
                Mockito.mock(Vehicle.class),
                Mockito.mock(Vehicle.class),
                Mockito.mock(Vehicle.class)
        };
    }


//    printTable(printer, vehicles);

//    printTable(printer, vehicles);
//    printVehicleCount(printer, vehicles);

}
