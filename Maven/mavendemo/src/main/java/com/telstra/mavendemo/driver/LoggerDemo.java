package com.telstra.mavendemo.driver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerDemo {
	
	private static Logger logger = (Logger) LoggerFactory.getLogger("LoggerDemo");
	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		logger.info("First Log");
		logger.info("Second Log");
		logger.debug("Debugging application");
		
		int a=10, b=0;
		if(b==0) {
			logger.error("Can't divide by Zero");
		}
		else {
			System.out.println(a/b);
		}
	}

}
