package collegeDetails.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertDataColl 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		 Class.forName("com.mysql.cj.jdbc.Driver");
		
		 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kmmits", "root","root");
		 PreparedStatement ps = conn.prepareStatement("insert into collegedetails values(?,?,?,?,?)");
		 Scanner sc = new Scanner(System.in);
		 while(true)
		 {
			 System.out.println("Enter the id..");
			 String id=sc.nextLine();
			 
			 System.out.println("Enter the Name.....");
			 String name = sc.nextLine();
			 
			 System.out.println("Enter the Branch....");
			 String branch  = sc.nextLine();
			 
			 System.out.println("Enter the Username");
			 String username = sc.nextLine();
			 
			 System.out.println("Enter the password...");
			 String password = sc.nextLine();
			 
			 ps.setString(1, id);
			 ps.setString(2, name);
			 ps.setString(3, branch);
			 ps.setString(4, username);
			 ps.setString(5, password);
			 
			 ps.executeUpdate();
		 }
		 
		
	}

	
}
