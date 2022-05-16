package step.definition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.DesktopPage;
import page.objects.HomePage;
import utilities.Util;

public class DesktopsStepDef extends Base {
	HomePage homePage = new HomePage();
	DesktopPage desktopPage = new DesktopPage();

	@Given("User is on Retail website")
	public void user_is_on_retail_website() {
	HomePage.getUrl();
	logger.info("homePage");
	}

	@When("User click on Desktops tab")
	public void user_click_on_Desktops_tab() {
		homePage.clickOnDesktopTab();
		logger.info("user clicked on Desktops tab");

	}

	@And("User click on Show all desktops")
	public void user_click_On_Show_all_desktops() {
		homePage.clickOnShowAllDesktops();
		logger.info("user clicked on Show all Desktops");
	}

	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_Desktops_page() {
		List<WebElement> items = homePage.elements();
		for (WebElement element : items) {
			Assert.assertTrue(element.isDisplayed());
			logger.info(element.getAttribute("alt") + " is present in this page");
		}
		Util.takeScreenShot();
	}
}
