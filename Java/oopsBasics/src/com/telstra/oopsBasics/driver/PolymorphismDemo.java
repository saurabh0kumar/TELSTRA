package com.telstra.oopsBasics.driver;

import com.telstra.oopsBasics.entity.Car;
import com.telstra.oopsBasics.entity.SUV;
import com.telstra.oopsBasics.entity.Sedan;

public class PolymorphismDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car("My Car","Petrol",1198.6,23.2,96.3);
		System.out.println(car.getClass());
		car.accelerate();
		
		Sedan sedan = new Sedan("Sedan Car","Diesel",1500,15.6,125.3,450,6);
		System.out.println(sedan.getClass());
		sedan.accelerate();
		
		SUV suv = new SUV("My SUV","Diesel",2200,9.5,145.6,"Sports",true);
		System.out.println(suv.getClass());
		suv.accelerate();
		
		System.out.println();
		//same reference type Car but object of Sedan
		Car car2 = new Sedan("Another Sedan Car","Diesel",1500,15.6,125.3,450,6);
		System.out.println(car2.getClass());
		car2.accelerate();
		
		//same reference type Car but object of SUV
		Car car3 = new SUV("Another SUV","Diesel",2200,9.5,145.6,"Sports",true);
		System.out.println(car3.getClass());
		car3.accelerate();
		
		System.out.println();
		//Plymorphism same name performing differently
		car = new Sedan("Another Sedan Car 2","Diesel",1500,15.6,125.3,450,6);
		car.accelerate();
		
		for (int i=0;i<5;i++){
			car = new SUV("Another SUV 2","Diesel",2200,9.5,145.6,"Sports",true);
		}
		car.accelerate();
		//SUV specific methods cannot be accessed
		
		System.gc();
	}

}
