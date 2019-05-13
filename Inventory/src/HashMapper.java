

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashMapper {

	private static Connection connect = null;
	private static Statement statement = null;
	private static ResultSet resultSet = null;

	public static void main(String[] args) {

		try {
		 	// Setup the connection with the DB
			connect = (Connection) DriverManager
					.getConnection("jdbc:mysql://www.papademas.net:3307/mydb?" + "user=dbuser&password=db1");
			// Statements allow to issue SQL queries to the database
			statement = (Statement) connect.createStatement();
			// Result set gets the result of the SQL query
			resultSet = statement.executeQuery("select cost from jpapaInventory");

			ResultSetMetaData md = resultSet.getMetaData();
			int columns = md.getColumnCount();

			// create list
			List<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();

			while (resultSet.next()) {
				HashMap<String, Object> row = new HashMap<String, Object>(columns);
				for (int i = 1; i <= columns; ++i) {
					row.put(md.getColumnName(i), resultSet.getObject(i));
				}
				list.add(row);
			}
			// display hashmap result - key:value pair!
			for (Object results : list) {
				@SuppressWarnings("rawtypes")
				HashMap map = (HashMap) results;
				for (Object key : map.keySet()) {
					System.out.print(key + " = " + map.get(key) + "; ");
				}

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
