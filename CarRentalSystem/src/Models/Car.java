package Models;

public class Car {

private String model;
private String company;
private int plateNumber;
private boolean available;
private String fuelType;
private double mileage;
public String getCompany() {
	return company;
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
public Car(String company, String model, int plateNumber, boolean available, String fuelType, double mileage) {
	
	this.company = company;
	this.model = model;
	this.plateNumber = plateNumber;
	this.available = available;
	this.fuelType = fuelType;
	this.mileage = mileage;
}


}
