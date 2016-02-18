package model.facilityMaintanence;

import java.util.Date;

public class Request {
    private int requestID;
    private Date dateRequested;
    private String textDescription;

    private Maintenance maintanence;

    public int getRequestID() {
        return requestID;
    }

    public Date getDateRequested() {
        return dateRequested;
    }

    public String getTextDescription() {
        return textDescription;
    }

    public Maintenance getMaintenance() {
        return maintanence;
    }
}
