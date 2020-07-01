package stepdefinitions;

import base.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDef extends Base {
	
	 @Given("^User is on Hotel page$")
	    public void user_is_on_hotel_page() throws Throwable {
		 Base.initialize();
	    }

	    @When("^Use click on Login$")
	    public void use_click_on_login() throws Throwable {
	    	
	    }

	    @Then("^User should see Login page$")
	    public void user_should_see_login_page() throws Throwable {
	    }
}
