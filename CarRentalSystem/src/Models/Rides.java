package Models;
import java.util.Date;
public class Rides {	
private Date startDate;
private Date EndDate;
private String fromLocation;
private String toLocation;
private Car ca;
private Customer cu;
private int startReading;
private int endReading;
private int estimatedRideDistance;
private boolean completed=false; 
private double earned;
public Rides(Date startDate, Date endDate, String fromLocation, String toLocation, 
		Car ca,Customer cu,int startReading) {

	this.startDate = startDate;
	EndDate = endDate;
	this.fromLocation = fromLocation;
	this.toLocation = toLocation;
	this.ca=ca;
	this.cu=cu;
	
	this.startReading=startReading;
}
public Car getCar() {
	return ca;
}
public void setendReading(int reading,double price) {
	this.endReading=reading;
	this.estimatedRideDistance=this.endReading-this.startReading;
	this.earned=(this.estimatedRideDistance*price);
}
public void fine(int days) {
	this.earned=this.earned+150*days;
}
public boolean getStatus() {
	return this.completed;
}
public void setStatus() {
	this.completed=true;
}
public double getMoney() {
	return earned;
}
public Customer getCustomer() {
	return cu;
}
public Date getStartDate() {
	return startDate;
}
public Date getEndDate() {
	return EndDate;
}
public String getFromLocation() {
	return fromLocation;
}
public String getToLocation() {
	return toLocation;
}
public int getEstimatedRideDistance() {
	return estimatedRideDistance;
}
}
