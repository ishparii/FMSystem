package model.facilityMaintenance;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaintenanceLog {
    //private Request request;
	private DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
    private List<Request> requests;
    
    public MaintenanceLog(Request ... request) {
    	setRequests(Arrays.asList(request));
    }

    //returns a list of requests with not scheduled maintenances
    //and prints to console information about them
    public Object listFacilityProblems() {
    	List<Request> problems = new ArrayList<>();
        for (Request r : requests) {
        	if (r.getMaintenance().getStatus().equals("pending")) {
        		problems.add(r);
        		System.out.println("Request " + r.getRequestID() + " : " + r.getTextDescription() + 
        				" was made on " + df.format(r.getDateRequested()));
        	}
        }
        return problems;
    }
    
    //creates a new Request object
    //and returns it back
    public  Request makeFacilityMaintenanceRequest() {
        Request r = new Request();
        requests.add(r);
        return r;
    }

    //prints to console info about all requests for maintenance
    //and returns the list of them
    public List<Request> listMaintRequest(){
    	for (Request r : requests) {
        	System.out.println("Request " + r.getRequestID() + " : " + r.getTextDescription() + 
        				" was made on " + df.format(r.getDateRequested()));
        }
        return requests;
    }

    //prints to console info about all maintenances of the facility
    //and returns the list of them
    public List<Maintenance> listMaintenance() {
    	List<Maintenance> maintenances = new ArrayList<>();
    	for (Request r : requests) {
    		Maintenance m = r.getMaintenance();
    		maintenances.add(m);
        	System.out.println("Maintenance " + m.getMaintenanceID() + " of " + m.getMaintenanceType() + " type " +
        				" is currently in " + m.getStatus() + " status.");
        }
        return maintenances;
    }

    public Object calcDowntime() {
        // TODO
        return null;
    }

    public Object calcProblemRateForFacility() {
        // TODO
        return null;
    }

	public List<Request> getRequests() {
		return requests;
	}

	public void setRequests(List<Request> requests) {
		this.requests = requests;
	}
	
//	public Request getRequest() {
//	return request;
//}
//
//public void setRequest(Request request) {
//	this.request = request;
//}
}
