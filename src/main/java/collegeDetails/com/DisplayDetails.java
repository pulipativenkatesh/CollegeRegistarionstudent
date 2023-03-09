package collegeDetails.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DisplayDetails 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kmmits", "root", "root");
		
	    Statement ps = conn.createStatement();
		ResultSet re=ps.executeQuery("select * from collegedetails");
		while(re.next())
		{
			System.out.println(re.getString(1)+"  "+re.getString(2)+" "+re.getString(3)+" "+re.getString(4)+" "+re.getString(5));
		}
		conn.close();
	}

	
}

