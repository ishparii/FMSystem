package dal;

import model.facility.*;
import java.sql.*;


public class FacilityDAO {
	
	public void setFacility (Facility facility) throws SQLException {
		
		Connection connetion = DatabaseHelper.getConnection();
		
		PreparedStatement roomPS = null;
		PreparedStatement buildingPS = null;
		PreparedStatement groupPS = null;
		PreparedStatement addressPS = null;
		PreparedStatement managerPS = null;
		
		//set room
//		roomPS = "SELECT "
	}
}
