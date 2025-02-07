package wipro.jdbc;

import java.sql.*;
import java.util.*;

public class Wiprosqlmenudrivendynamicinsertion {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/wipro?useSSL=FALSE", "root", "root");
		PreparedStatement ps = c.prepareStatement("insert into student values(?,?)");
		Scanner read = new Scanner(System.in);
		while(true) {
			System.out.println("====Insertion into Table====");
			System.out.println("1. Insert");
			System.out.println("2. Exit");
			int x = read.nextInt();
			switch(x) {
			case 1 :
				System.out.println("Enter ID: ");
				int a = read.nextInt();
				System.out.println("Enter Name: ");
				String b = read.next();
				ps.setInt(1, a);
				ps.setString(2, b);
				int update = ps.executeUpdate();
				System.out.println(update + " row got inserted");
				break;
			case 2:
				System.out.println("Exiting");
                read.close();
                System.exit(0);
			default:
                System.out.println("Invalid choice. Please try again.");
			}	
		}
	}
}
