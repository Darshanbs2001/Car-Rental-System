package ErrorChecking;

import java.util.*;

public class forCars {
		
		public String checkCompany(String company) {
			
			Scanner in =new Scanner(System.in);
			try {
		if(!company.matches("\\b[A-Za-z]{1,20}\\b")) {
			throw new Exception("the company name should be character only");
		}
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
				company=in.next();
				company=this.checkCompany(company);
			}
		return company;
		}
		public String checkModel(String model) {
			Scanner in =new Scanner(System.in);
			
			try {
			if(!model.matches("[a-zA-Z0-9@\\-&]+")) {
				throw new Exception("the model name should contain character,special character and numbers ");
			}
		}
			catch(Exception e) {
				System.out.println(e.getMessage());
				model=in.next();
				model=this.checkModel(model);
			}
			return model;
		}
		
		public String checkFuelType(String fuelType) {
			Scanner in =new Scanner(System.in);
			try {
			if(!fuelType.matches("[a-zA-Z0-9]+")) {
				throw new Exception("the fuel type contain should contain character and numbers");
			}
			}
			catch(Exception e){
				System.out.println(e.getMessage());
				fuelType=in.next();
				fuelType=this.checkFuelType(fuelType);
			}
			return fuelType;
		}
		
		public String checkPlateNumber(String plateNumber) {
			Scanner in =new Scanner(System.in);
			
			try {
			if(!plateNumber.matches("[A-Z]{2}[0-9]{2}[A-Z]{2}[0-9]{4}")) {
				throw new Exception("the plate number contain should contain character and numbers for eg: KA18AS1111");
			}
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
				plateNumber=in.next();
				plateNumber=this.checkPlateNumber(plateNumber);
			}
			return plateNumber;
		}
		
		public Long checkMeterReading(long MeterReading) {
			Scanner in =new Scanner(System.in);
			
			try {
			if(!Long.valueOf(MeterReading).toString().matches("\\d{6}")) {
				throw new Exception("The meter reading must be a 6 digit number ");
			}
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
				MeterReading=in.nextLong();
				MeterReading=this.checkMeterReading(MeterReading);
			}
			return MeterReading;
		}
		
		public double checkMileageileage(double mileage) {
			Scanner in =new Scanner(System.in);
			
			try {
			if(mileage<=10 || mileage>=21){
				throw new Exception("the mileage of the car is less then 21");
			}
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
				mileage=in.nextDouble();
				mileage=this.checkMileageileage(mileage);
			}
			return mileage;
		}
		
		public double checkCostPerKilometer(double costPerKilometer) {
			Scanner in =new Scanner(System.in);
			
			try {
			if(!(costPerKilometer>0 && costPerKilometer<500)) {
				throw new Exception("the cost per kilometer should be less then 500");
			}
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
				costPerKilometer=in.nextDouble();
				costPerKilometer=this.checkCostPerKilometer(costPerKilometer);
			}
			return costPerKilometer;
		}
		
		public boolean checkavailable(boolean available) {
			Scanner in =new Scanner(System.in);
			
			while(!available) {
				System.out.println("is the car is available or not");
				available=in.nextBoolean();
			}
			return available;
		}
	}