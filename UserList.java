import java.util.*;

public class UserList {
    public List<User> userList = new ArrayList<>();
    public void addUser(User u){
        this.userList.add(u);
    }
    public void removeUser(User u){
        this.userList.remove(u);
    }

}
