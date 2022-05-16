package step.definition;

import core.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeStepDef extends Base {

	
	@Given("user is on Retail home Page")
	public void user_is_on_retail_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}
	@When("user click on MyAccount")
	public void user_click_on_my_account() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	@When("user click on Login option")
	public void user_click_on_login_option() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	@When("user enter userName {string}  and password {string}")
	public void user_enter_user_name_and_password(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	@When("user click on login button")
	public void user_click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	 
	}
	@Then("user should be logged into myAccount Page")
	public void user_should_be_logged_into_my_account_page() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

}