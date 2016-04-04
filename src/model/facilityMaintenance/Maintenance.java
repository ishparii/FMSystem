package model.facilityMaintenance;

import java.util.*;

public class Maintenance implements IMaintenance {
	private int maintenanceID;
	private String status;
	private boolean priority;
	private String maintenanceType;
	private String issueDescription;

	private ISchedule schedule;

	public ISchedule getSchedule() {
		return schedule;
	}

	public void setSchedule(ISchedule schedule) {
		this.schedule = schedule;
	}

	// creates new Schedule object and sets schedule time
	public ISchedule scheduleMaintenance(Date date) {
		ISchedule s = new Schedule(date);
		setSchedule(s);
		setStatus("scheduled");
		return s;
	}

	public int getMaintenanceID() {
		return maintenanceID;
	}

	public void setMaintenanceID(int maintenanceID) {
		this.maintenanceID = maintenanceID;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public boolean isPriority() {
		return priority;
	}

	public void setPriority(boolean priority) {
		this.priority = priority;
	}

	public String getMaintenanceType() {
		return maintenanceType;
	}

	public void setMaintenanceType(String maintenanceType) {
		this.maintenanceType = maintenanceType;
	}

	public String getIssueDescription() {
		return issueDescription;
	}

	public void setIssueDescription(String issueDescription) {
		this.issueDescription = issueDescription;
	}

}
