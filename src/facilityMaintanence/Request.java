package facilityMaintanence;

public class Request {
    private int requestID;
    private String dateRequested;
    private String textDescription;

    private Maintenance maintanence;

    public int getRequestID() {
        return requestID;
    }

    public String getDateRequested() {
        return dateRequested;
    }

    public String getTextDescription() {
        return textDescription;
    }

    public Maintenance getMaintenance() {
        return maintanence;
    }
}
