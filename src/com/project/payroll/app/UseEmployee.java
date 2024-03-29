package com.project.payroll.app;

import com.project.payroll.beans.FullTimeEmployee;
import com.project.payroll.beans.PartTimeEmployee;
import com.project.payroll.beans.PayrollSystem;

public class UseEmployee {

	public static void main(String[] args) {
		
		// Instantiate a PayrollSystem object
		PayrollSystem payrollSystem = new PayrollSystem();
		
		// Create instances of FullTimeEmployee and PartTimeEmployee
		FullTimeEmployee employee1 = new FullTimeEmployee( "Kiara poddar" , 101 , 500000.00);
		FullTimeEmployee employee2 = new FullTimeEmployee( "Abhira Sharma" , 102 , 600000.00);
		FullTimeEmployee employee3 = new FullTimeEmployee( "Roohi Sharma" , 103 , 700000.00);
		FullTimeEmployee employee4 = new FullTimeEmployee( "Aroohi jain" , 104 , 600000.00);
		FullTimeEmployee employee5 = new FullTimeEmployee( "Karthik birla" , 105 , 800000.00);
		FullTimeEmployee employee6 = new FullTimeEmployee( "Arnav Singh" , 106 , 600000.00);
		
		PartTimeEmployee employee7 = new PartTimeEmployee( "Armaan Poddar", 107, 12 , 550.00);
		PartTimeEmployee employee8 = new PartTimeEmployee( "Kushi Gupta", 108, 8 , 400.00);
		PartTimeEmployee employee9 = new PartTimeEmployee( "Lavanya Kumar", 109, 9 , 500.00);
		PartTimeEmployee employee10 = new PartTimeEmployee( "Kaveri Karthik", 1010, 10 , 400.00);
		PartTimeEmployee employee11 = new PartTimeEmployee( "Sreenivas sri", 1011, 12 , 550.00);
		PartTimeEmployee employee12 = new PartTimeEmployee( "Mohit Singh", 1012, 8 , 400.00);
		
		// Add employees to the PayrollSystem
		payrollSystem.addEmployee(employee1);
		payrollSystem.addEmployee(employee2);
		payrollSystem.addEmployee(employee3);
		payrollSystem.addEmployee(employee4);
		payrollSystem.addEmployee(employee5);
		payrollSystem.addEmployee(employee6);
		payrollSystem.addEmployee(employee7);
		payrollSystem.addEmployee(employee8);
		payrollSystem.addEmployee(employee9);
		payrollSystem.addEmployee(employee10);
		payrollSystem.addEmployee(employee11);
		payrollSystem.addEmployee(employee12);
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
