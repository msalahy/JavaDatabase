package Inventory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DAO {
	private Connection connect = null;
	private Statement statement = null;

	public void createDataBase() throws Exception {
		try {
			// This will load the MySQL driver, each DB has its own driver
			Class.forName("com.mysql.jdbc.Driver");
			// Setup the connection with the DB
			connect = DriverManager.getConnection("jdbc:mysql://www.papademas.net:3307/mydb?" + "user=dbuser&password=db1");

			// create table

			statement = connect.createStatement();

			String sql = "CREATE TABLE jpapaInventory " + "(id INTEGER not NULL AUTO_INCREMENT, " + " cost INTEGER, "
					+ " PRIMARY KEY ( id ))";

			statement.executeUpdate(sql);
			System.out.println("Created table in given database...");

			// end create table
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void insertIntoDataBase() throws Exception {
		try {

			// Setup the connection with the DB
			connect = DriverManager.getConnection("jdbc:mysql://www.papademas.net:3307/mydb?" + "user=dbuser&password=db1");

			System.out.println("Inserting records into the table...");
			statement = connect.createStatement();

			String sql = "INSERT INTO jpapaInventory(cost) " + "VALUES (400)";
			statement.executeUpdate(sql);
			sql = "INSERT INTO jpapaInventory(cost) VALUES (400)";
			statement.executeUpdate(sql);
			sql = "INSERT INTO jpapaInventory(cost) VALUES (500)";
			statement.executeUpdate(sql);
			sql = "INSERT INTO jpapaInventory(cost) VALUES (500)";
			statement.executeUpdate(sql);
			sql = "INSERT INTO jpapaInventory(cost) VALUES (600)";
			statement.executeUpdate(sql);

			System.out.println("Inserted records into the table...");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) throws Exception {
		DAO dao = new DAO();
		//dao.createDataBase();
		dao.insertIntoDataBase();
	}
}
