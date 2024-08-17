package MainServices;
import java.util.Scanner;
import Models.*;

public class RentalServices {
public static void main(String args[]) {
	CarServices cas=new CarServices();
	CustomerServices cus=new CustomerServices();
	BookingServices bs=new BookingServices(cus,cas);
	
	int choice;
	
	while(true) {
		Scanner in =new Scanner(System.in);
		System.out.println("Please select from the following ");
		System.out.println("1.Add a new Car");
		System.out.println("2.Add new Customer");
		System.out.println("3.Rent a Car or book a ride");
		System.out.println("4.Return the car");
		System.out.println("5.View History of the rides of a perticular customer");
		System.out.println("6.View History of the rides of a perticular car");
		System.out.println("7.Exit");
		choice=in.nextInt();
		switch(choice) {
		
		case 1:cas.createCar();
		       break;
		case 2:cus.createCustomer();
		       break;
		case 3:bs.createAndSaveRide(cas.getCarsDb(), cus.getCusDb());
		       break;
		case 4:cus.returnTheCar(bs,cas);
		       break;
		case 5:bs.ViewHistoryOfCustomer();
		       break;
		case 7:System.exit(0);
		       break;
		default:System.out.println("invalid choice");
		}
	}
}
}
