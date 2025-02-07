package wipro.jdbc;

import java.sql.*;

public class WiproSqlSelectStatement {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/wipro?useSSL=FALSE", "root", "root");
		Statement statement = connection.createStatement();
		ResultSet result = statement.executeQuery("select * from student");
		while(result.next()) {
			System.out.println(result.getInt(1) + " " + result.getString(2));
		}
		connection.close();
	}
}
