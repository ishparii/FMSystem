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

    public int getMaintanenceId() {
        return maintenanceID;
    }

    public String getStatus() {
        return status;
    }

    public boolean getPriority() {
        return priority;
    }

    public MaintenanceType getMaintenanceType() {
        return maintenanceType;
    }

    public String getIssueDescription() {
        return issueDescription;
    }
}
