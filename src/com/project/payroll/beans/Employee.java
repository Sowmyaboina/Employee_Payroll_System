package com.project.payroll.beans;

//Abstract class of an Employee
public abstract class Employee { 
	//Using private Access modifiers to store name and id
	private String name;
	private int id;
	
	//Constructor of an Employee to initialize name and id
	public Employee ( String name , int id ) {
		this.name = name;
		this.id = id;
	}
	
	//getter method to retrieve Employee Name
	public String getName() {
		return name;
	}
	
	//getter method to retrieve Employee id
	public int getId() {
		return id;
	}
	
	//Abstract method to calculate Employee Salary
	public abstract double calculateSalary();
	
	// Override toString method to provide a string representation of the Employee object
	@Override
	public String toString() {
		return "Employee[name = "+name+", id = "+id+", salary = "+calculateSalary()+"]";
	}
}
