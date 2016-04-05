package model.dal;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import model.inspection.*;

public class InspectionDAO {
	public void addInspection(Inspection insp) {
		Session session = HibernateHelper.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(insp);
		session.getTransaction().commit();
	}
	
	public void deleteInspection(Inspection insp) {
		Session session = HibernateHelper.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.delete(insp);
		session.getTransaction().commit();
	}
	
	public Inspection retrieveInspection(int inspID) {
		try {
			Session session = HibernateHelper.getSessionFactory().getCurrentSession();
			session.beginTransaction();

			Query getInspQuery = session.createQuery("From INSPECTION where inspectionID = :inspectionID");		
			getInspQuery.setString(inspID, "inspectionID");
			
			List<Inspection> insps = getInspQuery.list();

			session.getTransaction().commit();
			
			return insps.get(0);
			} catch (Exception e) {
				e.printStackTrace();
			}
		return null;
	}
	
	public void addInspectionLog(IInspectionLog inspLog) {
		Session session = HibernateHelper.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(inspLog);
		session.getTransaction().commit();
	}
	
	public void deleteInspectionLog(IInspectionLog inspLog) {
		Session session = HibernateHelper.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.delete(inspLog);
		session.getTransaction().commit();
	}
	
	public List<IInspection> retriveInspectionLog(int inspLogID) {
        try {
            Session session = HibernateHelper.getSessionFactory().getCurrentSession();
            session.beginTransaction();
            

            Query getInspLogQuery = session.createQuery("From INSPECTIONLOG where inspectionLogID=:inspectionLogID");
            getInspLogQuery.setString(inspLogID,"inspectionLogID");

            List<IInspection> inspections = getInspLogQuery.list();

            session.getTransaction().commit();

            return inspections;
        } catch(Exception e) {
        	e.printStackTrace();
        }
        return null;
    }
}
