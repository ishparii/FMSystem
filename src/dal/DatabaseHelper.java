package dal;

import java.sql.*;
//import javax.sql.*;
//import java.util.Properties;

public class DatabaseHelper {
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdcb:mysql:3306//localhost/facilityMS";
	
	static final String user = "root";
	static final String password = "K02200059";
	
	public Connection getConnetction() throws SQLException {
		Connection connection = null;
//		Properties connectionProperties = new Properties();	
//		
//		connectionProperties.put("user", this.user);
//		connectionProperties.put("password", this.password);
		
		connection = DriverManager.getConnection(DB_URL, user, password);
		
		return connection;
	}	
}
