package collegeDetails.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kmmits", "root", "root");
		
		Statement st = conn.createStatement();
		st.execute("create table collegedetails(id varchar(10) primary key,name varchar(40) not null,branch varchar(30),username varchar(20) not null,password varchar(10) not null)");
		System.out.println("Table Created....");
		conn.close();
		
	}

	
}
