package day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectDemo {
	
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/manish112","root","root");

  PreparedStatement ps =  conn.prepareStatement("select * from emp" );

  ResultSet rs = ps.executeQuery();
  
  while(rs.next())
  {
	String name1=rs.getString("name");
   System.out.print("Name :" +name1);
   
   String email1=rs.getString("email");
   System.out.println("  Email :" +email1);
  

  }
	}

}
