package model.facilityMaintenance;

import java.sql.Timestamp;
import java.util.Date;

public class Service {
    private int serviceID;
    private Timestamp serviceTime;
    
    private Cost cost;

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



}
