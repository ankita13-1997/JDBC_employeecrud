package com.test.mysql_Pogo;

import java.sql.Date;
import java.time.LocalDate;

public class Employe 
{
private int id;
private String name;
private String gender;
private double salary;
private String adress;
private String phone_no;
private LocalDate date_join;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String getAdress() {
	return adress;
}
public void setAdress(String adress) {
	this.adress = adress;
}
public String getPhone_no() {
	return phone_no;
}
public void setPhone_no(String phone_no) {
	this.phone_no = phone_no;
}
public LocalDate getDate_join() {
	return date_join;
}
public void setDate_join(LocalDate localDate) {
	this.date_join = localDate;
}
@Override
public String toString() {
	return "Employe [id=" + id + 
			"\n, name=" + name + 
			"\n gender=" + gender + 
			"\n salary=" + salary + 
			"\n adress=" + adress
			+ "\n phone_no=" + phone_no + 
			"\n date_join=" + date_join + "]";
}


}
