package model.facility;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

import model.facilityMaintenance.MaintenanceLog;
import model.facilityUse.Usage;
import model.facilityUse.UsageLog;
import model.inspection.InspectionLog;

public class Building implements Groups {
	private int facilityID;
	private String buildingName;
	private String buildingOwner;
	private Date constructionDate;
	private List<Facility> rooms;
	private InspectionLog inspectionLog;
	private MaintenanceLog maintenanceLog;
	private UsageLog usageLog;

	
	public Building(Room ... room) {
		setInspectionLog(new InspectionLog());
		setMaintenanceLog(new MaintenanceLog());
		setFacilityUsage(new UsageLog());
		setRooms(Arrays.asList(room));
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
	public void setFacilityID(int id) {	this.facilityID = id;}

	public String getBuildingName() { return buildingName; }
	public void setBuildingName(String buildingName) { this.buildingName = buildingName; }

	public String getBuildingOwner() { return buildingOwner; }
	public void setBuildingOwner(String buildingOwner) { this.buildingOwner = buildingOwner; }
	
	public Date getConstructionDate() {	return constructionDate; }
	public void setConstructionDate(Date constructionDate) { this.constructionDate = constructionDate; }

	public List<Facility> getRooms() {	return rooms; }
	public void setRooms(List<Facility> rooms) { this.rooms = rooms; }
	
	
	@Override
	public List<Facility> listFacility() {
		for (Facility r: rooms) {
			System.out.println("Room ID: " + r.getFacilityID());
		}
		return rooms;
	}

	@Override
	public Map<String, String> getFacilityInfo() {
		Map<String, String> info = new HashMap<String, String>();
		info.put("id", Integer.toString(this.getFacilityID()));
		info.put("name", this.getBuildingName());
		info.put("owner", this.getBuildingOwner());
		info.put("type", "group");		
		DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
		info.put("constraction date", df.format(constructionDate));
		for (Map.Entry<String, String> entry : info.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		
		return info;
	}

	@Override
	public Facility addNewFacility(Facility facility) {
		rooms.add(facility);
		System.out.println("Facility with ID: " + facility.getFacilityID() + " was added.");
		return facility;
	}

	@Override
	public void removeFacility(int id) {
		for (Facility r: rooms) {
			if (r.getFacilityID() == id) {
				rooms.remove(r);
				System.out.println("Room with ID: " + id + " was removed from building " + getFacilityID());
				return;
			}
		}
		System.out.println("Facility with ID: " + id + " was not found in the building " + getFacilityID());
		
	}

	//returns a list of rooms that are not currently in use
	@Override
	public List<Facility> requestAvailFacility() {
		List<Facility> availableFacility = new ArrayList<>();
		for(Facility f : rooms) {
			Usage u = f.getUsageLog().getUsages().get(0);
			//available facility
			if (u.getEndDate() != null) {
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
//	public UnitGroup(Facility... facilities) {
//		super();
//		this.facilities = Arrays.asList(facilities);
//	}
//
//	private List<Facility> facilities;
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

