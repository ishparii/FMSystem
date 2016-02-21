package dal;

import java.sql.*;

import model.facility.*;
import model.inspection.Inspection;

public class InspectionDAO {
	// setter
	public void setInspection(Inspection i, Facility f) throws SQLException {
		Connection connection = DatabaseHelper.getConnection();
		
		String st = "INSERT INTO Inspection (Inspection_ID, InsepctionType, InspectionDate, "
				+ "Inspector, OutCome, Room_ID, BuildingID, Group_ID) VALUES (?, ?, ?, ?, "
				+ "?, ?, ?, ?";
		PreparedStatement iPS = connection.prepareStatement(st);
		iPS.setInt(1, i.getInspectionID());
		iPS.setString(2, i.getInspectionType());
		iPS.setDate(3, new java.sql.Date(i.getInspectionDate().getTime()));
		iPS.setString(4, i.getInspector());
		iPS.setString(5, i.getOutcome());
		
		if (f instanceof Group) {
			iPS.setInt(8, ((Group) f).getGroupID());
		} else if (f instanceof Building) {
			iPS.setInt(7, ((Building) f).getBuildingID());
		} else
			iPS.setInt(6, ((Room) f).getRoomID());
		
		if (iPS != null) {
			iPS.close();
		}
		if (connection != null) {
			connection.close();
		}
	}
	
	//getter
	public Inspection getInspcetion(int iID) throws SQLException {
		Statement st = DatabaseHelper.getConnection().createStatement();
		
		String st1 = "SELECT InspectionType, InspectionDate, Inspector, OutCome, "
				+ "Room_ID, BuildingID, Group_ID FROM Inspection WHERE Inspection_ID = " + iID;
		
		ResultSet iRS = st.executeQuery(st1);
		Inspection i = new Inspection();
		while (iRS.next()) {
			i.setInspectionType(iRS.getString("InspectionType"));
			i.setInspectionDate(new java.util.Date(iRS.getDate("InspectionDate").getTime()));
			i.setInspector(iRS.getString("Inspector"));
			i.setOutcome(iRS.getString("Outcome"));
			
			int r_id = iRS.getInt("Room_ID");
			int b_id = iRS.getInt("Building_ID");
			int g_id = iRS.getInt("Group_ID");
			
			if ((Integer)r_id != null) {
				i.setFacilityID(r_id);
			} else if ((Integer)b_id != null) {
				i.setFacilityID(b_id);
			} else {
				i.setFacilityID(g_id);
			}
		}
		iRS.close();
		st.close();
		
		return i;
	}
}
