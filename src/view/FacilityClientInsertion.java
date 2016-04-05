package view;


import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.facility.*;
import model.facilityUse.*;
import model.inspection.*;

public class FacilityClientInsertion {
	public static void main(String[]args) throws Exception{		

		ApplicationContext context = new ClassPathXmlApplicationContext("app-context.xml");
        System.out.println("***************** Application Context instantiated! ******************");
        
        SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = fmt.parse("2009-02-13");
        Date date2 = fmt.parse("2013-10-10");
        
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
		
		InspectionLog inspLog1 = (InspectionLog)unit1.getInspectionLog();
		inspLog1.addInspection(insp1);
		
		
		Usage usage1 = (Usage)context.getBean("usage");
		usage1.setUsageID(400);
		usage1.setUsageType("Residential Property");
		usage1.setStartDate(date1);
		usage1.setEndDate(date2);	
		
		((ClassPathXmlApplicationContext)context).close();
	}
}