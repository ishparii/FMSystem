package view;

import model.facility.Address;
import model.facility.Building;
import model.facility.Group;
import model.facility.Manager;
import model.facility.Room;

public class FacilityClient{
	
	public static void main (String args[]) throws Exception {
		
		Manager manager= new Manager();
		manager.setManagerID(123);
	    manager.setfName("Philip");
		manager.setlName("White");
		manager.setCompanyName("Water Tower");
		manager.setPhone("1234567890");
		
		Group group= new Group();
		group.setFacilityID(1);
		group.setGroupName("Water Tower");
		group.setGroupOwner("Joey");
		
		//Adding building1 to Group
		
		Building building1= new Building();
		building1.setFacilityID(10);
		building1.setBuildingName("Hancock Tower");
		building1.setBuildingOwner("Chandler");
		building1.setConstructionDate(null);		
		
		group.addNewFacility(building1);
		
		// Adding room1 to building 1
		
		Room room1=new Room();
		room1.setFacilityID(1);
		room1.setRoomName("Spring");
		room1.setRoomOwner("Ross");
		room1.setUsageType("Residential");
		
		Address room1Address= new Address();
		room1Address.setAddressID(1);
		room1Address.setUnitNumber(1);
		room1Address.setStreetNumber(65);
		room1Address.setStreet("Ashland");
		room1Address.setCity("Chicago");
		room1Address.setStateProvince("Illinois");
		room1Address.setZipCode(66002);
		
		room1.setAddress(room1Address);
		room1.setManager(manager);
		building1.addNewFacility(room1);
		
		
		//Adding building2 to Group		
		
		Building building2= new Building();
		building2.setFacilityID(11);
		building2.setBuildingName("Sears Tower");
		building2.setBuildingOwner("Mark");
		building2.setConstructionDate(null);
		
		group.addNewFacility(building2);
		
		//Adding room 2 to building 2
		Room room2=new Room();
		room2.setFacilityID(2);
		room2.setRoomName("Autumn");
		room2.setRoomOwner("Helen");
		room2.setUsageType("Office");
		
		Address room2Address= new Address();
		room2Address.setAddressID(2);
		room2Address.setUnitNumber(2);
		room2Address.setStreetNumber(56);
		room2Address.setStreet("Albion");
		room2Address.setCity("Chicago");
		room2Address.setStateProvince("Illinois");
		room2Address.setZipCode(66003);
		
		room2.setAddress(room2Address);	
		room2.setManager(manager);
		
		building2.addNewFacility(room2);
		
		//Adding room 3 to building 2
		
		Room room3=new Room();
		room3.setFacilityID(3);
		room3.setRoomName("Monsoon");
		room3.setRoomOwner("Annie");
		room3.setUsageType("Office");
		
		Address room3Address= new Address();
		room3Address.setAddressID(3);
		room3Address.setUnitNumber(3);
		room3Address.setStreetNumber(57);
		room3Address.setStreet("Albion");
		room3Address.setCity("Chicago");
		room3Address.setStateProvince("Illinois");
		room3Address.setZipCode(66003);
		
		room3.setAddress(room3Address);
		room3.setManager(manager);
		

}}
