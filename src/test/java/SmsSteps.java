package test.java;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.TestCase;

public class SmsSteps extends TestCase {
	@Given("^A search box to enter msg$")
	public void A_search_box_to_enter_msg() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
	}

	@When("^There are sms found$")
	public void There_are_sms_found() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	   // throw new PendingException();
	}

	@Then("^The list of sms appears.$")
	public void The_list_of_sms_appears() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	   // throw new PendingException();
	}
}
