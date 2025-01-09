
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
    public void createNewContract(int id, int pid,int tid,long a){
        RentalContract rc = new RentalContract(id, pid, tid, a);
    }
}
