package com.telstra.mavendemo.entity;

public class SUV extends Car{

	private String driveMode;
	private boolean sunRoof;
	
	public SUV() {
		// TODO Auto-generated constructor stub
		super();
	}

	public SUV(String carName, String fuelType, double engineCapacity, double mileage, double power, String driveMode,
			boolean sunRoof) {
		super(carName, fuelType, engineCapacity, mileage, power);
		this.driveMode = driveMode;
		this.sunRoof = sunRoof;
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("In Finalize block of SUV");
	}
	
	public void displaySUVCarFeatures() {
		System.out.println();
		super.displayCarFeatures();
		System.out.println("DriveMode: "+driveMode);
		System.out.println("Sun Roof: "+sunRoof);
	}
	
	public void accelerate() {
		if(this.driveMode.equalsIgnoreCase("Eco")) {
			System.out.println(getCarName()+" Car is accelerating slowly in  "+driveMode+" Mode");
		}
		else if(this.driveMode.equalsIgnoreCase("City")) {
			System.out.println(getCarName()+" Car is accelerating Moderately in "+driveMode+" Mode");
		}
		else {
			System.out.println(getCarName()+" Car is accelerating Rapidly in "+driveMode+" Mode");
		}
	}
	
	public void changeDriveMode(String mode) {
		if (mode=="Eco") {
			super.setPower(73.2);
			driveMode="Eco";
		}
		else if (mode=="City") {
			super.setPower(92.8);
			driveMode="City";
		}
		else if(mode=="Sports") {
			super.setPower(110.3);
			driveMode="Sports";
		}
		displaySUVCarFeatures();
	}
	
	public void swithSunRoof() {
		if (sunRoof==true) {
			sunRoof=false;
		}
		else {
			sunRoof=true;
		}
		displaySUVCarFeatures();
	}

	@Override
	public String toString() {
		return "SUV [driveMode=" + driveMode + ", sunRoof=" + sunRoof + ", getCarName()=" + getCarName()
				+ ", getFuelType()=" + getFuelType() + ", getEngineCapacity()=" + getEngineCapacity()
				+ ", getMileage()=" + getMileage() + ", getPower()=" + getPower() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
