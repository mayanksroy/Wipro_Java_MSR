package wipro.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Wiprosqlmetadata {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/wipro?useSSL=FALSE", "root", "root");
		Statement statement = connection.createStatement();
		ResultSet resultset = statement.executeQuery("Select * from student");
		ResultSetMetaData rsmd = resultset.getMetaData();
		
		System.out.println(rsmd.getColumnCount());
		System.out.println(rsmd.getSchemaName(1));
		
		for(int i = 1;i<=rsmd.getColumnCount();i++) {
			System.out.println(rsmd.getColumnName(i) + " " + rsmd.getColumnTypeName(i) + " " + rsmd.getPrecision(i) + " " + rsmd.getSchemaName(i));
		}
	}
}
