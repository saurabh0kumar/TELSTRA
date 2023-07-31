package com.telstra.employeecodingassignment.driver;

import com.telstra.employeecodingassignment.entity.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WorkingEmp {
	
	private static Logger logger = (Logger) LoggerFactory.getLogger(WorkingEmp.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee man1 = new Manager(100059,"Rahul","Senior Manager",23,8,"Development");
		man1.doWork();
		
		System.out.println();
		
		Employee man2 = new Manager(100067,"Prem","Junior Manager",16,5,"Cybersecurity");
		man2.doWork();
		
		System.out.println();
		
		Employee se1 = new SoftwareEngineer(120023,"Khushagra","Senior Developer",20,new String[]{"Java","Python","React","Node"},"Development");
		se1.doWork();
		
		System.out.println();
		
		Employee se2 = new SoftwareEngineer(120029,"Om","Junior Developer",15,new String[] {"C++","Python","ML","Cloud"},"Cybersecurity");
		se2.doWork();
		
		System.out.println();
		
		Employee st1 = new SoftwareTester(156080,"Saurabh","Senior Test Engineer",12,new String[]{"Appium","Selenium","Cucumber","SoapUI"},"Automation");
		st1.doWork();
		
		System.out.println();
		
		Employee st2 = new SoftwareTester(156087,"Malik","Senior Test Engineer",10,new String[]{"Postman","SikuliX","TestRail","Jira"},"Manual");
		st2.doWork();
	}

}
