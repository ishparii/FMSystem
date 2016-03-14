package model.facilityMaintenance;

import java.util.Date;

public interface IRequest {
	public int getRequestID();
	public void setRequestID(int requestID);
	public Date getDateRequested();
	public void setDateRequested(Date dateRequested);
	public String getTextDescription();
	public void setTextDescription(String textDescription);
	public IMaintenance getMaintenance();
	public void setMaintenance(IMaintenance maintanence);
}
