package Activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Plane {
	
		private List<String> Passengers;
		private int maxPassengers;
		private Date lastTimeTookOf;
		private Date lastTimelanded;
		
		public Plane(int maxPassengers) {
			this.maxPassengers = maxPassengers;
			this.Passengers = new ArrayList<> ();
			
	}
    public void onboard(String Passenger) {
    	this.Passengers.add(Passenger);
    }
    public Date takeOff() {
    	this.lastTimeTookOf = new Date();
    	return lastTimeTookOf;
    }
    public void land() {
    	this.lastTimelanded = new Date();
    	this.Passengers.clear();
    }
    public Date getLastTimeLanded() {
    	return lastTimelanded;
    }
    public List<String> getPassengers(){
    	return Passengers;
    }
    
}
