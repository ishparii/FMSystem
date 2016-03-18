package model.facilityMaintenance;

import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "REQUEST")
public class Request implements IRequest {
	private int requestID;
	private Date dateRequested;
	private String textDescription;

	private IMaintenance maintenance;

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

	public IMaintenance getMaintenance() {
		return maintenance;
	}

	public void setMaintenance(IMaintenance maintanence) {
		this.maintenance = maintanence;
	}
}
