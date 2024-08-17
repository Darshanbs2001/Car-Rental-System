package MainServices;
import Models.Customer;
import LocalDB.CustomerDb;
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


}
