package LocalDB;

import java.util.ArrayList;

import Models.*;

public class CarsDb {
	ArrayList<Customer> Customers=new ArrayList<Customer>();
	ArrayList<Car> cars=new ArrayList<Car>();
	public ArrayList<Car> getCarList(){
		return cars;
	}
	public void addToCarsDb(Car c) {
		cars.add(c);
	}
	public void deleteFromCarsDb(Car c) {
		cars.remove(c);
	}
	public Car findOne() {
	      return cars.removeFirst();
	}
	public boolean findPresentOrNot(Car c) {
		return cars.contains(c);
	}
	
}
