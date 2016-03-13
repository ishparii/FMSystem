package model.facilityMaintenance;

import java.sql.Timestamp;

public class Service implements IService {
	private int serviceID;
	private Timestamp serviceTime;
	private String descrription;

	private ICost cost;

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

	public ICost getCost() {
		return cost;
	}

	public void setCost(ICost cost) {
		this.cost = cost;
	}

	public String getDescrription() {
		return descrription;
	}

	public void setDescrription(String descrription) {
		this.descrription = descrription;
	}
}
