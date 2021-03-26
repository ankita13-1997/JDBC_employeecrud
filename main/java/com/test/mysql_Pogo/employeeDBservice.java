package com.test.mysql_Pogo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class employeeDBservice {
	
	static Scanner sc= new Scanner(System.in);
	static boolean exit=false;
	static Connection conneection;
	static Statement statement;
	
		  public static List<Employe> display_EmployeeDetails() throws SQLException
		  { 
			 
			  
			  List<Employe> Employe = new ArrayList<>();
			  try 
			  {
                    conneection=ServiceConnection.getConnection();
				    statement= conneection.createStatement();
					ResultSet result = statement.executeQuery("select * from employee_system ");
				    while(result.next())
					{
					  Employe e= new Employe();
					  e.setId(result.getInt(1));
					  e.setName(result.getString(2));
					  e.setGender(result.getString(3));
					  e.setSalary(result.getDouble(4));
					  e.setAdress(result.getString(5));
					  e.setPhone_no(result.getString(6));
					  e.setDate_join(LocalDate.parse(result.getString(7)));
					  Employe.add(e);
					  
					}
				  conneection.close();
				  
				  
					// TODO: handle exception
				}
			  
			  catch (SQLException e) {
				   e.printStackTrace();
					}
			  
				  
			  return Employe;
			  }
		  
		  public static List<Salary> getSalaryDetails() throws SQLException
		  {
			     List<Salary> salarylist =new ArrayList<>();
			     
			     try {
			     conneection=ServiceConnection.getConnection();
			    statement= conneection.createStatement();
				ResultSet result = statement.executeQuery("SELECT * from earning  ");
				while(result.next())
				{
					Salary sal = new Salary();
					sal.setId(result.getInt(1));
					sal.setBasic_Pay(result.getDouble(2));
					sal.setDeduction(result.getDouble(3));
					sal.setTaxPay(result.getDouble(4));
					sal.setTax(result.getDouble(5));
					sal.setE_id(result.getInt(6));
					salarylist.add(sal);
				}
				     conneection.close();
			     }
				catch (SQLException e) 
				{
					// TODO: handle exception
					e.printStackTrace();
				}
				
			     return salarylist;
			  
		  }
			
			  
		 
		
		  public static int insertValues() throws SQLException, ClassNotFoundException, IOException 
			{
			PreparedStatement statement1;
			int i = 0;
				 
				 try {
				 System.out.println("inserting into the table ");
				 conneection=ServiceConnection.getConnection();
				 statement1= conneection.prepareStatement("insert into employee_system(name,gender,salary,adress,phone_no,date_join)"
				 		                                 + "values(?,?,?,?,?,?)");
				 
				
				 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				   do {
					   
					   System.out.println("enter the name");
					   String name= br.readLine();
					   System.out.println("enter the gender");
					   String gender =br.readLine();
					   System.out.println("enter the salary");
					   double salary = Double.parseDouble(br.readLine());
					   System.out.println("enter the adress");
					   String adress = br.readLine();
					   System.out.println("enter phone number");
					   String phone_no=br.readLine();
					   System.out.println("enter date of joining ");
					   String date1= br.readLine();
					   Date date_join = Date.valueOf(date1);
					   
					   
					   statement1.setString(1, name);
					   statement1.setString(2, gender);
					   statement1.setDouble(3, salary);
					   statement1.setString(4, adress);
					   statement1.setString(5, phone_no);
					   statement1.setDate(6, date_join);
					   
					    i = statement1.executeUpdate();
				   
				   System.out.println();
				   System.out.println("inserted sucessfully " +i+ "rows affected\n");
				   
				   System.out.println("do you want to continue Y[yes]/N[no]");
				   
				   String option = br.readLine();
				   if(option.startsWith("N"))
				   {
					   break;
				   }
				   
				   System.out.println("--------------------------------------------------------------------------------------------");
				 }
				   while(true);
				   
				 
				 }
				 
				 catch(SQLException  e)
					{
						//throw new IllegalStateException("cannot find driver");
						e.printStackTrace();
					}
				
				conneection.close();
				return i; 
			}
		 
		 

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
