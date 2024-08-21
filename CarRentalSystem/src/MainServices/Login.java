package MainServices;

import java.util.Scanner;

public class Login {
void login() {
	String id="bhumidarsha";
	String password="bd@15";
	
	Scanner s=new Scanner(System.in);
	String adminid,adminpassword;
	do {
		System.out.println("enter the user id");
		 adminid=s.next();
		
		System.out.println("enter the user password ");
		 adminpassword=s.next();
		
		if(id.equals(adminid))
		{
			System.out.println("user id is valid");
			
			if(password.equals(adminpassword))
			{
				System.out.println("password is valid");
				System.out.println("login is successful");
			}
			
			else
			{
				System.out.println("password is invalid");
			System.out.println("login unsuccessfull");
			}
		}
		else
		{
			System.out.println("user id is invalid");
		System.out.println("login is unsuccessfull");
		}
	}while(!adminid.equals(id)||!adminpassword.equals(password));
}
}