package day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteDemo {
	
	public static void main(String[] args) throws Exception {
		
		String email="tanay7668";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		 
	Connection conn =	DriverManager.getConnection("jdbc:mysql://localhost:3306/manish112", "root", "root");

	
	PreparedStatement ps =    conn.prepareStatement("delete from emp where email=?");
	    ps.setNString(1, email);
	  int i=  ps.executeUpdate();
	  if(i>0) {
		  System.out.println("Deletion sucessfull");
	  }
	    
	  else
	  {
		  System.out.println("Not delete");
	  }
		
	}

}
