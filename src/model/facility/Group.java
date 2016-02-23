package model.facility;

import java.util.*;

import model.facilityMaintenance.MaintenanceLog;
import model.facilityUse.Usage;
import model.facilityUse.UsageLog;
import model.inspection.InspectionLog;

public class Group implements Groups{
	private int facilityID;
	private String groupName;
	private String groupOwner;
	private ArrayList<Facility> buildings = new ArrayList<Facility>();
	private InspectionLog inspectionLog;
	private MaintenanceLog maintenanceLog;
	private UsageLog usageLog;

//	public Group(Building ... building){
//		setInspectionLog(new InspectionLog());
//		setMaintenanceLog(new MaintenanceLog());
//		setFacilityUsage(new UsageLog());
//		setBuildings(Arrays.asList(building));   
//	}
	
	public Group() {
		setInspectionLog(new InspectionLog());
		setMaintenanceLog(new MaintenanceLog());
		setFacilityUsage(new UsageLog());
	}
		
	
	//dependency injection
	@Override
	public void setInspectionLog(InspectionLog log) {
		this.inspectionLog = log;		
	}

	@Override
	public void setFacilityUsage(UsageLog log) {
		this.usageLog = log;
	}

	@Override
	public void setMaintenanceLog(MaintenanceLog log) {
		this.maintenanceLog = log;		
	}
	
	
	//getters and setters
	@Override
	public InspectionLog getInspectionLog() { return inspectionLog;	}

	@Override
	public UsageLog getUsageLog() { return usageLog; }

	@Override
	public MaintenanceLog getMaintenanceLog() { return maintenanceLog; }
	
	@Override
	public int getFacilityID() { return facilityID;	}
	public void setFacilityID(int id) { this.facilityID = id; }

	public String getGroupName() {	return groupName; }
	public void setGroupName(String groupName) { this.groupName = groupName; }

	public String getGroupOwner() {	return groupOwner;	}
	public void setGroupOwner(String groupOwner) { this.groupOwner = groupOwner; }

	public List<Facility> getBuildings() { return buildings; }
//	public void setBuildings(List<Facility> buildings) { 
//		this.buildings = buildings; 
//		}
	public void setBuildings(Building building) {
		addNewFacility(building);
	}
		
	
	
	@Override
	public ArrayList<Facility> listFacility() {
		for (Facility b: buildings) {
			System.out.println("Building ID: " + b.getFacilityID());
			((Building)b).listFacility();
		}
		return buildings;
	}

	@Override
	public Map<String, String> getFacilityInfo() {
		Map<String, String> info = new HashMap<String, String>();
		info.put("id", Integer.toString(this.getFacilityID()));
		info.put("name", this.getGroupName());
		info.put("owner", this.getGroupOwner());
		info.put("type", "group");		
		
		for (Map.Entry<String, String> entry : info.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		
		return info;
	}

	@Override
	public Facility addNewFacility(Facility facility) {
		buildings.add(facility);
		System.out.println("Facility with ID: " + facility.getFacilityID() + " was added.");
		return facility;
	}

	@Override
	public void removeFacility(int id) {
		for (Facility b: buildings) {
			if (b.getFacilityID() == id) {
				buildings.remove(b);
				System.out.println("Building with ID: " + id + " was removed from group " + getFacilityID());
				return;
			}
			((Building)b).removeFacility(id);
		}
//		System.out.println("Facility with ID: " + id + " was not found in the group " + getFacilityID());
	}

	//returns a list of buildings that are not currently in use
	@Override
	public List<Facility> requestAvailFacility() {
		List<Facility> availableFacility = new ArrayList<>();
		for(Facility f : buildings) {
			Usage u = f.getUsageLog().getUsages().get(0);
			//available facility
			if (u.getEndDate() == null) {
				availableFacility.add(f);
			}
		}
		return availableFacility;
	}
}







//package model.facility;
//
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Map;
//
//public class UnitGroup extends Facility11 {
//
//	public UnitGroup(Facility11... facilities) {
//		super();
//		this.facilities = Arrays.asList(facilities);
//	}
//
//	private List<Facility11> facilities;
//	
//	
//	
//	@Override
//	public Map<String, String> getFacilityInfo() {
//		Map<String, String> info = new HashMap<String, String>();
//		info.put("id", Integer.toString(this.getFacilityID()));
//		info.put("name", this.getName());
//		info.put("owner", this.getOwner());
//		info.put("type", "group");		
//		
//		for (Map.Entry<String, String> entry : info.entrySet()) {
//			System.out.println(entry.getKey() + ": " + entry.getValue());
//		}
//		
//		return info;
//	}
//
//	public List<Facility11> listFacility() {
//		for (Facility11 f: facilities) {
//			System.out.println("Facility ID: " + f.getFacilityID());
//			if (f instanceof UnitGroup) {
//				System.out.println("Facility ID: " + f.getFacilityID() + " contains:");
//				((UnitGroup) f).listFacility();				
//			} else {
//				System.out.println("Facility ID: " + f.getFacilityID() + ";");
//			}
//		}
//		return facilities;
//	}
//
//	public LinkedList requestAvailFacility() {
//		// TODO generate a LinkedList to return the available facility.
//		return null;
//	}
//
//	public Facility11 addNewFacility(Facility11 facility) {
//		facilities.add(facility);
//		System.out.println("Facility with ID: " + facility.getFacilityID() + " was added.");
//		return facility;
//	}
//
//	public void removeFacility(int facilityID){
//		for (Facility11 f: facilities) {
//			if (f.getFacilityID() == facilityID) {
//				facilities.remove(f);
//				System.out.println("Facility with ID: " + facilityID + " was removed");
//				return;
//			} else if (f instanceof UnitGroup) {
//				((UnitGroup) f).removeFacility(facilityID);				
//			}
//		}
//	}
//}

