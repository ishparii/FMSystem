package model.dal;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import model.facilityUse.Usage;


public class UseDAO {

	public void addUsage(Usage usage) {
		Session session = HibernateHelper.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(usage);
		session.getTransaction().commit();
	}
	
	public void deleteUsage(Usage usage) {
		Session session = HibernateHelper.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.delete(usage);
		session.getTransaction().commit();
	}
	
	public Usage retrieveUsage(int usageID) {
		try{
			Session session = HibernateHelper.getSessionFactory().getCurrentSession();
			session.beginTransaction();

			Query getUsageQuery = session.createQuery("From USAGE where usageID = :usageID");		
			getUsageQuery.setString(usageID, "usageID");
			
			List<Usage> usage = getUsageQuery.list();

			session.getTransaction().commit();
			
			return (Usage)usage.get(0);
			} catch (Exception e) {
				e.printStackTrace();
			}
		return null;
	}

}
