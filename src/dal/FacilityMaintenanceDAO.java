package dal;

import model.facilityMaintenance.*;
import model.facility.*;
import java.sql.*;



public class FacilityMaintenanceDAO {
	//setter
	public void setFacilityMaintenance(Request r, Facility f) throws Exception {
		Connection connection = DatabaseHelper.getConnection();
		
		PreparedStatement rPS = null;
		PreparedStatement mPS = null;
		PreparedStatement schPS = null;
		PreparedStatement sPS = null;
		PreparedStatement cPS = null;
		
		//set Request
		String st1 = "INSERT INTO Request (Request_ID, DateRequested, TextDescription, Room_ID"
				+ "Building_ID, Group_ID) VALUES (?, ?, ?, ?, ?, ?)";
		rPS = connection.prepareStatement(st1);
		rPS.setInt(1, r.getRequestID());
		rPS.setDate(2, new java.sql.Date(r.getDateRequested().getTime()));
		rPS.setString(3, r.getTextDescription());
		
		if (f instanceof Group) {
			rPS.setInt(6, ((Group) f).getFacilityID());
		} else if (f instanceof Building) {
			rPS.setInt(5, ((Building) f).getFacilityID());
		} else
			rPS.setInt(4, ((Room) f).getFacilityID());
		
		rPS.executeUpdate();
		
		//set Maintenance
		String st2 = "INSERT INTO Maintenance (Maintenance_ID, Status, Priority, MaintenanceType,"
				+ " IssueDescription, Request_ID) VALUES (?, ?, ?, ?, ?, ?)";
		mPS = connection.prepareStatement(st2);
		Maintenance m = r.getMaintenance();
		mPS.setInt(1, m.getMaintenanceID());
		mPS.setString(2, m.getStatus());
		mPS.setBoolean(3, m.isPriority());
		mPS.setString(4,  m.getMaintenanceType());
		mPS.setString(5, m.getIssueDescription());
		mPS.setInt(6, r.getRequestID());
		
		mPS.executeUpdate();
		
		// set Schedule
		String st3 = "INSERT INTO Schedule (Schedule_ID, DateScheduled, Maintenance_ID) "
				+ "VALUES (?, ?, ?)";
		schPS = connection.prepareStatement(st3);
		Schedule sch = m.getSchedule();
		schPS.setInt(1, sch.getScheduleID());
		schPS.setDate(2, new java.sql.Date(sch.getDateScheduled().getTime()));
		schPS.setInt(3, m.getMaintenanceID());
		
		schPS.executeUpdate();
		
		// set Service
		String st4 = "INSERT INTO Service (Service_ID, ServiceTime, Schedule_ID) VALUES (?,"
				+ " ?, ?)";
		sPS = connection.prepareStatement(st4);
		Service s = sch.getService();
		sPS.setInt(1, s.getServiceID());
		sPS.setTimestamp(2, s.getServiceTime());
		sPS.setInt(3, sch.getScheduleID());
		
		sPS.executeUpdate();
		
		// set Cost
		String st5 = "INSERT INTO Cost (Cost_ID, LaborCost, MaterialCost, Extra, Service_ID) "
				+ "VALUES (?, ?, ?, ?, ?)";
		cPS = connection.prepareStatement(st5);
		Cost c = s.getCost();
		cPS.setInt(1, c.getCostID());
		cPS.setFloat(2, c.getLaborCost());
		cPS.setFloat(3, c.getMaterialCost());
		cPS.setFloat(4, c.getExtra());
		cPS.setInt(5, s.getServiceID());
		
		cPS.executeUpdate();
			
		if (cPS != null) {
			rPS.close();
			mPS.close();
			schPS.close();
			sPS.close();
			cPS.close();
		}
		if (connection != null) {
			connection.close();
		}
	}

		
	 // getter
	public void getFacilityMaintenance (int rID) throws Exception {
		Statement st = DatabaseHelper.getConnection().createStatement();
		
	// get Request
		String st1 = "SELECT Request_ID, DateRequested, TextDescription FROM FacilityUsage "
				+ "WHERE Request_ID = " + rID;
		ResultSet rRS = st.executeQuery(st1);
		Request r = new Request();
		while (rRS.next()) {
			r.setRequestID(rRS.getInt("Reqeust_ID"));
			r.setDateRequested(rRS.getTimestamp("DateRequested"));
			r.setTextDescription(rRS.getString("TextDescription"));
			
//			int r_id = rRS.getInt("Room_ID");
//			int b_id = rRS.getInt("Building_ID");
//			int g_id = rRS.getInt("Group_ID");
//			if ((Integer)r_id != null) {
//				r.setFacilityID(r_id);
//			} else if ((Integer)b_id != null) {
//				r.setFacilityID(b_id);
//			} else {
//				r.setFacilityID(g_id);
//			}	
		}
		rRS.close();
	
		// get Maintenance
		String st2 = "SELECT Maintenance_ID, Status, Priority, MaintenanceType, IssueDescription"
				+ " FROM Maintenance WHERE Request_ID = " + rID;
		ResultSet mRS = st.executeQuery(st2);
		Maintenance m = new Maintenance();
		while (mRS.next()) {
			m.setMaintenanceID(mRS.getInt("MaintenanceID"));
			m.setStatus(mRS.getString("Status"));
			m.setPriority(mRS.getBoolean("Priority"));
			m.setMaintenanceType(mRS.getString("MainenanceType"));
			m.setIssueDescription(mRS.getString("IssueDescription"));	
		}
		r.setMaintenance(m);
		mRS.close();
		
		// get Schedule
		String st3 = "SELECT Schedule_ID, DateScheduled FROM Schedule WHERE Maintenance_ID = "
				+ m.getMaintenanceID();
		ResultSet schRS = st.executeQuery(st3);
		Schedule sch = new Schedule(new java.util.Date(schRS.getDate("DateScheduled").getTime()));
		while (schRS.next()) {
			sch.setScheduleID(schRS.getInt("schedule_ID"));
		}
		m.setSchedule(sch);
		schRS.close();
		
		// get Service
		String st4 = "SELECT Service_ID, ServiceTime FROM Service WHERE Schedule_ID = " 
				+ sch.getScheduleID();
		ResultSet sRS = st.executeQuery(st4);
		Service s = new Service();
		while (sRS.next()) {
			s.setServiceID(sRS.getInt("Service_ID"));
			s.setServiceTime(sRS.getTimestamp("ServiceTime"));
		}
		sch.setService(s);
		sRS.close();
		
		// get Cost
		String st5 = "SELECT Cost_ID, LaborCost, MaterialCost, Extra FROM Cost WHERE Service_ID"
				+ " = " + s.getServiceID();
		ResultSet cRS = st.executeQuery(st5);
		Cost c = new Cost();
		while (cRS.next()) {
			c.setCostID(cRS.getInt("Cost_ID"));
			c.setLaborCost(cRS.getFloat("LaborCost"));
			c.setMaterialCost(cRS.getFloat("MaterialCost"));
			c.setExtra(cRS.getFloat("Extra"));
		}
		s.setCost(c);
		cRS.close();

		st.close();
		
	}
}
