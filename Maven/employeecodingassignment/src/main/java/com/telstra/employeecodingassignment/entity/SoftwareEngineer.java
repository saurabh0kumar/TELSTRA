package com.telstra.employeecodingassignment.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SoftwareEngineer extends Employee{

	private static Logger logger = (Logger) LoggerFactory.getLogger(SoftwareEngineer.class);

	public String[] skills = new String[4];
	public String teamName;
	
	public SoftwareEngineer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SoftwareEngineer(int employeeID, String employeeName, String designation, int salary, String[] skills, String teamName) {
		super(employeeID, employeeName, designation, salary);
		// TODO Auto-generated constructor stub
		this.skills = skills;
		this.teamName = teamName;
	}
	
	@Override
	public void dowork() {
		logger.info(employeeName+" is working with "+teamName+" team");
		System.out.println(employeeName+" has the following skills:\n"+skills);
	}
}
