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
	
}
