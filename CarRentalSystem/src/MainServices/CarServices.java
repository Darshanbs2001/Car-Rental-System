package MainServices;
import Models.Car;
import LocalDB.CarsDb;
import java.util.Scanner;
public class CarServices {
	CarsDb carsdb=new CarsDb();
public void createCar() {
	
	Scanner in =new Scanner(System.in);
	String company, model,fuelType,plateNumber;
	boolean available;
	Long MeterReading;
	double mileage ,costPerKilometer;
	System.out.println("Enter the Name of the Company of the Car");
    company=in.nextLine();
    System.out.println("Enter the model name of the car");
    model=in.nextLine();
    System.out.println("Enter the fuelType Diesel or Electric or Petrol");
    fuelType=in.nextLine();
    System.out.println("Enter the plateNumber of Car");
    plateNumber=in.nextLine();
    available=true;
    System.out.println("Enter the mileage details in kilometer per liter");
    mileage=in.nextDouble();
    System.out.println("Enter the cost you'd want to charge on the given Car per Kilometer drive");
    costPerKilometer=in.nextDouble();
    System.out.println("Enter the initial meter reading of the car");
    MeterReading =in.nextLong();
	 carsdb.addToCarsDb( new Car(company,model,plateNumber,available,fuelType,mileage,costPerKilometer,MeterReading));

}	
public void addToCarsDb(Car c) {
	carsdb.addToCarsDb(c);
}
public CarsDb getCarsDb() {
	return carsdb;
}

}
