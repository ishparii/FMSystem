package model.facilityMaintenance;

import java.util.Date;

public interface IMaintenance {
	public ISchedule getSchedule();
	public void setSchedule(ISchedule schedule);
	public ISchedule scheduleMaintenance(Date date);
	public int getMaintenanceID();
	public void setMaintenanceID(int maintenanceID);
	public String getStatus();
	public void setStatus(String status);
	public boolean isPriority();
	public void setPriority(boolean priority);
	public String getMaintenanceType();
	public void setMaintenanceType(String maintenanceType);
	public String getIssueDescription();
	public void setIssueDescription(String issueDescription);
}
