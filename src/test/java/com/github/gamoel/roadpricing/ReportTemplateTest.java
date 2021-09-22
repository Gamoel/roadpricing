package com.github.gamoel.roadpricing;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

import static com.github.gamoel.roadpricing.Samples.someVehicles;

public class ReportTemplateTest {

    @Test
    public void methodsCalledInOrder() {
        Reporter reporter = Mockito.mock(Reporter.class);
        ReportTemplate template = new ReportTemplate(reporter);

        Vehicle[] vehicles = someVehicles();
        template.createReportOf(vehicles);
        InOrder order = Mockito.inOrder(reporter);
        order.verify(reporter).reportTable(vehicles);
        order.verify(reporter).reportVehicleCount(vehicles);
        order.verify(reporter).reportTotalToll(vehicles);
        order.verify(reporter).reportMaxTollVehicles(vehicles);
    }
}
