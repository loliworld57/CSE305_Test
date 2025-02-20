package Practice6;

public interface RequestProduct {
    void createRequest();
    void processRequest(String function);
    void setStatus(String status);
    void setExpireDay(String expireDay);
    void setPriority(String priority);
}