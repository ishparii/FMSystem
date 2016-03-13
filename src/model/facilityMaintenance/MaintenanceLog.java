package model.facilityMaintenance;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class MaintenanceLog implements IMaintenanceLog {
	private DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
	private List<IRequest> requests;

	// returns a list of requests with not scheduled maintenances
	// and prints to console information about them
	public List<IRequest> listFacilityProblems() {
		List<IRequest> problems = new ArrayList<>();
		for (IRequest r : requests) {
			if (r.getMaintenance().getStatus().equals("pending")) {
				problems.add(r);
				System.out.println("Request " + r.getRequestID() + " : " + r.getTextDescription() + " was made on "
						+ df.format(r.getDateRequested()));
			}
		}
		return problems;
	}

	// creates a new Request object and returns it back
	public IRequest makeFacilityMaintenanceRequest() {
		IRequest r = new Request();
		requests.add(r);
		return r;
	}

	// prints to console info about all requests for maintenance
	// and returns the list of them
	public List<IRequest> listMaintRequest() {
		for (IRequest r : requests) {
			System.out.println("Request " + r.getRequestID() + " : " + r.getTextDescription() + " was made on "
					+ df.format(r.getDateRequested()));
		}
		return requests;
	}

	// prints to console info about all maintenances of the facility
	// and returns the list of them
	public List<IMaintenance> listMaintenance() {
		List<IMaintenance> maintenances = new ArrayList<>();
		for (IRequest r : requests) {
			IMaintenance m = r.getMaintenance();
			maintenances.add(m);
			System.out.println("Maintenance " + m.getMaintenanceID() + " of " + m.getMaintenanceType() + " type "
					+ " is currently in " + m.getStatus() + " status.");
		}
		return maintenances;
	}

	// calculates down time of facility in days for a given period of time
	public double calcDowntime(Date start, Date end) {
		double downtime = 0;
		for (IRequest r : requests) {
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

	// calculates percentage of down time from the given period of time
	public double calcProblemRateForFacility(Date start, Date end) {
		double diffInDays = (end.getTime() - start.getTime()) / (1000.0 * 60 * 60 * 24);
		double downtime = calcDowntime(start, end);
		return downtime / diffInDays * 100.0;
	}

	public List<IRequest> getRequests() {
		return requests;
	}

	public void setRequests(List<IRequest> requests) {
		this.requests = requests;
	}
}
