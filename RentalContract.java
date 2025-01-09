import Property.java;
import Tenant.java;

public class RentalContract {
    public int contractID;
    public int propertyID;
    public int tenantID;
    public long rentAmount;
    public RentalContract(int id, Property p, Tenant t, long a){
        this.contractID = id;
        this.propertyID = p.propertyID;
        this.tenantID = t.user.userID;
        this.rentAmount = a;
    }
}
