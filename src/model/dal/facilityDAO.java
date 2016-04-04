package model.dal;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import model.facility.Address;
import model.facility.Facility;
import model.facility.Group;
import model.facility.Manager;
import model.facility.Unit;


public class facilityDAO {
	
	public void addUnit(Facility facility) {
		Session session = HibernateHelper.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(facility);
		session.getTransaction().commit();
	}
	
	public void deleteUnit(Facility facility) {
		Session session = HibernateHelper.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.delete(facility);
		session.getTransaction().commit();
	}
	
	public Facility retrieveUnit(int facilityID) {
		try{
			Session session = HibernateHelper.getSessionFactory().getCurrentSession();
			session.beginTransaction();

			Query getUnitQuery = session.createQuery("From UNIT where facilityID = :facility_ID");		
			getUnitQuery.setString(facilityID, "facilityID");
			
			List<Unit> unit = getUnitQuery.list();

			session.getTransaction().commit();
			
			return (Unit)unit.get(0);
			} catch (Exception e) {
				e.printStackTrace();
			}
		return null;
	}
	public void addBuilding(Facility facility) {
		Session session = HibernateHelper.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(facility);
		session.getTransaction().commit();
	}
	
	public void deleteBuilding(Facility facility) {
		Session session = HibernateHelper.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.delete(facility);
		session.getTransaction().commit();
	}
	
	public Group retrieveBuilding(int facilityID) {
		try{
			Session session = HibernateHelper.getSessionFactory().getCurrentSession();
			session.beginTransaction();

			Query getBuildingQuery = session.createQuery("From BUILDING where facilityID = :facility_ID");		
			getBuildingQuery.setString(facilityID, "facilityID");
			
			List<Group> building = getBuildingQuery.list();

			session.getTransaction().commit();
			
			return (Group)building.get(0);
			} catch (Exception e) {
				e.printStackTrace();
			}
		return null;
	}
	
	public void addFloor(Facility facility) {
		Session session = HibernateHelper.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(facility);
		session.getTransaction().commit();
	}
	
	public void deleteFloor(Facility facility) {
		Session session = HibernateHelper.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.delete(facility);
		session.getTransaction().commit();
	}
	
	public Group retrieveFloor(int facilityID) {
		try{
			Session session = HibernateHelper.getSessionFactory().getCurrentSession();
			session.beginTransaction();

			Query getFloorQuery = session.createQuery("From FLOOR where facilityID = :facility_ID");		
			getFloorQuery.setString(facilityID, "facilityID");
			
			List<Group> floor = getFloorQuery.list();

			session.getTransaction().commit();
			
			return (Group)floor.get(0);
			} catch (Exception e) {
				e.printStackTrace();
			}
		return null;
	}
	
	public Address retrieveAddress(int facilityID) {
		try{
			Session session = HibernateHelper.getSessionFactory().getCurrentSession();
			session.beginTransaction();

			Query getAddressQuery = session.createQuery("From Address where facilityID = :facility_ID");		
			getAddressQuery.setString(facilityID, "facilityID");
			
			List<Address> address = getAddressQuery.list();

			session.getTransaction().commit();
			
			return (Address)address.get(0);
			} catch (Exception e) {
				e.printStackTrace();
			}
		return null;
	}
	
	public void addManager(Manager manager) {
		Session session = HibernateHelper.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(manager);
		session.getTransaction().commit();
	}
	
	public void deleteManager(Manager manager) {
		Session session = HibernateHelper.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.delete(manager);
		session.getTransaction().commit();
	}
	
	public Manager retrieveManager(int managerID) {
		try{
			Session session = HibernateHelper.getSessionFactory().getCurrentSession();
			session.beginTransaction();

			Query getManagerQuery = session.createQuery("From MANAGER where managerID = :manager_ID");		
			getManagerQuery.setString(managerID, "managerID");
			
			List<Manager> manager = getManagerQuery.list();

			session.getTransaction().commit();
			
			return (Manager)manager.get(0);
			} catch (Exception e) {
				e.printStackTrace();
			}
		return null;
	}
	
	
	
	
	
		
		
	
}