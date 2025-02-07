package wipro.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Wiprosqltrxns {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/wipro?useSSL=FALSE", "root", "root");
		Statement statement = connection.createStatement();
		connection.setAutoCommit(false);
//		statement.executeUpdate("insert into sbi values(1001, 'Mayank', 10000");
//		statement.executeUpdate("insert into canara values(2001, 'Pradeep', 11000");
		
		int a = statement.executeUpdate("update sbi set bal=bal+5000 where accno=1001");
		int b = statement.executeUpdate("update canara set bal=bal-5000 where accno=1001");
		
		if(a > 0 && b > 0) {
			connection.commit();
			System.out.println("Funds transferred successfully!");
		}
		else {
			connection.rollback();
			System.out.println("Some Error Ocurred! Check with the information!");
		}
		connection.close();
	}
}
