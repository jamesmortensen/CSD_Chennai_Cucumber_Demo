package main.java;

public class RidesList {
	
	private boolean ridesFound;

	public String showRidesList() {
		String message = "";
		
		if(ridesFound) {
			message = "Showing list of rides";
		} else {
			message = "No rides are found at this time.";
		}
		
		return message;
	}

	public void setRidesFound(boolean b) {
		// TODO Auto-generated method stub
		ridesFound = b;
	}

	public boolean getRidesFound() {
		// TODO Auto-generated method stub
		return ridesFound;
	}
	
}
