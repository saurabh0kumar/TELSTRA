package com.telstra.oopsBasics.entity;

public class Car {
	private String carName;
	private String fuelType;
	private double engineCapacity;
	private double mileage;
	private double power;
	
	
	
	public Car() {
		
	}

	public Car(String carName, String fuelType, double engineCapacity, double mileage, double power) {
		super();
		this.carName = carName;
		this.fuelType = fuelType;
		this.engineCapacity = engineCapacity;
		this.mileage = mileage;
		this.power = power;
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("In Finalize block of Car");
	}
	
	//getters and setters
	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public double getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(double engineCapacity) {
		this.engineCapacity = engineCapacity;
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	public double getPower() {
		return power;
	}

	public void setPower(double power) {
		this.power = power;
	}

	public static String getBsStage() {
		return bsStage;
	}

	public static void setBsStage(String bsStage) {
		Car.bsStage = bsStage;
	}
	
	//car methods
	public void accelerate() {
		System.out.println(carName+" Car is accelerating....");
	}
	
	public void applyBrakes() {
		System.out.println(carName+" Car is slowing/stopping....");
	}
	
	public void changeGears() {
		System.out.println("Shifting the Gears for Car "+carName);
	}
	
	public void steer() {
		System.out.println("Changing the directions for Car "+carName);
	}
	
	public void displayCarFeatures() {
		System.out.println("Car Name: "+carName);
		System.out.println("Fuel Type: "+fuelType);
		System.out.println("Engine Capacity: "+engineCapacity+" cc");
		System.out.println("Mileage: "+mileage+" kmpl");
		System.out.println("Power: "+power+" BHP");
	}
	
	public static String bsStage="BS6";
	
	public static void someMethod() {
		System.out.println("Inside static method of Car");
	}

	@Override
	public String toString() {
		return "Car [carName=" + carName + ", fuelType=" + fuelType + ", engineCapacity=" + engineCapacity
				+ ", mileage=" + mileage + ", power=" + power + ", getCarName()=" + getCarName() + ", getFuelType()="
				+ getFuelType() + ", getEngineCapacity()=" + getEngineCapacity() + ", getMileage()=" + getMileage()
				+ ", getPower()=" + getPower() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}
