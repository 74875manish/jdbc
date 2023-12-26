package day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateDemo {
	
	public static void main(String[] args) throws Exception {
		
		
		String name= "khushi";
		String email = "san74644";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		//System.out.println("Driver successfully");
		
		
	  Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/manish112", "root", "root");
	   // System.out.println("Sucess");
	  
	PreparedStatement st =     conn.prepareStatement(" update emp set name=? where email=?");
	 
	 st.setNString(1,name);
	 st.setNString(2, email);
	 
	 int i = st.executeUpdate();
	 if(i>0)
	 {
		 System.out.println("sucesss goog");
		 
	 }
	 else
	 {
		 System.out.println("fail");
	 }
	}

}
