package com.project.payroll.beans;

//PartTimeEmployee extends from Employee 
public class PartTimeEmployee extends Employee {
	
	//hoursWorked and hourlyRate specific to Employee
	private int hoursWorked;
	private double hourlyRate;
	
	//Constructor of a PartTimeEmployee to initialize name, id, hoursWorked, hourlyRate
	public PartTimeEmployee ( String name, int id, int hoursWorked, double hourlyRate ) {
		//Invoke the constructor of the superclass (Employee) to initialize name and id
		super ( name, id );
		//Assign hoursWorked and hourlyRate specific to PartTimeEmployee
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}
	
	@Override
	public double calculateSalary() {
		return hoursWorked * hourlyRate;
	}
}
