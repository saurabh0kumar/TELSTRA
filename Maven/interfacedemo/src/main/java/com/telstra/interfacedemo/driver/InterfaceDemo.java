package com.telstra.interfacedemo.driver;

import com.telstra.interfacedemo.entity.Car;
import com.telstra.interfacedemo.entity.SUV;
import com.telstra.interfacedemo.entity.Sedan;

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Sedan();
		car.accelerate();
		car.applyBrake();
		car.changeGears();
		car.steer();
		System.out.println();
		
		car = new SUV();
		car.accelerate();
		car.applyBrake();
		car.steer();
		car.changeGears();
		System.out.println();
	}

}
