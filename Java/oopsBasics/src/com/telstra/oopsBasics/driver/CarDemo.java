package com.telstra.oopsBasics.driver;

import com.telstra.oopsBasics.entity.Car;

public class CarDemo {
	
	public static void main(String[] args) {
		
		Car.someMethod();
		
		Car.bsStage="BS7";
		
		Car swift = new Car("Suzuki Swift", "Petrol", 1198.6, 23.2, 96.3);
		
		System.out.println("Swift "+swift.bsStage);
		swift.bsStage="BS8";
		
		swift.accelerate();
		swift.changeGears();
		swift.steer();
		swift.applyBrakes();
		System.out.println("Swift Hashcode: "+ swift.hashCode());
		swift.someMethod();
		System.out.println();
		
		Car nexon = new Car("Tata Nexon", "Diesel", 1496.8, 17.6, 125.6);
		
		System.out.println("Nexon: "+nexon.bsStage);
		
		nexon.accelerate();
		nexon.applyBrakes();
		nexon.changeGears();
		nexon.steer();
		System.out.println("Nexon Hashcode: "+ nexon.hashCode());
		System.out.println();
		
		System.out.println("Car BS: "+Car.bsStage);
		
		Car car = nexon;		//reference variable to nexon
		car.accelerate();
		car.applyBrakes();
		System.out.println("Car Hashcode: "+ car.hashCode());
		
		nexon.setFuelType("Power Diesel");
		nexon.setMileage(nexon.getMileage()*1.5);
		System.out.println("---------------\nAfter Modificaions");
		nexon.displayCarFeatures();
	}
	
	
}
