package test.java;

import java.util.GregorianCalendar;

import junit.framework.TestCase;
import main.java.Ride;
import main.java.RideValidator;
import main.java.RidesList;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberSteps extends TestCase {
	
	Ride ride = new Ride();
	RidesList ridesList = new RidesList();
	String actionButton;
	RideValidator rideValidator;
	
	
	@Given("^A search box to enter source, destination, travel date and time$")
	public void A_search_box_to_enter_source_destination_travel_date_and_time() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		ride.setDestination("Velachery");
		ride.setSource("Adyar");
		
		GregorianCalendar calendar = new GregorianCalendar(2015, 8, 12, 14, 30, 0);
	    ride.setDate(calendar);
		
		
	}

	@When("^A guest traveller clicks \"([^\"]*)\"$")
	public void A_guest_traveller_clicks(String viewRidesListButton) throws Throwable {
	    // Express the Regexp above with the code you wish you had.
		
		//actionButton = viewRidesListButton;
		actionButton = "submit";
		
		//throw new PendingException();
	}

	@When("^There are rides found$")
	public void There_are_rides_found() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		
		if(actionButton.equals("submit"))
			ridesList.setRidesFound(true);
		
	}

	@Then("^The list of rides appears on the screen.$")
	public void The_list_of_rides_appears_on_the_screen() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		
		String result = ridesList.showRidesList();
		if(ridesList.getRidesFound()) {
			assertEquals(result, "Showing list of rides");
		} else {
			// TODO: Throw error?
			throw new Exception();
		}
	}

	@When("^Nothing is found$")
	public void Nothing_is_found() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		ridesList.setRidesFound(false);
		
	}

	@Then("^A message displays saying \"([^\"]*)\"$")
	public void A_message_displays_saying(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		
		
		
		rideValidator = new RideValidator(ride.getDate());
		String message = "";
		if(!rideValidator.isDateValid() || !rideValidator.isTimeValid()) {
			// show invalid date and time message.
			
		} else if(rideValidator.isDateAndTimeInPast()) {
			// show date and time must be in present message
			
		} else {
		
			String result = ridesList.showRidesList();
			if( ! ridesList.getRidesFound()) {
				assertEquals("No rides are found at this time.", result);
			} else {
				throw new Exception();
			}
		}
	}

	@When("^A guest traveller enters blank source or destination and clicks \"([^\"]*)\"$")
	public void A_guest_traveller_enters_blank_source_or_destination_and_clicks(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		ride.setDestination("");
		ride.setSource("");
		
		actionButton = "submit";  /// fix
		
	}

	@When("^A guest traveller enters past date or time and clicks \"([^\"]*)\"$")
	public void A_guest_traveller_enters_past_date_or_time_and_clicks(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		
		//ride.setDate("1/1/1900");
		//ride.setTime("1:00");
		GregorianCalendar calendar = new GregorianCalendar(1900, 1, 1, 1, 0, 0);
		ride.setDate(calendar);
		
		actionButton = "submit";  // fix
		
	}

	@When("^A guest traveller enters invalid date or time and clicks \"([^\"]*)\"$")
	public void A_guest_traveller_enters_invalid_date_or_time_and_clicks(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		
		//ride.setDate("123");
		//ride.setTime("adfsda");
		
		actionButton = "submit";  // fix
	}
	
	// test 2 sms
	
//	@Given("^A search box to enter msg$")
//	public void A_search_box_to_enter_msg() throws Throwable {
//	    // Express the Regexp above with the code you wish you had
//	    //throw new PendingException();
//	}
//
//	@When("^There are sms found$")
//	public void There_are_sms_found() throws Throwable {
//	    // Express the Regexp above with the code you wish you had
//	   // throw new PendingException();
//	}
//
//	@Then("^The list of sms appears.$")
//	public void The_list_of_sms_appears() throws Throwable {
//	    // Express the Regexp above with the code you wish you had
//	   // throw new PendingException();
//	}




}
