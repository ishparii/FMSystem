package model.facilityMaintenance;

import java.util.Arrays;
import java.util.List;

public class MaintenanceLog {
    private Request request;
    
    private List<Request> requests;
    
    public MaintenanceLog(Request ... request) {
    	setRequests(Arrays.asList(request));
    }

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

	public Request getRequest() {
		return request;
	}

	public void setRequest(Request request) {
		this.request = request;
	}

	public List<Request> getRequests() {
		return requests;
	}

	public void setRequests(List<Request> requests) {
		this.requests = requests;
	}
}
