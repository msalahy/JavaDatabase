

import java.util.*;
import java.sql.*;



public class Coffee {

	public static void main(String[] args) {
		String description;
		String prodNum;
		double price;
		Connection connect;
		Statement statement;
		ResultSet resultSet;
		
		final String DB_URL = "jdbc:mysql://www.papademas.net"
		        + ":3307/411labs?autoReconnect=true&useSSL=false";
		    final String USER = "db411";
			final String PASS = "411";
		    
//			Scanner keyboard = new Scanner(System.in);
//			
//			boolean flag = true;
//			
//			while (flag) {
			//try {
//				Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				
//				System.out.println("Enter the coffee despcription: ");
//				description = keyboard.nextLine();
//				
//				System.out.println("Enter the product number: ");
//				prodNum = keyboard.nextLine();
//				
//		
//				
//				System.out.println("Enter the price: ");
//				price = keyboard.nextDouble();
//				
//				Statement stmt = conn.createStatement();
//				   String sqlStatement = "INSERT INTO Coffee " +
//		                      "(ProdNum, Price, Description) " +
//		                      "VALUES ('" +prodNum + "', " + price + ", '" + description + "')";
//				   int rows = stmt.executeUpdate(sqlStatement);
//				   System.out.println(rows+ " row(s) added to the table.");
//				   conn.close();
				
				try {
			    Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement stmt = conn.createStatement();
				String sql ="SELECT COUNT(*) FROM Coffee";
				resultSet = stmt.executeQuery(sql);
				while(resultSet.next()) {
					System.out.printf("%f",
		            resultSet.getFloat(1));
				}
				}
			catch(Exception ex){
				System.out.println("Error: "+ex.getMessage());
			}
//			System.out.println("Do you wnat to quit?");
//		    char answer = keyboard.next().charAt(0); 
//			if (answer == 'y' || answer == 'Y') 
//				System.out.println("Thank you, see you later!");
//				flag=false;
//			keyboard.nextLine();
//			}

}
}
