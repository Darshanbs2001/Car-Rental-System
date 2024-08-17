package Models;

public class Car {

private String model;
private String company;
private String plateNumber;
private boolean available;
private String fuelType;
private double mileage;
private int MeterReading;
private double costPerKiloMeter;
public String getCompany() {
	return company;
}
public double getcostPerKiloMeter() {
	return this.costPerKiloMeter;
}
public int getMeterReading() {
	return this.MeterReading;
}
public String getModel() {
	return model;
}
public String getPlateNumber() {
	return plateNumber;
}
public boolean isAvailable() {
	return available;
}
public String getFuelType() {
	return fuelType;
}
public double getMileage() {
	return mileage;
}
public Car getCar() {
	return this;
}

public Car(String company, String model, String plateNumber, boolean available, String fuelType, 
		double mileage,double costPerKiloMeter,Long MeterReading) {
	
	this.company = company;
	this.model = model;
	this.plateNumber = plateNumber;
	this.available = available;
	this.fuelType = fuelType;
	this.mileage = mileage;
	this.costPerKiloMeter=costPerKiloMeter;
}


}
