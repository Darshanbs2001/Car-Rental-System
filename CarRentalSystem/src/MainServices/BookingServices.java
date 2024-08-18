package MainServices;

import Models.*;
import java.util.ArrayList;
import java.util.Scanner;

import LocalDB.CustomerDb;
import LocalDB.CarsDb;
import java.util.Date;
public class BookingServices {
	private CustomerServices cus;
	private CarServices cas;
    public BookingServices(CustomerServices cus,CarServices cas) {
    	this.cus=cus;
    	this.cas=cas;
    }
    ArrayList<Rides> Ledger=new ArrayList<Rides>();
	@SuppressWarnings("deprecation")
	public void createAndSaveRide(CarsDb cars,CustomerDb customers ) {
		// TODO Auto-generated method stub
		Date fd,td;
		Car ca;
		Customer cu=null;
		String from,to;
		int startReading;
		Scanner in=new Scanner(System.in);		
		System.out.println("Enter the Ride start date ");
		fd=new Date(in.nextLine());
		System.out.println("Enter the Estimate Ride completion date");
		td=new Date(in.nextLine());
		System.out.println("Enter the from city location");
		from=in.nextLine();
		System.out.println("Enter the to city location ");
		to=in.nextLine();
	  
	    
	    System.out.println("Enter the DLNumber of the customer");
	    String DLNumber=in.nextLine();
	    cu=customers.findCustomer(DLNumber);
	    if(cu==null) {
	     System.out.println("Customer Details is not found please create a new customer");
	    
	     return;
	    }
	    ca=cars.findOne();
	    startReading=ca.getMeterReading();
	    Ledger.add(new Rides(fd,td,from,to,ca,cu,startReading));
	    
	}
	public void  ViewHistoryOfCustomer() {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the DLnumber of the customer");
	       String DLnumber=in.nextLine();
	       Customer c=cus.getCusDb().findCustomer(DLnumber);
		for(Rides r:Ledger) {
			if(r.getCustomer().equals(c)) {
				System.out.println(Ledger.indexOf(r));
				System.out.println("start date: "+r.getStartDate().toString());
				System.out.println("end date: "+r.getEndDate().toString());
				System.out.println("from Location: "+r.getFromLocation());
				System.out.println("To Location: "+r.getToLocation());
				System.out.println("Car No: "+r.getCar().getPlateNumber());
				if(r.getStatus()) {
					System.out.println("Estimated meter readings : "+r.getEstimatedRideDistance());
					System.out.println("Earned: "+r.getMoney());
				}
				else {
					System.out.println("Car has not returned so please wait till the end date or else contact the customer");
				}
			}
		}
		 
	}
	public Rides findValidRide(String DlNumber,String plateNumber) {
		// TODO Auto-generated method stub
		for(Rides r:Ledger) {
			if(r.getCustomer().getDrivingLicenceNumber().equalsIgnoreCase(DlNumber)&&r.getCar().getPlateNumber().equalsIgnoreCase(plateNumber)) {
				return r;
			}
		}
		return null;
	}

}
