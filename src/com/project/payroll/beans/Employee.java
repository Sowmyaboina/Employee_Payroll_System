package com.project.payroll.beans;

//Abstract class of an Employee
abstract class Employee { 
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


//FullTime Employee class extends from Employee class
class FullTimeEmployee extends Employee {
	
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

//PartTimeEmployee extends from Employee class
class PartTimeEmployee extends Employee {
	
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
	
	//overriding calculate salary from Employee class 
	@Override
	public double calculateSalary() {
		return hoursWorked * hourlyRate;
	}
}