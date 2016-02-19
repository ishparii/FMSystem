package dal;

import model.facility.*;
import java.sql.*;


public class FacilityDAO {
    public Unit setUnit(Facility facility) throws SQLException {
    	Connection connection = DatabaseHelper.getConnection();
    	
    	PreparedStatement GroupPS = null;
    	

    	try {
			// set Group
			String insertGroupQuery = "INSERT INTO Facility(Facility_ID, FacilityName, FacilityOwner"
					+ "UsageType, ConstructionDate, IsGroup, ParentFacilityID) VALUEs "
					+ "(?, ?, ?, ?, ?, ?, ?)";
			
			GroupPS = connection.prepareStatement(insertGroupQuery);
			GroupPS.setInt(1, facility.getFacilityID());
			GroupPS.setString(2, facility.getName());
			GroupPS.setString(3, facility.getOwner());
			
			
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    	
    	
    	return null;
        

    }
}
