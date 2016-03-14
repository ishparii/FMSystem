package model.facilityMaintenance;

import java.sql.Timestamp;

public interface IService {
	public float calcMaintCostForFacility();
	public int getServiceID();
	public void setServiceID(int serviceID);
	public Timestamp getServiceTime();
	public void setServiceTime(Timestamp serviceTime);
	public ICost getCost();
	public void setCost(ICost cost);
	public String getDescrription();
	public void setDescrription(String descrription);
}
