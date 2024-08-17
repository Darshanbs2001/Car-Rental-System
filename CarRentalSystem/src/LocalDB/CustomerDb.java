package LocalDB;

import Models.Customer;
import java.util.ArrayList;
public class CustomerDb {
    ArrayList<Customer> customers=new ArrayList<Customer>();
	public void addToCustomerDb(Customer c) {
		// TODO Auto-generated method stub
		customers.add(c);
		
	}
	public void deleteCustomer(Customer c) {
		customers.remove(c);
	}
	public Customer findCustomer(String DLNUmber) {
		for(Customer c:customers) {
			if(c.getDrivingLicenceNumber().equals(DLNUmber)){
				return c;
			}
		
		}
		  System.out.println("Sorry Customer not found please try another or else create a new customer");
			return null;
	}

}
