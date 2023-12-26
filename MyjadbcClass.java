package day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class MyjadbcClass {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded successfully");
		
		  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/manish112", "root", "root");
		
		  System.out.println("success");
		  
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter your name");
		  String name =   sc.nextLine();
		  
		  System.out.println("Enter your email");
		  String email =  sc.nextLine();
		  
		  System.out.println("Enter your Age");
		   int age = sc.nextInt();
		   System.err.println("Enter your salary");
		   float salary = sc.nextFloat();

		    
		  
		 PreparedStatement ps =   conn.prepareStatement("insert into emp values(?,?,?,?)");
		 ps.setNString(1, name);
		 ps.setNString(2, email);
		 ps.setInt(3, age);
		 ps.setFloat(4, salary);
		 
		 int i = ps.executeUpdate();
		 if(i>0) {
			 System.out.println("sucessfull enter");
			 
		 }
		 else {
			 System.out.println("Not eneter");
		 }
				 
		 
		 
	}
}
