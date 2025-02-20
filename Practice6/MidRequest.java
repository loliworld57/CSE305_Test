package Practice6;

public class MidRequest implements RequestProduct {
    private String priority;
    private String expireDay;
    private String status;

    public MidRequest() {
        this.priority = "Mid";
    }

    @Override
    public void createRequest() {
        System.out.println("Mid priority request created.");
    }

    @Override
    public void processRequest() {
        System.out.println("Mid priority request processed.");
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