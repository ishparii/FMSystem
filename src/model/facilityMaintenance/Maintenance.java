package model.facilityMaintenance;

public class Maintenance {
    private int maintenanceID;
    private String status;
    private boolean priority;
    private String maintenanceType;
    private String issueDescription;

    private Schedule schedule;

    public Schedule getSchedule() {
        return schedule;
    }
    

    public Schedule setSchedule(Schedule schedule) {
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
