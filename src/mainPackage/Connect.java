package mainPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import oracle.jdbc.driver.OracleDriver;

abstract public class Connect {
	
	static Connection conn=null;
	public static void getConnection() {
	
			try {
				DriverManager.registerDriver(new OracleDriver());
				conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",
						"system", "youcantseeme");
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
	}
}
