package view;





import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.facility.Address;
import model.facility.Facility;
import model.facility.Manager;
import model.facility.Unit;

public class FacilityClient {
	public static void main(String[]args) throws Exception{
		
		

        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        System.out.println("***************** Application Context instantiated! ******************");
        
        Address address1= (Address) context.getBean("Address");
        address1.setAddressID(0004);
		address1.setUnitNumber(406);
		address1.setStreetNumber(4400);
		address1.setStreet("Michigan Avenue");
		address1.setCity("Chicago");
		address1.setStateProvince("Illinois");
		address1.setZipCode(60000);
		
		Manager manager1 = (Manager) context.getBean("Manager");
		manager1.setManagerID(000014);
		manager1.setfName("Annie");
		manager1.setlName("Doomer");
		manager1.setCompanyName("Black.com");
		manager1.setPhone("3124444444");
		
		Facility unit1 = (Unit) context.getBean("Unit");
		unit1.setFacilityID(0001);
		unit1.setFacilityName("Ashland");
		unit1.setFacilityOwner("Pete");
		unit1.setAddress(address1);
		unit1.setManager(manager1);
        
		
		
				


}}
 
// package view;
//
// import java.sql.Timestamp;
// import java.text.SimpleDateFormat;
// import java.util.Date;
//
// import dal.*;
// import model.facility.*;
// import model.facilityMaintenance.*;
// import model.facilityUse.*;
// import model.inspection.*;
//
//
// public class FacilityClient{
// public static void main (String args[]) throws Exception {
// SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
// Date date1 = fmt.parse("2009-02-13");
// Date date2 = fmt.parse("2013-10-10");
//
// Timestamp timestamp = new Timestamp(date1.getTime());
//
// FacilityDAO facilityDAO = new FacilityDAO();
// FacilityUseDAO facilityUseDAO = new FacilityUseDAO();
// FacilityMaintenanceDAO facilityMaintDAO = new FacilityMaintenanceDAO();
// InspectionDAO inspectionDAO = new InspectionDAO();
//
// Group group = new Group();
// group.setFacilityID(1);
// group.setGroupName("Water Tower");
// group.setGroupOwner("Joey");
//
//// Adding building1 to Group
// Building building1 = new Building();
// building1.setFacilityID(10);
// building1.setBuildingName("Hancock Tower");
// building1.setBuildingOwner("Chandler");
// building1.setConstructionDate(date1);
//
// group.addNewFacility(building1);
//
//// Adding room1 to building 1
// Room room1 = new Room();
// room1.setFacilityID(20);
// room1.setRoomName("Spring");
// room1.setRoomOwner("Ross");
// room1.setUsageType("Residential");
//
// Address room1Address = new Address();
// room1Address.setAddressID(1);
// room1Address.setUnitNumber(1);
// room1Address.setStreetNumber(65);
// room1Address.setStreet("Ashland");
// room1Address.setCity("Chicago");
// room1Address.setStateProvince("Illinois");
// room1Address.setZipCode(66002);
//
// room1.setAddress(room1Address);
//
// Manager manager1 = new Manager();
// manager1.setManagerID(123);
// manager1.setfName("Philip");
// manager1.setlName("White");
// manager1.setCompanyName("Water Tower");
// manager1.setPhone("1234567890");
//
// room1.setManager(manager1);
// building1.addNewFacility(room1);
//
//// Adding building2 to Group
// Building building2 = new Building();
// building2.setFacilityID(11);
// building2.setBuildingName("Sears Tower");
// building2.setBuildingOwner("Mark");
// building2.setConstructionDate(date2);
//
// group.addNewFacility(building2);
//
//// Adding room 2 to building 2
// Room room2 = new Room();
// room2.setFacilityID(2);
// room2.setRoomName("Autumn");
// room2.setRoomOwner("Helen");
// room2.setUsageType("Office");
//
// Address room2Address = new Address();
// room2Address.setAddressID(2);
// room2Address.setUnitNumber(2);
// room2Address.setStreetNumber(56);
// room2Address.setStreet("Albion");
// room2Address.setCity("Chicago");
// room2Address.setStateProvince("Illinois");
// room2Address.setZipCode(66003);
//
// room2.setAddress(room2Address);
//
// Manager manager2 = new Manager();
// manager2.setManagerID(456);
// manager2.setfName("Peterson");
// manager2.setlName("Hunter");
// manager2.setCompanyName("Philip Tower");
// manager2.setPhone("1234564590");
//
// room2.setManager(manager2);
//
// building2.addNewFacility(room2);
//
//// Adding room 3 to building 2
// Room room3 = new Room();
// room3.setFacilityID(3);
// room3.setRoomName("Monsoon");
// room3.setRoomOwner("Annie");
// room3.setUsageType("Office");
//
// Address room3Address = new Address();
// room3Address.setAddressID(3);
// room3Address.setUnitNumber(3);
// room3Address.setStreetNumber(57);
// room3Address.setStreet("Albion");
// room3Address.setCity("Chicago");
// room3Address.setStateProvince("Illinois");
// room3Address.setZipCode(66003);
//
// room3.setAddress(room3Address);
//
// Manager manager3 = new Manager();
// manager3.setManagerID(789);
// manager3.setfName("Corey");
// manager3.setlName("Smart");
// manager3.setCompanyName("Hanging Tower");
// manager3.setPhone("1789567890");
// room3.setManager(manager3);
//
//// Facility Maintenance
//// New maintenance request created; scheduled, serviced and cost assigned
//// Request 1
// Request request1 = new Request();
// request1.setRequestID(1004);
// request1.setDateRequested(date1);
// request1.setTextDescription("Broken Windows");
//
// Maintenance maintenance1 = request1.getMaintenance();
// maintenance1.setMaintenanceID(4000);
// maintenance1.setIssueDescription("Need to fix broken windows");
// maintenance1.setPriority(true);
// maintenance1.setStatus("Pending");
// maintenance1.setMaintenanceType("Fixtures");
//
// Schedule schedule1 = new Schedule(date1);
// schedule1.setScheduleID(2);
// schedule1.setDateScheduled(date1);
//
// maintenance1.setSchedule(schedule1);
// Service service1 = schedule1.getService();
// service1.setServiceID(222);
// service1.setDescrription("service scheduled for noon");
// service1.setServiceTime(timestamp);
//
// Cost cost1 = service1.getCost();
// cost1.setCostID(25);
// cost1.setLaborCost(25);
// cost1.setMaterialCost(50);
// cost1.setExtra(20);
//
//
//// Second request
// Request request2 = new Request();
// request2.setRequestID(3001);
// request2.setDateRequested(date2);
// request2.setTextDescription("heating system broken");
//
// Maintenance maintenance2 = request2.getMaintenance();
// maintenance2.setMaintenanceID(3000);
// maintenance2.setIssueDescription("Need to fix broken Heatingsystem");
// maintenance2.setPriority(true);
// maintenance2.setStatus("Pending");
// maintenance2.setMaintenanceType("HVAC");
//
// Schedule schedule2 = new Schedule(date2);
// schedule2.setScheduleID(22);
// schedule2.setDateScheduled(date2);
//
// maintenance2.setSchedule(schedule2);
//
// Service service2 = schedule2.getService();
// service2.setServiceID(333);
// service2.setDescrription("service scheduled for morning");
// service2.setServiceTime(timestamp);
//
// Cost cost2 = service2.getCost();
// cost2.setCostID(26);
// cost2.setLaborCost(25);
// cost2.setMaterialCost(50);
// cost2.setExtra(20);
//
//// Facility Use
//// Usage, user 1
// Usage usage1 = new Usage();
// usage1.setUsageID(400);
// usage1.setUsageType("Residential Property");
// usage1.setStartDate(date1);
// usage1.setEndDate(date2);
//
// User user1 = new User();
// user1.setUserID(1);
// user1.setfName("harry");
// user1.setlName("Kudos");
// user1.setGender("M");
//
// usage1.setUser(user1);
//
//// Usage, user 2
// Usage usage2 = new Usage();
// usage2.setUsageID(500);
// usage2.setUsageType("Residential Property");
// usage2.setStartDate(date1);
// usage2.setEndDate(date2);
//
// User user2 = new User();
// user2.setUserID(2);
// user2.setfName("Priya");
// user2.setlName("Kate");
// user2.setGender("F");
//
// usage2.setUser(user2);
//
//// Inspection 1
// Inspection inspection1 = new Inspection();
// inspection1.setInspectionID(52);
// inspection1.setInspectionType("General visit");
// inspection1.setInspector("Fred");
// inspection1.setInspectionDate(date1);
// inspection1.setOutcome("Renowation needed");
//
//// Inspection 2
// Inspection inspection2 = new Inspection();
// inspection2.setInspectionID(85);
// inspection2.setInspectionType("Insurance visit");
// inspection2.setInspector("Quimby");
// inspection2.setInspectionDate(date2);
// inspection2.setOutcome("Good Condition");
//
//
//// Insert into database
// facilityDAO.setFacility(group);
// facilityUseDAO.setFacilityUse(usage1);
// facilityUseDAO.setFacilityUse(usage2);
//
// facilityMaintDAO.setFacilityMaintenance(request1);
// facilityMaintDAO.setFacilityMaintenance(request2);
//
// facilityUseDAO.setFacilityUse(usage1);
// facilityUseDAO.setFacilityUse(usage2);
//
// inspectionDAO.setInspection(inspection1);
// inspectionDAO.setInspection(inspection2);
// }
// }
