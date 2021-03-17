package com.test.mysql_Pogo;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class EmployeeService {
	static boolean exit=false;
	static Scanner sc= new Scanner(System.in);
	public void printRecordsFromDB() throws  SQLException 
	{
		// TODO Auto-generated method stub
		System.out.println(display_EmployeeDetails().toString());
		
	}
	public void printRecordsFromDBofSalary() throws SQLException {
		// TODO Auto-generated method stub
		System.out.println(display_FromDBofSalary().toString());
	}


	
	private List<Employe> display_EmployeeDetails() throws SQLException {
	      return employeeDBservice.display_EmployeeDetails();
		// TODO Auto-generated method stub
		
	}
	private List<Salary> display_FromDBofSalary() throws SQLException {
		
		// TODO Auto-generated method stub
		return employeeDBservice.getSalaryDetails() ;
	}
	public int insertrecords() throws ClassNotFoundException, SQLException, IOException {
		// TODO Auto-generated method stub
		 return employeeDBservice.insertValues();
	}

	public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		while(!exit) 
		{
			System.out.println("welcome to employee payroll system");
			System.out.println("---------------------------------------------------------------------------------------");
			System.out.println("enter your choice");
			System.out.println("[0] for closing the connection");
			System.out.println("[1] for exit");
			System.out.println("[2] for display for employee");
			System.out.println("[3] for display for salary table");
			System.out.println("[4] for inserting values");
			
			EmployeeService servicedesk = new EmployeeService();
            int choice = sc.nextInt();
			
			switch(choice)
			{
			case 2 :
		         
		         servicedesk.printRecordsFromDB();
		         break;
		         
			case 3 :
				servicedesk.printRecordsFromDBofSalary();
				break;
				
			case 4 :
				servicedesk.insertrecords();
		         
			}
		}
	}
	


	

	
	
 
}
