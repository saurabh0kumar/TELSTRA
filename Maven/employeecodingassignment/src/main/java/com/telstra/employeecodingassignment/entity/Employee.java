package com.telstra.employeecodingassignment.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class Employee {
	public int employeeID;
	public String employeeName;
	public String designation;
	public int salary;
	
	public Employee(){
		
	}
	
	private static Logger logger = (Logger) LoggerFactory.getLogger("Employee");
	
	public Employee(int employeeID, String employeeName, String designation, int salary) {
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.designation = designation;
		this.salary = salary;
//		System.out.println("Employee "+employeeName+" is onboard");
		logger.info(this.designation +" " + this.employeeName + " is onboard");
	}
	
	
	
	//abstract class
	public abstract void dowork();
	
	
	
	//getters and setters
	
	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}
