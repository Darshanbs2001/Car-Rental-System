package MainServices;
import Models.Customer;
import Models.Rides;
import LocalDB.CustomerDb;
import ErrorChecking.forCustormers;
import java.util.Date;
import java.util.Scanner;
public class CustomerServices {
	CustomerDb customerdb=new CustomerDb();
	forCustormers fc=new forCustormers();
public void createCustomer() {
	
	String name,drivingLicenceNumber;
	Long aadharCardNumber,phoneno;
	int age;
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the Name of the Customer");
	name=in.nextLine();
	name=fc.checkCustomerName(name);
	System.out.println("Enter the driving Licence number");
	drivingLicenceNumber=in.nextLine();
	drivingLicenceNumber=fc.checkDrivingLicenceNumber(drivingLicenceNumber);
	System.out.println("Enter the Aadhar Number");
	aadharCardNumber=in.nextLong();
	System.out.println("Enter the age");
	age=in.nextInt();
	age=fc.checkAge(age);
	System.out.println("Enter the phone no: ");
	phoneno=in.nextLong();
	phoneno=fc.checkPhoneno(phoneno);
	
	customerdb.addToCustomerDb(new Customer(name, age,drivingLicenceNumber,aadharCardNumber,phoneno));

}
public CustomerDb getCusDb() {
	return customerdb;
}
public void returnTheCar(BookingServices bs,CarServices cs) {
	Scanner in=new Scanner(System.in);
	// TODO Auto-generated method stub
    System.out.println("Entered the DL number");
    String dlnumber=in.nextLine();
    dlnumber=fc.checkDrivingLicenceNumber(dlnumber);
    System.out.println("Enter the car plate number");
    String plateNumber=in.nextLine();
    
    Rides r=bs.findValidRide(dlnumber,plateNumber);
    
    if(r!=null) {

        int numberOfDays=(new Date().getDate()-r.getEndDate().getDate());
        System.out.println(numberOfDays);
    	System.out.println("The car is valid and ready to be returned");
    	if(numberOfDays>0) {
    		System.out.println("Addition charges are levied because of the extra days");
    	    r.fine(numberOfDays);
    	}
    	System.out.println("Enter the meter reading from the car");
        int reading=in.nextInt();
        
     	r.setendReading(reading,r.getCar().getcostPerKiloMeter());
     	System.out.println("The Final Cost of the ride is: "+r.getMoney()+"Rs");
     	
     	cs.addToCarsDb(r.getCar());
 		r.setStatus();
    }
    else {
    		System.out.println("The Ride details are not correct");
    	}


    }
}



