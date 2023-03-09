package collegeDetails.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteDatacol 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/kmmits", "root", "root");
		
		PreparedStatement ps = conn.prepareStatement("delete from collegedetails where id =?");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id...");
		String id = sc.nextLine();
		
		ps.setString(1, id);
		
		int i = ps.executeUpdate();
		if(i !=0)
		{
			System.out.println("Data Sucessfully ...");
		}
		else
		{
			System.out.println("Data not deleted..");
		}
		conn.close();
		
	}

	
}
