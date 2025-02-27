package Report;

import java.util.*;

class FinancialReport {
    private static final double PREMIUM_THRESHOLD = 2000.0;
    private String reportTitle;
    private List<Property> properties;
    private double totalRent;

    public FinancialReport(String reportTitle, List<Property> properties) {
        this.reportTitle = reportTitle;
        this.properties = new ArrayList<>();
        for(Property p : properties) {
            this.properties.add(p);
        }
    }

    public void generateReport() {
        totalRent = 0;
        printReportHeader();
        for (Property property : properties) {
            printPropertyDetails(property);
            totalRent += property.getRentAmount();
        }
        printTotalRent();
    }

    private void printReportHeader() {
        System.out.println("Financial Report: " + reportTitle);
        System.out.println("----------------------------");
    }

    private void printPropertyDetails(Property property) {
        property.printPropertyDetails();
        if (property.getRentAmount() > PREMIUM_THRESHOLD) {
            System.out.println("This is a premium property.");
        } else {
            System.out.println("This is a standard property.");
        }
        double yearlyRent = property.getRentAmount() * 12;
        System.out.println("Yearly Rent: $" + yearlyRent);
        System.out.println("--------------------");
    }

    private void printTotalRent() {
        System.out.println("Total Rent Amount: $" + totalRent);
    }
}
