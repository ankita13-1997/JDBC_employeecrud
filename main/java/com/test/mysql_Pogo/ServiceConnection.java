package com.test.mysql_Pogo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ServiceConnection {
	
	static String jdbcUrl="jdbc:mysql://localhost:3306/employee_payroll?useSSL=false/db?allowPublicKeyRetrieval=true&useSSL=false";
	static String username="root";
	static String password="Ankita@9713";
	static Connection conneection;
	public static Connection getConnection() {
		
		  try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded");
			System.out.println("Connecting to database "+jdbcUrl);
			conneection=DriverManager.getConnection(jdbcUrl,username,password);
			System.out.println("don!!!");
			
			
		    }
		catch(ClassNotFoundException | SQLException  e)
		{
			//throw new IllegalStateException("cannot find driver");
			e.printStackTrace();
		}
		
		  return conneection;
	}

}
