package model.facilityMaintenance;

import java.sql.Timestamp;
import java.util.Date;

public class Service {
    private int serviceID;
    private Timestamp serviceTime;
    private String descrription;
    
    private Cost cost;
    
    public Service() {
    	setCost(new Cost());
    }

	public int getServiceID() {
		return serviceID;
	}

	public void setServiceID(int serviceID) {
		this.serviceID = serviceID;
	}

	public Timestamp getServiceTime() {
		return serviceTime;
	}

	public void setServiceTime(Timestamp serviceTime) {
		this.serviceTime = serviceTime;
	}

	public Cost getCost() {
		return cost;
	}

	public void setCost(Cost cost) {
		this.cost = cost;
	}

	public String getDescrription() {
		return descrription;
	}

	public void setDescrription(String descrription) {
		this.descrription = descrription;
	}
}
