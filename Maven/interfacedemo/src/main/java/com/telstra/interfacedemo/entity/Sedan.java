package com.telstra.interfacedemo.entity;

public class Sedan implements Car{
	public void accelerate() {
		System.out.println("Sedan is accelerating with Cruise Control");
	}
	
	public void applyBrake() {
		System.out.println("Sedan is applying Disc Brakes with Single ABS");
	}
	
	public void changeGears() {
		System.out.println("Sedan is changing gears");
	}
	
	public void steer() {
		System.out.println("Sedan is steering with Electronic Stability");
	}
}
