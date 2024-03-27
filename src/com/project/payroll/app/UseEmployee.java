package com.project.payroll.app;

import com.project.payroll.beans.FullTimeEmployee;
import com.project.payroll.beans.PartTimeEmployee;
import com.project.payroll.beans.PayrollSystem;

public class UseEmployee {

	public static void main(String[] args) {
		
		// Instantiate a PayrollSystem object
		PayrollSystem payrollSystem = new PayrollSystem();
		
		// Create instances of FullTimeEmployee and PartTimeEmployee
		FullTimeEmployee employee1 = new FullTimeEmployee( "Kiara Sharma" , 101 , 500000.00);
		FullTimeEmployee employee2 = new FullTimeEmployee( "Abhira Sharma" , 102 , 600000.00);
		PartTimeEmployee employee3 = new PartTimeEmployee( "Armaan Poddar", 103, 12 , 550.00);
		PartTimeEmployee employee4 = new PartTimeEmployee( "Kushi Gupta", 104, 8 , 400.00);
		
		// Add employees to the PayrollSystem
		payrollSystem.addEmployee(employee1);
		payrollSystem.addEmployee(employee2);
		payrollSystem.addEmployee(employee3);
		payrollSystem.addEmployee(employee4);
		System.out.println();
		
		// Display initial employee details
		System.out.println("Initial Employee Details : ");
		payrollSystem.displayEmployees();
		System.out.println();		

		// Remove an employee
		System.out.println("Removing Employee......");
		payrollSystem.removeEmployee(101);
		System.out.println();
		
		// Display remaining employee details
		System.out.println("Remaining Employee Details ......");
		payrollSystem.displayEmployees();
	}

}
