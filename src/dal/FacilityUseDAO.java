package dal;

import model.facilityUse.*;
import model.facility.*;
import java.sql.*;



public class FacilityUseDAO {
	public void setFacilityUse(Usage u, Facility f) throws SQLException {
		//setter
		Connection connection = DatabaseHelper.getConnection();
		
		PreparedStatement uPS = null;
		PreparedStatement urPS = null;
		
		//set Usage
		String st1 = "INSERT INTO FacilityUsage (Usage_ID, UsageType, StartDate, EndDate, "
				+ "Room_ID, Building_ID, Group_ID) VALUES (?, ?, ?, ?, ?, ?, ?)";
		uPS = connection.prepareStatement(st1);
		uPS.setInt(1, u.getUsageID());
		uPS.setString(2, u.getUsageType());
		uPS.setDate(3, new java.sql.Date(u.getStartDate().getTime()));
		uPS.setDate(4, new java.sql.Date(u.getEndDate().getTime()));
		
		if (f instanceof Group) {
			uPS.setInt(7, ((Group) f).getFacilityID());
		} else if (f instanceof Building) {
			uPS.setInt(6, ((Building) f).getFacilityID());
		} else
			uPS.setInt(5, ((Room) f).getFacilityID());
		
		//set User
		String st2 = "INSERT INTO FacilityUser (User_ID, FName, LName, Gender, Usage_ID) VALUES"
				+ " (?, ?, ?, ?, ?)";
		urPS = connection.prepareStatement(st2);
		urPS.setInt(1, u.getUser().getUserID());
		urPS.setString(2, u.getUser().getfName());
		urPS.setString(3, u.getUser().getlName());
		urPS.setString(4,  u.getUser().getGender());
		urPS.setInt(5, u.getUsageID());
		
		if (urPS != null) {
			uPS.close();
			urPS.close();
		}
		if (connection != null) {
			connection.close();
		}
	}
	
	// getter
	public void getFacilityUse (int uID) throws SQLException {
		Statement st = DatabaseHelper.getConnection().createStatement();
		
		// get Usage
		String st1 = "SELECT Usage_ID, UsageType, StartDate, EndDate, Room_ID, Building_ID,"
				+ " Group_ID FROM FacilityUsage WHERE Usage_ID = " + uID;
		ResultSet uRS = st.executeQuery(st1);
		Usage u = new Usage();
		while (uRS.next()) {
			u.setUsageID(uRS.getInt("Usage_ID"));
			u.setUsageType(uRS.getString("UsageType"));
			u.setStartDate(new java.util.Date(uRS.getDate("StartDate").getTime()));
			u.setEndDate(new java.util.Date(uRS.getDate("EndDate").getTime()));
			
			int r_id = uRS.getInt("Room_ID");
			int b_id = uRS.getInt("Building_ID");
			int g_id = uRS.getInt("Group_ID");
			if ((Integer)r_id != null) {
				u.setFacilityID(r_id);
			} else if ((Integer)b_id != null) {
				u.setFacilityID(b_id);
			} else {
				u.setFacilityID(g_id);
			}	
		}
		uRS.close();
		
		// get User
		String st2 = "SELECT User_ID, FName, LName, Gender FROM User WHERE User_ID = " + uID;
		ResultSet urRS = st.executeQuery(st2);
		User ur = new User();
		while (urRS.next()) {
			ur.setUserID(urRS.getInt("User_ID"));
			ur.setfName(urRS.getString("FName"));
			ur.setlName(urRS.getString("LName"));
			ur.setGender(urRS.getString("Gender"));
		}
		
		urRS.close();
		st.close();
	}
}
