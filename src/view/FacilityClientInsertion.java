package view;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.facility.*;
import model.facilityMaintenance.*;
import model.facilityUse.*;
import model.inspection.*;

public class FacilityClientInsertion {
	public static void main(String[]args) throws Exception{		

		ApplicationContext context = new ClassPathXmlApplicationContext("app-context.xml");
        System.out.println("***************** Application Context instantiated! ******************");
        
        SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = fmt.parse("2009-02-13");
        Date date2 = fmt.parse("2013-10-10");
        
        Timestamp timestamp = new Timestamp(date1.getTime());
        
		Facility unit1 = (Unit) context.getBean("unit");
		unit1.setFacilityID(0001);
		unit1.setFacilityName("Ashland");
		unit1.setFacilityOwner("Pete");
        
        IAddress address1= unit1.getAddress();
        address1.setAddressID(0004);
		address1.setUnitNumber(406);
		address1.setStreetNumber(4400);
		address1.setStreet("Michigan Avenue");
		address1.setCity("Chicago");
		address1.setStateProvince("Illinois");
		address1.setZipCode(60000);
		
		IManager manager1 = unit1.getManager();
		manager1.setManagerID(000014);
		manager1.setfName("Annie");
		manager1.setlName("Doomer");
		manager1.setCompanyName("Black.com");
		manager1.setPhone("3124444444");
		
		
		Inspection insp1 = (Inspection)context.getBean("inspection");
		insp1.setInspectionID(52);
		insp1.setInspectionType("General visit");
		insp1.setInspector("Fred");
		insp1.setInspectionDate(date1);
		insp1.setOutcome("Renowation needed");
		
		IInspectionLog inspLog1 = unit1.getInspectionLog();
		
		inspLog1.addInspection(insp1);
		
		
		
		
		
		
		((ClassPathXmlApplicationContext)context).close();
		
	}
}
 



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


