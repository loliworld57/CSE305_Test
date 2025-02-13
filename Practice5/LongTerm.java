package Practice5;

class LongTerm implements Contract {
    private String contractID;
    private String propertyID;
    private String tenantID;
    private double rentAmount;

    public Contract buildContractID(String contractID) {
        this.contractID = contractID;
        return this;
    }

    public Contract buildPropertyID(String propertyID) {
        this.propertyID = propertyID;
        return this;
    }


    public Contract buildTenantID(String tenantID) {
        this.tenantID = tenantID;
        return this;
    }

    public Contract buildRentAmount(double rentAmount) {
        this.rentAmount = rentAmount;
        return this;
    }

    public Contract signContract() {
        System.out.println("Permanent Contract Signed.");
        return this;
    }
}
