package Resume.Model;

import java.sql.Connection;
import java.sql.DriverManager;

public class Provider {
	
	public static Connection getOracleConnection()
	{
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1545:xe","system","system");
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return con;
	}
	public static Connection getMySqlConnection()
	{
		Connection con=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","mysql");
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return con;
	}
}
