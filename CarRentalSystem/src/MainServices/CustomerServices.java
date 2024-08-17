package MainServices;
import Models.Customer;
import Models.Rides;
import LocalDB.CustomerDb;

import java.util.Date;
import java.util.Scanner;
public class CustomerServices {
	CustomerDb customerdb=new CustomerDb();
public void createCustomer() {
	
	String name,drivingLicenceNumber;
	Long aadharCardNumber,phoneno;
	int age;
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the Name of the Customer");
	name=in.nextLine();
	System.out.println("Enter the driving Licence number");
	drivingLicenceNumber=in.nextLine();
	System.out.println("Enter the Aadhar Number");
	aadharCardNumber=in.nextLong();
	System.out.println("Enter the age");
	age=in.nextInt();
	System.out.println("Enter the phone no: ");
	phoneno=in.nextLong();
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
    System.out.println("Enter the car plate number");
    String plateNumber=in.nextLine();
    
    Rides r=bs.findValidRide(dlnumber,plateNumber);
    
    int numberOfDays=0;
    if(r!=null) {
    	System.out.println("The car is valid and ready to be returned");
    	if(r.getEndDate().compareTo(new Date())>0) {
    		System.out.println("Addition charges are levied because of the extra days");
    	    
    	   System.out.println(numberOfDays);
    	   if(numberOfDays>0) {
    		   r.fine(numberOfDays);
    	   }
    	   
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



