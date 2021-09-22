package com.github.gamoel.roadpricing;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

import static com.github.gamoel.roadpricing.Samples.someVehicles;

public class SmallReportTest {

    @Test
    public void methodsCalledInOrder() {
        RoadPricer roadPricer = Mockito.mock(RoadPricer.class);
        SmallReport smallReport = new SmallReport(roadPricer);

        Vehicle[] vehicles = someVehicles();
        smallReport.print(vehicles);
        InOrder order = Mockito.inOrder(roadPricer);
        order.verify(roadPricer).printTable(vehicles);
        order.verify(roadPricer).printVehicleCount(vehicles);
    }
}
