package model.facilityMaintenance;

import java.util.Date;
import javax.persistence.*;


@Entity
@Table(name = "REQUEST")
public class Request {
	// TODO FK
	@Id
	@Column(name = "REQUEST_ID", nullable = false, unique = true)
    private int requestID;
	@Column(name = "DATEREQUESTED")
    private Date dateRequested;
	@Column(name = "TEXTDESCRIPTION")
    private String textDescription;

    private Maintenance maintenance;
    
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
}
