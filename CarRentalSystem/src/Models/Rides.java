package Models;

import java.util.Date;

public class Rides {
	
private Date startDate;
private Date EndDate;
private String fromLocation;
private String toLocation;
private Car c;
private int estimatedRideDistance;
public Rides(Date startDate, Date endDate, String fromLocation, String toLocation, int estimatedRideDistance,Car c) {
	super();
	this.startDate = startDate;
	EndDate = endDate;
	this.fromLocation = fromLocation;
	this.toLocation = toLocation;
	this.c=c;
	this.estimatedRideDistance = estimatedRideDistance;
}
public Car getCar() {
	return c;
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
