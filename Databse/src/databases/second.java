package databases;

import java.sql.Connection;
import java.sql.DriverManager;

public class second {


	public static void main(String[] args) {
		
		Connection conn = null;

		try {
			conn = (Connection)DriverManager.getConnection(""
					+ "jdbc:mysql://localhost:3306//new_Schema","root", "1234");
			if(conn!=null) {
				System.out.println("Conneto to database");
			}
		}
		catch (Exception e) {
			System.out.println("Not connected");
		}
	}
}
