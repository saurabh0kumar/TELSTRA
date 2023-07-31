package com.telstra.employeecodingassignment.driver;

import com.telstra.employeecodingassignment.entity.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WorkingEmp {
	
	private static Logger logger = (Logger) LoggerFactory.getLogger(WorkingEmp.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee man1 = new Manager(100059,"Rahul","Senior Manager",23,8,"Development");
		man1.dowork();
		
		Employee man2 = new Manager(100067,"Prem","Junior Manager",16,5,"Cybersecurity");
		man2.dowork();
		
		String[] seskills1 = {"Java","Python","React","Node"};
		Employee se1 = new SoftwareEngineer(120023,"Khushagra","Senior Developer",20,seskills1,"Development");
		se1.dowork();
		
		String[] seskills2 = {"C++","Python","ML","Cloud"};
		Employee se2 = new SoftwareEngineer(120029,"Om","Junior Developer",15,seskills2,"Cybersecurity");
		se2.dowork();
		
		String[] stskills1 = {"Appium","Selenium","Cucumber","SoapUI"};
		Employee st1 = new SoftwareTester(156080,"Saurabh","Senior Test Engineer",12,stskills1,"Automation");
		
		String[] stskills2 = {"Postman","SikuliX","TestRail","Jira"};
		Employee st2 = new SoftwareTester(156087,"Saurabh","Senior Test Engineer",10,stskills2,"Manual");
	}

}
