package wipro.jdbc;

import java.sql.*;
import java.util.*;

public class Wiprosqldynamicinsertion {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/wipro?useSSL=FALSE", "root", "root");
		PreparedStatement ps = connection.prepareStatement("insert into student values(?,?)");
		Scanner read = new Scanner(System.in);
		System.out.println("Enter ID: ");
		int a = read.nextInt();
		System.out.println("Enter Name: ");
		String b = read.next();
		ps.setInt(1, a);
		ps.setString(2, b);
		int x = ps.executeUpdate();
		System.out.println(x + " row(s) got inserted");
		connection.close();
		read.close();
	}
}
