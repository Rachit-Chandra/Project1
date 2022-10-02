package banking;

import java.sql.Connection;
import java.sql.DriverManager;
// Global connection Class
public class connection {
	static Connection con; // Global Connection Object
	public static Connection getConnection()
	{
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			String url= "jdbc:mysql://localhost:3306/bank"; //mysql url
			String user = "root";	 //mysql username
			String pass = "Naman15#10"; //mysql passcode
			
			con = DriverManager.getConnection(url, user,pass);
			System.out.println("Connection Successfull");
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Connection Failed!");
		}

		return con;
	}
}
