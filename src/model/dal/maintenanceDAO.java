package model.dal;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import model.facilityMaintenance.Maintenance;
import model.facilityMaintenance.Request;
import model.facilityMaintenance.Schedule;
import model.facilityMaintenance.Service;



public class maintenanceDAO {
	
	public void addMaintReq(Request request){
	Session session = HibernateHelper.getSessionFactory().getCurrentSession();
	session.beginTransaction();
	session.save(request);
	session.getTransaction().commit();
}
	
	public Request retrieveMaintRequest(int requestID){
		try{
			Session session = HibernateHelper.getSessionFactory().getCurrentSession();
			session.beginTransaction();

			Query getRequestQuery = session.createQuery("From REQUEST where requestID = :requestID");		
			getRequestQuery.setString(requestID, "requestID");
			
			List<Request> request = getRequestQuery.list();

			session.getTransaction().commit();
			
			return (Request)request.get(0);
			} catch (Exception e) {
				e.printStackTrace();
			}
		return null;
		
		
	}
	
	public void addMaintenance(Maintenance maint) {
		Session session = HibernateHelper.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(maint);
		session.getTransaction().commit();
	}
	
	public void deleteMaintenance(Maintenance maint) {
		Session session = HibernateHelper.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.delete(maint);
		session.getTransaction().commit();
	}
	
	public Maintenance retrieveMaintenance(int maintID) {
		try{
			Session session = HibernateHelper.getSessionFactory().getCurrentSession();
			session.beginTransaction();

			Query getMaintQuery = session.createQuery("From MAINTENANCE where maintenanceID = :maintenance_ID");		
			getMaintQuery.setString(maintID, "maintenanceID");
			
			List<Maintenance> maint = getMaintQuery.list();

			session.getTransaction().commit();
			
			return (Maintenance)maint.get(0);
			} catch (Exception e) {
				e.printStackTrace();
			}
		return null;
	}
	
	
	
	public Schedule retrieveMaintSchedule(int MaintID) {
		try{
			Session session = HibernateHelper.getSessionFactory().getCurrentSession();
			session.beginTransaction();

			Query getScheduleQuery = session.createQuery("From SCHEDULE where maintenanceID = :maintenance_ID");		
			getScheduleQuery.setString(MaintID, "maintenanceID");
			
			List<Schedule> schedule = getScheduleQuery.list();

			session.getTransaction().commit();
			
			return (Schedule)schedule.get(0);
			} catch (Exception e) {
				e.printStackTrace();
			}
		return null;
	}
	
	public Service retrieveMaintService(int scheduleID) {
		try{
			Session session = HibernateHelper.getSessionFactory().getCurrentSession();
			session.beginTransaction();

			Query getServiceQuery = session.createQuery("From SERVICE where scheduleID = :scheduleID");		
			getServiceQuery.setString(scheduleID, "scheduleID");
			
			List<Service> service = getServiceQuery.list();

			session.getTransaction().commit();
			
			return (Service)service.get(0);
			} catch (Exception e) {
				e.printStackTrace();
			}
		return null;
	}
	
	

}
