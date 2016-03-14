package model.facilityMaintenance;

import java.util.*;
import javax.persistence.*;


@Entity
@Table(name = "MAINTENANCE")
public class Maintenance {
	// TODO FK
    private int maintenanceID;
    @Column(name = "STATUS")
    private String status = "pending";
    @Column(name = "PRIORITY")
    private boolean priority;
    @Column(name = "MAINTENANCETYPE")
    private String maintenanceType;
    @Column(name = "ISSUEDESCRIPTION")
    private String issueDescription;

    private Schedule schedule;

    
    public Schedule getSchedule() {
        return schedule;
    }
    
    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    //creates new Schedule object and sets schedule time
    public Schedule scheduleMaintenance(Date date) {
    	Schedule s = new Schedule(date);
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
