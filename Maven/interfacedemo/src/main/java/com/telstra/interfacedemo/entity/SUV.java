package com.telstra.interfacedemo.entity;

public class SUV implements Car{
	public void accelerate() {
		System.out.println("SUV is accelerating with Drive Mode");
	}
	
	public void applyBrake() {
		System.out.println("SUV is applying Dual ABS");
	}
	
	public void changeGears() {
		System.out.println("SUV is changing gears with Automatic Transmission");
	}
	
	public void steer() {
		System.out.println("SUV is steering with Power Steering Electronic Stability");
	}
}
