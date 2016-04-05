package model.dal;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import model.facilityUse.Usage;
import model.facilityUse.UsageLog;
import model.facilityUse.User;


public class UseDAO {
	
	public void addUser(User user) {
		Session session = HibernateHelper.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
	}
	
	public void deleteUser(User user) {
		Session session = HibernateHelper.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.delete(user);
		session.getTransaction().commit();
	}
	
	public User retrieveUser(int userID) {
		try {
			Session session = HibernateHelper.getSessionFactory().getCurrentSession();
			session.beginTransaction();

			Query getUserQuery = session.createQuery("From USER where userID = :userID");		
			getUserQuery.setString(userID, "userID");
			
			List<User> user = getUserQuery.list();

			session.getTransaction().commit();
			
			return (User)user.get(0);
			} catch (Exception e) {
				e.printStackTrace();
			}
		return null;
	}

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
	
	public Usage retrieveUsage(int userID) {
		try{
			Session session = HibernateHelper.getSessionFactory().getCurrentSession();
			session.beginTransaction();

			Query getUsageQuery = session.createQuery("From USAGE where userID = :userID");		
			getUsageQuery.setString(userID, "userID");
			
			List<Usage> usage = getUsageQuery.list();

			session.getTransaction().commit();
			
			return (Usage)usage.get(0);
			} catch (Exception e) {
				e.printStackTrace();
			}
		return null;
	}
	
	public void addUsageLog(UsageLog usageLog) {
		Session session = HibernateHelper.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(usageLog);
		session.getTransaction().commit();
	}
	
	public void deleteUsageLog(UsageLog usageLog) {
		Session session = HibernateHelper.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.delete(usageLog);
		session.getTransaction().commit();
	}
	
	public List<UsageLog> retriveUsageLog(int usageLogID) {
        try {
            Session session = HibernateHelper.getSessionFactory().getCurrentSession();
            session.beginTransaction();
            
            Query getUsageLogQuery = session.createQuery("From USAGELOG where usageLogID=:usageLogID");
            getUsageLogQuery.setString(usageLogID,"usageLogID");
         
            List<UsageLog> usageLog = getUsageLogQuery.list();

            session.getTransaction().commit();

            return usageLog;
        } catch(Exception e) {
        	e.printStackTrace();
        }
        return null;
    }
}
