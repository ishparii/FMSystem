package model.facilityMaintenance;

import java.util.Date;
import java.util.List;

public interface IMaintenanceLog {
	public List<IRequest> getRequests();
	public void setRequests(List<IRequest> requests);
	public List<IRequest> listFacilityProblems();
	public IRequest makeFacilityMaintenanceRequest();
	public List<IRequest> listMaintRequest();
	public List<IMaintenance> listMaintenance();
	public double calcDowntime(Date start, Date end);
	public double calcProblemRateForFacility(Date start, Date end);
	
}
