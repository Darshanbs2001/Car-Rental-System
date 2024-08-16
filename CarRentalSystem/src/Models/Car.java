package Models;

public class Car {

private String model;
private String company;
private int plateNumber;
private boolean available;
private String fuelType;
private double mileage;
private double costPerKiloMeter;
public String getCompany() {
	return company;
}
public double costPerKiloMeter() {
	return this.costPerKiloMeter;
}
public String getModel() {
	return model;
}
public int getPlateNumber() {
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
public Car(String company, String model, int plateNumber, boolean available, String fuelType, 
		double mileage,double costPerKiloMeter) {
	
	this.company = company;
	this.model = model;
	this.plateNumber = plateNumber;
	this.available = available;
	this.fuelType = fuelType;
	this.mileage = mileage;
	this.costPerKiloMeter=costPerKiloMeter;
}


}
