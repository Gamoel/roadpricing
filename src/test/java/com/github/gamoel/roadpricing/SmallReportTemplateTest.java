package com.github.gamoel.roadpricing;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

import static com.github.gamoel.roadpricing.Samples.someVehicles;

public class SmallReportTemplateTest {

    @Test
    public void methodsCalledInOrder() {
        Reporter reporter = Mockito.mock(Reporter.class);
        SmallReportTemplate template = new SmallReportTemplate(reporter);

        Vehicle[] vehicles = someVehicles();
        template.createReportOf(vehicles);
        InOrder order = Mockito.inOrder(reporter);
        order.verify(reporter).reportTable(vehicles);
        order.verify(reporter).reportVehicleCount(vehicles);
    }
}
