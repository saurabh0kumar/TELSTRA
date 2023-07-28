package com.telstra.oopsBasics.driver;

import com.telstra.oopsBasics.entity.SUV;
import com.telstra.oopsBasics.entity.Sedan;

public class InheritenceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sedan verna = new Sedan("Hyundai Verna", "Diesel", 1500, 15.6, 125.3, 450, 6);
		verna.displayCarFeatures();
		
		verna.accelerate();
		verna.applyBrakes();
		verna.changeGears();
		
		SUV xuv = new SUV("Mahindra XUV", "Diesel", 2500, 9.2, 73.2, "Eco", true);
		System.out.println(xuv);
		xuv.accelerate();
		xuv.changeDriveMode("City");
		xuv.accelerate();
		xuv.swithSunRoof();
		xuv.changeDriveMode("Sports");
		xuv.accelerate();
		
		System.out.println(verna);
	}

}
