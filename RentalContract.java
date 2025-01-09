
public class RentalContract {
    public int contractID;
    public int propertyID;
    public int tenantID;
    public long rentAmount;
    public RentalContract(int id, int pid,int tid,long a){
        this.contractID = id;
        this.propertyID = pid;
        this.tenantID = tid;
        this.rentAmount = a;
    }
<<<<<<< Updated upstream
    public void createNewContract(int id, int pid,int tid,long a){
        RentalContract rc = new RentalContract(id, pid, tid, a);
=======
    public void createNewContract(int id, Property p,Tenant t,long a){
        RentalContract rc = new RentalContract(id, p.propertyID, t.u.userid, a);
>>>>>>> Stashed changes
    }
}
