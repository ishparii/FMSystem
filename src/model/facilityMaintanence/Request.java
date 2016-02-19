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

	public void setRequestID(int requestID) {
		this.requestID = requestID;
	}

	public Date getDateRequested() {
		return dateRequested;
	}

	public void setDateRequested(Date dateRequested) {
		this.dateRequested = dateRequested;
	}

	public String getTextDescription() {
		return textDescription;
	}

	public void setTextDescription(String textDescription) {
		this.textDescription = textDescription;
	}

	public Maintenance getMaintanence() {
		return maintanence;
	}

	public void setMaintanence(Maintenance maintanence) {
		this.maintanence = maintanence;
	}


}
