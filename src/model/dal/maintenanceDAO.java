package model.dal;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import model.facilityMaintenance.Maintenance;



public class maintenanceDAO {
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
	
	public Maintenance retrieveMaintenance(int MaintID) {
		try{
			Session session = HibernateHelper.getSessionFactory().getCurrentSession();
			session.beginTransaction();

			Query getMaintQuery = session.createQuery("From MAINTENANCE where maintenanceID = :maintenanceID");		
			getMaintQuery.setString(MaintID, "maintenanceID");
			
			List<Maintenance> maint = getMaintQuery.list();

			session.getTransaction().commit();
			
			return maint.get(0);
			} catch (Exception e) {
				e.printStackTrace();
			}
		return null;
	}
	
	

}
