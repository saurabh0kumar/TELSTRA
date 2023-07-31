package com.telstra.employeecodingassignment.entity;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SoftwareTester extends Employee{
	
	private static Logger logger = (Logger) LoggerFactory.getLogger("SoftwareTester");
	
	//public String[] skills = new String[5];
	public String[] skills;
	public String typeOfTester;
	public SoftwareTester() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SoftwareTester(int employeeID, String employeeName, String designation, int salary, String[] skills, String typeOfTester) {
		super(employeeID, employeeName, designation, salary);
		// TODO Auto-generated constructor stub
		this.skills = skills;
		this.typeOfTester = typeOfTester;
	}
	
	@Override
	public void dowork() {
		logger.info(employeeName + " excells at " + typeOfTester +" testing.");
		System.out.println(employeeName+" has the following skills:\n"+ Arrays.toString(skills));
	}
}
