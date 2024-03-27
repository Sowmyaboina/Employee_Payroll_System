package com.project.payroll.beans;

import java.util.ArrayList;

//Payroll System class 
public class PayrollSystem {
	//Declaration of employeeList variable.
	//This variable holds a list of Employee objects.
	private ArrayList<Employee> employeeList;
	
	//Constructor of PayrollSystem class
	public PayrollSystem() {
		// Initialize the employeeList ArrayList.
	    // This ensures that the employeeList is ready to store Employee objects.
		employeeList = new ArrayList<>();
	}
	
	// Method to add an employee to the employeeList.
	public void addEmployee ( Employee employee) {
		employeeList.add( employee );
	}
	
	// Method to remove an employee to the employeeList using id.
	public void  removeEmployee ( int id ) {
		Employee employeeToRemove = null;
		for ( Employee employee : employeeList ) {
			if ( employee.getId() == id ) {
				employeeToRemove = employee;
				break;
			}
			
		}
		
		if ( employeeToRemove != null ) {
			employeeList.remove(employeeToRemove);
		}
  }	

	//displayEmployees method to display Employees 
  public void displayEmployees() {
  	for ( Employee employee : employeeList ) {
  		System.out.println(employee);
  	}
  }
}
