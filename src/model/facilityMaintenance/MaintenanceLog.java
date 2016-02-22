package model.facilityMaintenance;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;


public class MaintenanceLog {
    //private Request request;
	private DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
    private List<Request> requests;
    
    public MaintenanceLog(Request ... request) {
    	setRequests(Arrays.asList(request));
    }

    //returns a list of requests with not scheduled maintenances
    //and prints to console information about them
    public List<Request> listFacilityProblems() {
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

    //calculates downtime of facility in days for a given period of time
    public double calcDowntime(Date start, Date end) {
    	double downtime = 0;
    	for (Request r: requests) {
    		Date rDate = r.getDateRequested();
    		if (rDate.after(start) && rDate.before(end)) {
    			double currentDowntimeInDays = 0;
        		if (r.getMaintenance().getSchedule() != null) {
        			Date scheduleDate = r.getMaintenance().getSchedule().getDateScheduled();
        			if (scheduleDate.before(end)) {
        				currentDowntimeInDays = (scheduleDate.getTime() - rDate.getTime()) / (1000.0 * 60 * 60 * 24);
        			} else {
        				currentDowntimeInDays = (end.getTime() - rDate.getTime()) / (1000.0 * 60 * 60 * 24);
        			}
        			downtime += currentDowntimeInDays;
        		}
    		}
    	}
        return downtime;
    }

    //calculates percentage of downtime from the given period of time 
    public double calcProblemRateForFacility(Date start, Date end) {
    	double diffInDays = (end.getTime() - start.getTime()) / (1000.0 * 60 * 60 * 24);
    	double downtime = calcDowntime(start, end);
        return downtime / diffInDays * 100.0;
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
