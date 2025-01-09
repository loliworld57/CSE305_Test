import java.util.*;
import User.java;

public class Tenant {
    public User user;
    public List<RentalContract> listRental;
    public Tenant(User u){
        this.user = u;
    }
}
