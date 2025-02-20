package Practice6;

public class LowRequest implements RequestProduct {
    private String priority;
    private String expireDay;
    private String status;

    public LowRequest() {
        this.priority = "Low";
    }

    @Override
    public void createRequest() {
        System.out.println("Low priority request created.");
    }

    @Override
    public void processRequest(String function) {
        System.out.println(function);
    }

    @Override
    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void setExpireDay(String expireDay) {
        this.expireDay = expireDay;
    }

    @Override
    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getStatus() {
        return status;
    }
    

    public String getExpireDay() {
        return expireDay;
    }

    public String getPriority() {
        return priority;
    }
}