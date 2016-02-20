package model.facility;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Group implements Facility, Groups{
	private int groupID;
	private String groupName;
	private String groupOwner;
	private List<Building> buildings;

	public Group(Building ... building){
		setBuildings(Arrays.asList(building));
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


	public int getGroupID() {
		return groupID;
	}

	public void setGroupID(int groupID) {
		this.groupID = groupID;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getGroupOwner() {
		return groupOwner;
	}

	public void setGroupOwner(String groupOwner) {
		this.groupOwner = groupOwner;
	}


	public List<Building> getBuildings() {
		return buildings;
	}


	public void setBuildings(List<Building> buildings) {
		this.buildings = buildings;
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

