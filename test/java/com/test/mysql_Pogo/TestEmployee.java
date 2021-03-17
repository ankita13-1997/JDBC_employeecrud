package com.test.mysql_Pogo;

import java.io.IOException;
import java.sql.SQLException;

import org.junit.Test;

public class TestEmployee {
	
	
	@Test
	public void printRecordsFromDBtest() throws SQLException
	{
		EmployeeService servicTest = new EmployeeService();
		servicTest.printRecordsFromDB();
	}
	
	@Test
	public void printRecordsFromDB_Salarytest() throws SQLException
	{
		EmployeeService servicTest = new EmployeeService();
		servicTest.printRecordsFromDBofSalary();
	}
	
	@Test
	public void insertRecordsFromDB_Salarytest() throws SQLException, ClassNotFoundException, IOException
	{
		EmployeeService servicTest = new EmployeeService();
		servicTest.insertrecords();
	}

}
