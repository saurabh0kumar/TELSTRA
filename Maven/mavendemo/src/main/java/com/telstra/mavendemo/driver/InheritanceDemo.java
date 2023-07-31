package com.telstra.mavendemo.driver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.telstra.mavendemo.entity.Car;
import com.telstra.mavendemo.entity.Sedan;

public class InheritanceDemo {
	
	private static Logger logger = (Logger) LoggerFactory.getLogger(LoggerDemo.class);


	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Car car = new Car();
//		logger.info("Car Object Created....\n");
//		System.out.println("Car HashCode: "+car.hashCode()+"\n");
		
		Sedan verna = new Sedan("Hyundai Verna", "Diesel", 1500, 15.6, 125.3, 450, 6);
		logger.info("Sedan Object Created...\n");
		
		System.out.println(verna+"\n");
		verna.accelerate();
		verna.applyBrakes();
		verna.changeGears();
		System.out.println("Verna HashCode: "+verna.hashCode());
	}

}
