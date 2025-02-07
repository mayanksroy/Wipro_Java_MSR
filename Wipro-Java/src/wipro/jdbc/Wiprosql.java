package wipro.jdbc;

import java.sql.*;

public class Wiprosql {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//load the driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Class Loaded");
		
		//obtain the connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/wipro?useSSL=false", "root", "root");
		System.out.println("I got the connection from db");
		
		//create statement object
		Statement statement = connection.createStatement();
		
		//process query
//		int sql = statement.executeUpdate("insert into student values(103, 'Harshit')");
//		System.out.println(x + " row(s) got executed");
		
		String sql = "INSERT INTO student values(105, 'Lalit')";
		int x = statement.executeUpdate(sql);
		System.out.println(x+ "row(s) got inserted");

		
		//close the connection
		connection.close();
	}
}