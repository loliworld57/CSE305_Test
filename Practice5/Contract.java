public class Contract {
    public int contractID;
    public int propertyID;
    public int tenantID;
    public long rentAmount;
    public Contract(int cID, int pID, int tID, long rA) {
        this.contractID = cID;
        this.propertyID = pID;
        this.tenantID = tID;
        this.rentAmount = rA;
    }
}