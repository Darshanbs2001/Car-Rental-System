package Models;
import java.util.ArrayList;
public class Customer {
private String name;
private Long phoneno;
private int age;
private String drivingLicenceNumber;
private long aadharCardNumber;
ArrayList<Rides> history;
public Customer(String name, int age, String drivingLicenceNumber, long aadharCardNumber,long phoneno) {
	this.phoneno=phoneno;
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
public long phoneno() {
	return phoneno;
}
}
