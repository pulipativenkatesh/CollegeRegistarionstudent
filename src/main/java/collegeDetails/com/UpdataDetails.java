package collegeDetails.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdataDetails
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kmmits", "root", "root");
		
		PreparedStatement ps =conn.prepareStatement("update collegedetails set password =? where username=?");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entert the username...");
		String username = sc.nextLine();
		
		System.out.println("enter the password..");
		String password = sc.nextLine();
		
		ps.setString(1, password);
		ps.setString(2, username);
		
		int i = ps.executeUpdate();
		
		if(i!= 0)
		{
			System.out.println("sucessfully updated...");
		}
		else
		{
			System.out.println("Not updated");
		}
		conn.close();
	}
	

	
}
