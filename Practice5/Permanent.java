package Practice5;

import java.util.*;

class PermanentContract implements Contract {
    private String contractID;
    private String propertyID;
    private String tenantID;
    private double rentAmount;
    private boolean isSigned;

    @Override
    public Contract buildContractID(String contractID) {
        this.contractID = contractID;
        return this;
    }

    @Override
    public Contract buildPropertyID(String propertyID) {
        this.propertyID = propertyID;
        return this;
    }

    @Override
    public Contract buildTenantID(String tenantID) {
        this.tenantID = tenantID;
        return this;
    }

    @Override
    public Contract buildRentAmount(double rentAmount) {
        this.rentAmount = rentAmount;
        return this;
    }

    @Override
    public Contract signContract() {
        this.isSigned = true;
        System.out.println("Permanent Contract Signed.");
        return this;
    }
}
