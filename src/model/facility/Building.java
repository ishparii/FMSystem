package model.facility;

import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Building implements Facility, Groups {
	private int buildingID;
	private String buildingName;
	private String buildingOwner;
	private Date constructionDate;
	private List<Room> rooms;
	
	public Building(Room ... room) {
		setRooms(Arrays.asList(room));
	}
	
	
	@Override
	public List<Facility> listFacility() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, String> getFacilityInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Facility addNewFacility(Facility facility) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removefacility(Facility facility) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public LinkedList requestFacilityInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setInspectionLog() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setFacilityUsage() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setMaintenanceLog() {
		// TODO Auto-generated method stub
		
	}

	public int getBuildingID() {
		return buildingID;
	}

	public void setBuildingID(int buildingID) {
		this.buildingID = buildingID;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public String getBuildingOwner() {
		return buildingOwner;
	}

	public void setBuildingOwner(String buildingOwner) {
		this.buildingOwner = buildingOwner;
	}
	
	public Date getConstructionDate() {
		return constructionDate;
	}

	public void setConstructionDate(Date constructionDate) {
		this.constructionDate = constructionDate;
	}


	public List<Room> getRooms() {
		return rooms;
	}


	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
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

