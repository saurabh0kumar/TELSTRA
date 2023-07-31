package com.telstra.employeecodingassignment.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Manager extends Employee {
	
	private static Logger logger  = (Logger) LoggerFactory.getLogger(Manager.class);
	public int teamSize;
	public String projName;
	
	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manager(int employeeID, String employeeName, String designation, int salary, int teamSize, String projName) {
		super(employeeID, employeeName, designation, salary);
		// TODO Auto-generated constructor stub
		this.teamSize = teamSize;
		this.projName = projName;
	}

	@Override
	public void dowork() {
		logger.info("Meeting scheduled by "+employeeName);
		logger.info(employeeName+" has delegated work");
		System.out.println(employeeName+" is managing a team of "+teamSize+" employees");
	}

	
	//getters and setters
	
	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	public String getProjName() {
		return projName;
	}

	public void setProjName(String projName) {
		this.projName = projName;
	}
}
