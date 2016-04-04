package dal;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import model.facility.*;
import model.facilityMaintenance.*;
import model.facilityUse.*;
import model.inspection.*;

public class PersistObject {
	private SessionFactory sf = null;
	
	private void initSessionFactory() {
		Configuration config = new Configuration().configure();
		ServiceRegistry serReg = new StandardServiceRegistryBuilder().applySettings(
				config.getProperties()).build();
		sf = config.buildSessionFactory(serReg);
	}
	
	private void persistFacilityObjects() {
		Session session = sf.getCurrentSession();
		
		
		Address address1 = new Address();
		// unit
		address1.setAddressID(0004);
		address1.setUnitNumber(406);
		address1.setStreetNumber(4400);
		address1.setStreet("Michigan Avenue");
		address1.setCity("Chicago");
		address1.setStateProvince("Illinois");
		address1.setZipCode(60000);
		
		Address address2 = new Address();
		// unit
		address2.setAddressID(0006);
		address2.setUnitNumber(201);
		address2.setStreetNumber(113);
		address2.setStreet("E Pearson Street");
		address2.setCity("Chicago");
		address2.setStateProvince("Illinois");
		address2.setZipCode(60000);
		
		Address address3 = new Address();
		// floor and building
		address3.setAddressID(0007);
		address3.setUnitNumber(-1);
		address3.setStreetNumber(4400);
		address3.setStreet("Michigan Avenue");
		address3.setCity("Chicago");
		address3.setStateProvince("Illinois");
		address3.setZipCode(60000);
		
		
		Manager manager1 = new Manager();

		manager1.setManagerID(000014);
		manager1.setfName("Annie");
		manager1.setlName("Doomer");
		manager1.setCompanyName("Black.com");
		manager1.setPhone("3124444444");
		
		Manager manager2 = new Manager();
		
		manager2.setManagerID(000012);
		manager2.setfName("Helen");
		manager2.setlName("Jacobs");
		manager2.setCompanyName("Purple.com");
		manager2.setPhone("3122222222");
		
		//unit1
		Facility unit1 = new Unit();
		unit1.setFacilityID(0001);
		unit1.setFacilityName("Ashland");
		unit1.setFacilityOwner("Pete");
		unit1.setAddress(address1);
		unit1.setManager(manager1);
		
		//unit2
		Facility unit2 = new Unit();
		unit1.setFacilityID(0002);
		unit1.setFacilityName("Albion");
		unit1.setFacilityOwner("Peter");
		unit1.setAddress(address2);
		unit1.setManager(manager2);
		
		//Floor
		
		
		//Building
		
		// 
		
		// TODO
		
		try {
			
			// TODO
			session.beginTransaction();
			session.save(address1);
			session.save(address2);
			session.save(address3);
			session.save(manager1);
			session.save(manager2);
			
			session.save(unit1);
			
			
			session.getTransaction().commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}			
	}
	
	
	
	public static void main(String[] args) {
		PersistObject po = new PersistObject();
		po.initSessionFactory();
		
		
	}
}
