package model.facility;

public class Room implements Facility{
	private int RoomID;
	private String RoomName;
	private String RoomOwner;
	private String UsageType;
	private Address address;
	private Manager manager;


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

	public int getRoomID() {
		return RoomID;
	}

	public void setRoomID(int roomID) {
		RoomID = roomID;
	}

	public String getRoomName() {
		return RoomName;
	}

	public void setRoomName(String roomName) {
		RoomName = roomName;
	}

	public String getRoomOwner() {
		return RoomOwner;
	}

	public void setRoomOwner(String roomOwner) {
		RoomOwner = roomOwner;
	}

	public String getUsageType() {
		return UsageType;
	}

	public void setUsageType(String usageType) {
		UsageType = usageType;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

}

//package model.facility;
//
//
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
//import java.util.*;
//
//import model.constantValue.UsageType;
//
//public class Unit extends Facility11 {
//	public Unit() {
//		super();
//	}
//
//	private String usageType;
//	
//	private Manager manager;
//	private Address address;
//
//
//	@Override
//	public Map<String, String> getFacilityInfo() {
//		Map<String, String> info = new HashMap<String, String>();
//		info.put("id", Integer.toString(this.getFacilityID()));
//		info.put("name", this.getName());
//		info.put("address", this.getAddress().toString());
//		DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
//		info.put("owner", this.getOwner());
//		info.put("manager", this.getManager().getfName() + " " + this.getManager().getlName());
//		info.put("type", this.getUsageType());		
//		
//		for (Map.Entry<String, String> entry : info.entrySet()) {
//			System.out.println(entry.getKey() + ": " + entry.getValue());
//		}
//		
//		return info;
//	}
//
//	public String getUsageType() {
//		return usageType;
//	}
//
//	public void setUsageType(String usageType) {
//		this.usageType = usageType;
//	}
//
//	public Address getAddress() {
//		return address;
//	}
//
//	public void setAddress(Address address) {
//		this.address = address;
//	}
//
//	public Manager getManager() {
//		return manager;
//	}
//
//	public void setManager(Manager manager) {
//		this.manager = manager;
//	}
//
//}

