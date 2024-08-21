package ErrorChecking;
import java.util.Date;
import java.util.Scanner;

public class forBooking {
public String checkDate(String date) {
	Scanner in=new Scanner(System.in);
	
	try {
	if(!date.matches("\\d{2}/\\d{2}/\\d{4}")) {
		throw new Exception("Enter the date in the form of month/date/year");
	}
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
		date=in.nextLine();
		
	}
	return date;
}
public Date checktoDate(String date,Date fd) {
	Scanner in=new Scanner(System.in);
	date=this.checkDate(date);
	Date todate=new Date(date);
	
	try {
		 	
	if(!todate.after(fd)) {
		
		throw new Exception("Please enter the date that comes after the from date");
		
		
	}
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
		date=in.nextLine();
		todate=this.checktoDate(date,fd);
	}
	return new Date(date);
}
public String checkCityName(String name) {
	Scanner in=new Scanner(System.in);
	try {
	if(!(name.length()>5&&name.length()<25)) {
		System.out.println("The name should be minimum of 5 characters and must be less than 25 characters");
		name=in.nextLine();
	}
	}catch(Exception e) {
		System.out.println(e.getMessage());
		name=in.nextLine();
		name=this.checkCityName(name);
	}
	return name;
}
}
