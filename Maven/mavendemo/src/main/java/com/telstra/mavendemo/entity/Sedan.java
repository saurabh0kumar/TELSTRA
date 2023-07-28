package com.telstra.mavendemo.entity;

public class Sedan extends Car{
	
	private int bootSpace;
	private int airBags;
	
	public Sedan() {
		super();
	}

	public Sedan(String carName, String fuelType, double engineCapacity, double mileage, double power, int bootSpace, int airBags) {
		super(carName, fuelType, engineCapacity, mileage, power);  //super class constructor
		this.bootSpace = bootSpace;
		this.airBags = airBags;
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("In Finalize block of Sedan");
	}
	
	//method overriding
	public void displayCarFeatures() {
		
		super.displayCarFeatures();
		System.out.println("Boot Space: "+bootSpace+" Litres");
		System.out.println("No. of Airbags: "+airBags);
		
	}
	
	//getter and setter
	public int getBootSpace() {
		return bootSpace;
	}

	public void setBootSpace(int bootSpace) {
		this.bootSpace = bootSpace;
	}

	public int getAirBags() {
		return airBags;
	}

	public void setAirBags(int airBags) {
		this.airBags = airBags;
	}

	@Override
	public String toString() {
		return "Sedan [bootSpace=" + bootSpace + ", airBags=" + airBags + ", getBootSpace()=" + getBootSpace()
				+ ", getAirBags()=" + getAirBags() + ", getCarName()=" + getCarName() + ", getFuelType()="
				+ getFuelType() + ", getEngineCapacity()=" + getEngineCapacity() + ", getMileage()=" + getMileage()
				+ ", getPower()=" + getPower() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
	
}
