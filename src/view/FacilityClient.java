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
        
		
		
				

}
}