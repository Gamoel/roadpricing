package com.github.gamoel.roadpricing;

public class SmallReportTemplate {
    private Reporter reporter;

    public SmallReportTemplate(Reporter reporter) {
        this.reporter = reporter;
    }

    public void createReportOf(Vehicle[] vehicles) {
        reporter.reportTable(vehicles);
        reporter.reportVehicleCount(vehicles);
    }
}
