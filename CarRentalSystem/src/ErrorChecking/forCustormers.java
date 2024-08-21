package ErrorChecking;
import java.util.*;
public class forCustormers {
public long checkPhoneno(long phoneno) {
	Scanner in=new Scanner(System.in);
	try {
	if((!Long.valueOf(phoneno).toString().matches("\\d{10}"))) {
		throw new Exception("The phone no must contain only numbers and must be 10 digit long");
	}
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
		phoneno=in.nextLong();
		phoneno=this.checkPhoneno(phoneno);
	}
	return phoneno;
}
public String checkDrivingLicenceNumber(String dlnumber) {
	Scanner in=new Scanner(System.in);
	try {
	if(!dlnumber.matches("[A-Z]{2}\\d{13}")) {
		throw new Exception("Driving licence should be like eg:KA1234567892233");
		
	}
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
		dlnumber=in.nextLine();
		dlnumber=this.checkDrivingLicenceNumber(dlnumber);
	}
	return dlnumber;
	
}
public String checkCustomerName(String name) {
	Scanner in=new Scanner(System.in);
	try {
	if(!(name.matches("^[A-Za-z]+ [A-Za-z] [A-Za-z]$")&&name.length()<25)) {
		throw new Exception("Enter the valid name");
	}
	return name;
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
		name=in.nextLine();
		name=this.checkCustomerName(name);
	}
	return name;
}
public int checkAge(int age) {
	Scanner in=new Scanner(System.in);
	try {
	
	if(age<18) {
		throw new Exception("The age must be greater than 18");
	
	}
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
		age=in.nextInt();
		age=this.checkAge(age);
		}
	return age;
}
public double checkaadharCardNumber(double aadharCardNumber) {
	Scanner in =new Scanner(System.in);
	
	try {
		if(!Double.valueOf(aadharCardNumber).toString().matches("\\b\\d{12}\\b")){
		throw new Exception("aadhar number should contain 12 digits");
	}
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
		aadharCardNumber=in.nextDouble();
		aadharCardNumber=this.checkaadharCardNumber(aadharCardNumber);
	}
	return aadharCardNumber;
}
}
