import java.util.*;

public class Tenant {
    public User user;
    public List<RentalContract> listRental;
    public void createRentalContract(RentalContract rt){
        listRental.add(rt);
    }
    public void removeRentalContract(RentalContract rt){
        listRental.remove(rt);
    }
}
