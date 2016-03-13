package model.facilityMaintenance;

import java.sql.Timestamp;

public class Service {
	private int serviceID;
	private Timestamp serviceTime;
	private String descrription;

	private Cost cost = new Cost();

	public float calcMaintCostForFacility() {
		float totalCost = cost.getLaborCost() + cost.getMaterialCost() + cost.getExtra();
		return totalCost;
	}

	// getter and setter
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
