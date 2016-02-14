package facilityMaintanence;

import constantValue.MaintenanceType;

public class Maintenance {
    private int maintanenceID;
    private String status;
    private boolean priority;
    private MaintenanceType maintenanceType;
    private String issueDescription;

    private Service service;
    private Schedule schedule;

    public Service getService() {
        return service;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public Object scheduleMaintenance() {
        // TODO
        return null;
    }

    public int getMaintanenceId() {
        return maintanenceID;
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
