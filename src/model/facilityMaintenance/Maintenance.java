package model.facilityMaintenance;

import model.constantValue.MaintenanceType;

public class Maintenance {
    private int maintenanceID;
    private String status;
    private boolean priority;
    private MaintenanceType maintenanceType;
    private String issueDescription;

    private Schedule schedule;

    public Schedule getSchedule() {
        return schedule;
    }

    public Object scheduleMaintenance() {
        // TODO
        return null;
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

	public MaintenanceType getMaintenanceType() {
		return maintenanceType;
	}

	public void setMaintenanceType(MaintenanceType maintenanceType) {
		this.maintenanceType = maintenanceType;
	}

	public String getIssueDescription() {
		return issueDescription;
	}

	public void setIssueDescription(String issueDescription) {
		this.issueDescription = issueDescription;
	}


}
