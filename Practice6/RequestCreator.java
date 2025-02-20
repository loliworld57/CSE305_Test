package Practice6;

public class RequestCreator {

    public RequestProduct createLowRequest() {
        LowRequest lowRequest = new LowRequest();
        lowRequest.createRequest();
        return lowRequest;
    }

    public RequestProduct createMidRequest() {
        MidRequest midRequest = new MidRequest();
        midRequest.createRequest();
        return midRequest;
    }

    public RequestProduct createHighRequest() {
        HighRequest highRequest = new HighRequest();
        highRequest.createRequest();
        return highRequest;
    }

    public RequestProduct createRequest(String priority) {
        switch (priority.toLowerCase()) {
            case "low":
                return createLowRequest();
            case "mid":
                return createMidRequest();
            case "high":
                return createHighRequest();
            default:
                throw new IllegalArgumentException("Unknown priority: " + priority);
        }
    }

    public void processRequest(RequestProduct request) {
        request.processRequest();
    }
}