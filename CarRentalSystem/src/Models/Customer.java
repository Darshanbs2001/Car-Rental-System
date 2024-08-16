package Models;

public class Customer {
private String name;

private int age;
private String drivingLicenceNumber;
private long aadharCardNumber;
public Customer(String name, int age, String drivingLicenceNumber, long aadharCardNumber) {
	
	this.name = name;
	this.age = age;
	this.drivingLicenceNumber = drivingLicenceNumber;
	this.aadharCardNumber = aadharCardNumber;
}
public String getName() {
	return name;
}
public int getAge() {
	return age;
}
public String getDrivingLicenceNumber() {
	return drivingLicenceNumber;
}
public long aadharCardNumber() {
	return aadharCardNumber;
}

}
