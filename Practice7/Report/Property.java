package Report;

class Property {
    private String name;
    private double rentAmount;
    private String ownerName;
    private String location;

    public Property(String name, double rentAmount, String ownerName, String location) {
        this.name = name;
        this.rentAmount = rentAmount;
        this.ownerName = ownerName;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public double getRentAmount() {
        return rentAmount;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getLocation() {
        return location;
    }

    public void printPropertyDetails() {
        System.out.println("Property: " + this.name);
        System.out.println("Rent Amount: $" + this.rentAmount);
        System.out.println("Owner: " + this.ownerName);
        System.out.println("Location: " + this.location);
    }
}
