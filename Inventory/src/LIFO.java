import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Arrays;

public class LIFO<T> {
	private static Connection connect = null;
	private static Statement statement = null;
	private static ResultSet resultSet = null;

	private static int count;
	private T[] data;

	public LIFO() {
		data = (T[]) new Object[5];
		count = 0;
	}

	void expandCapacity() {
		data = Arrays.copyOf(data, data.length * 2);
	}

	void push(T e) {
		if (count == data.length)
			expandCapacity();
		data[count++] = e;
	}

	T pop() throws Exception {
		if (count <= 0) {
			throw new Exception("stack empty");
		}
		count--;
		return data[count];
	}

	boolean isEmpty() {
		return count == 0;
	}

	static int size() {
		return count;
	}

	public static void main(String[] args) throws Exception {
		LIFO<Integer> s = new LIFO<Integer>();

		try {
 
			// Setup the connection with the DB
			connect = (Connection) DriverManager
					.getConnection("jdbc:mysql://www.papademas.net:3307/mydb?" + "user=dbuser&password=db1");
			// Statements allow to issue SQL queries to the database
			statement = (Statement) connect.createStatement();
			// Result set gets the result of the SQL query
			resultSet = statement.executeQuery("select cost from jpapaInventory");
			// ResultSet is initially before the first data set
			while (resultSet.next()) {
				/*
				 * column data may be retrieved via name e.g. resultSet.getString("name"); or
				 * via the column number which starts at 1 e.g. resultSet.getString(1);
				 */
				int cost = resultSet.getInt(1); // retrieve cost
				s.push(cost); // push cost value onto stack

				System.out.println("Push item : " + s.count + " " + cost);
			}

			while (!s.isEmpty())// pop values from stack
				System.out.println("Pop iem : " + s.count + " " + s.pop());

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
