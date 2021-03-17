package com.test.mysql_Pogo;

public class Salary 

{
	
	  private int id;
	  private double basic_Pay;
	  private double deduction;
	  private double taxPay;
	  private double tax;
	  private int E_id;
	  
	  
	public int getId() 
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public double getBasic_Pay() 
	{
		return basic_Pay;
	}
	
	
	public void setBasic_Pay(double basic_Pay) 
	{
		this.basic_Pay = basic_Pay;
	}
	
	
	public double getDeduction() 
	{
		return deduction;
	}
	
	
	public void setDeduction(double deduction) 
	{
		
		this.deduction = deduction;
	}
	
	
	public double getTaxPay() 
	{
		return taxPay;
	}
	
	
	public void setTaxPay(double taxPay)
	{
		this.taxPay = taxPay;
	}
	
	
	public double getTax() 
	{
		return tax;
	}
	
	
	public void setTax(double tax) 
	{
		this.tax = tax;
	}
	
	
	public int getE_id() 
	{
		return E_id;
	}
	
	
	public void setE_id(int e_id) 
	{
		E_id = e_id;
	}

	@Override
	public String toString() {
		return "Salary [id=" + id + 
				", basic_Pay=" + basic_Pay + 
				", deduction=" + deduction + 
				", taxPay=" + taxPay+
				", tax=" + tax + ", E_id=" + E_id + "]";
	}
	
	
	
	
	

	  
	  

}
