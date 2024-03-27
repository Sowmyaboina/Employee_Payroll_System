package com.project.payroll.beans;

//FullTime Employee class extends from Employee class
public class FullTimeEmployee extends Employee {
	
	//Monthly salary specific to Full Time Employee
	private double monthlySalary;
	
	//Constructor of an Full Time Employee to initialize name , id , Salary
	public FullTimeEmployee ( String name , int id , double monthlySalary  ) {
		//Invoke the constructor of the superclass (Employee) to initialize name and id
		super ( name, id );
		//Assign the monthly salary specific to FullTimeEmployee
		this.monthlySalary = monthlySalary;
	}
	
	//overriding calculate salary from Employee class 
	@Override
	public double calculateSalary() {
		return monthlySalary;
	}
}