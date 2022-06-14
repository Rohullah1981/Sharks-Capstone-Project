package step.definition;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.LoginPage;

public class LoginStepDef extends Base {
	
	LoginPage loginpage = new LoginPage();
	
	
	
	@Given("User click  on MyAccount")
	public void user_click_on_my_account() {
	    loginpage.clickMyAccount();
	    logger.info("User clicked on MyAccount");
	}
	@When("User click on Login")
	public void user_click_on_login() {
	    loginpage.clickLogIn();
	    logger.info("User Clicked on Login");
	    
	}
	@When("User enter username {string} and  {string}")
	public void user_enter_username_and(String email, String password) {
	    loginpage.enterEmailinput(email);
	    logger.info("User entered username"+ email);
	    loginpage.enterPasswordInput(password);
	    logger.info("User entered password"+ password);
	}
	@When("User click on Login button")
	public void user_click_on_login_button() {
		loginpage.clickloginButton();
		logger.info("User clicked on login button");
	    
	}
	@Then("User should be logged in to MyAccount dashboard")
	public void user_should_be_logged_in_to_my_account_dashboard() {
		Assert.assertTrue(loginpage.myAccountTextIsPresent());
		logger.info("User Shoudld be in My Account Page ");
	    
	}
	
}
