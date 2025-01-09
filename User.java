public class User {
    public int userid;
    public String password;
    public String email;
    public String type;

    public User(int id, String pass, String email, String type){
        this.userid = id;
        this.password = pass;
        this.email = email;
        this.type = type;
    }
    public void createUser(int id, String pass, String email, String type){
        User u = new User(id,pass,email,type);

    }
    public void resetPass(String pass){
        this.password = pass;
    }
}
