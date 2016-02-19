package dal;

import model.facility.*;
import java.sql.*;


public class FacilityDAO {
    public Unit getUnit(String unitID){
        //get Unit
    	try {
			Statement statement = DatabaseHelper.getConnection().createStatement();
			String selectUnitQuery = "SELECT Unit_ID, UnitNumber, UsageType, Name, "
					+ "Owner, ConstructionDate FROM Unit WHERE Unit_ID = '" + unitID + "'";
			
			ResultSet customerResultSet = statement.executeQuery(selectUnitQuery);
			
			Unit unit = new Unit();
			while(customerResultSet.next()) {
				
			}
			
			
			
			return unit;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    	
    	
    	return null;
        

    }
}
