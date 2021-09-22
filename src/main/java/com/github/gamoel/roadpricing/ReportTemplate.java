package com.github.gamoel.roadpricing;

public class ReportTemplate {
    private Reporter reporter;

    public ReportTemplate(Reporter reporter) {
        this.reporter = reporter;
    }

    public void createReportOf(Vehicle[] vehicles) {
        reporter.reportTable(vehicles);
        reporter.reportVehicleCount(vehicles);
        reporter.reportTotalToll(vehicles);
        reporter.reportMaxTollVehicles(vehicles);
    }
}
