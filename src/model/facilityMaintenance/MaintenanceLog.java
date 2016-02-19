package model.facilityMaintenance;

public class MaintenanceLog {
    private Maintenance maintenance;
    private Request request;

    public Object listFacilityProblems() {
        // TODO
        return null;
    }

    public  Object makeFacilityMaintenanceRequest() {
        // TODO
        return null;
    }

    public Object listMaintRequest(){
        // TODO
        return null;
    }

    public Object listMaintenance() {
        // TODO
        return null;
    }

    public Object calcDowntime() {
        // TODO
        return null;
    }

    public Object calcProblemRateForFacility() {
        // TODO
        return null;
    }

	public Maintenance getMaintenance() {
		return maintenance;
	}

	public void setMaintenance(Maintenance maintenance) {
		this.maintenance = maintenance;
	}

	public Request getRequest() {
		return request;
	}

	public void setRequest(Request request) {
		this.request = request;
	}
}
