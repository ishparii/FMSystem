package model.facilityMaintenance;

import java.util.Date;

public class Request {
    private int requestID;
    private Date dateRequested;
    private String textDescription;

    private Maintenance maintenance;
//    private int FacilityID;
    
    public Request() {
    	setMaintenance(new Maintenance());
    }

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

	public Maintenance getMaintenance() {
		return maintenance;
	}

	public void setMaintenance(Maintenance maintanence) {
		this.maintenance = maintanence;
	}

//	public int getFacilityID() {
//		return FacilityID;
//	}
//
//	public void setFacilityID(int facilityID) {
//		FacilityID = facilityID;
//	}
}
