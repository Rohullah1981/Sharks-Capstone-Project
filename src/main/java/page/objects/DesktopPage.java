package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class DesktopPage extends Base {
	
	public DesktopPage() {
		PageFactory.initElements( driver,this);
	}
	
	@FindBy(xpath = "//*[@id='input-quantity']")
	private WebElement quantity;
	
	
	public void selectQuantity(String qt) {
		quantity.clear();
		quantity.sendKeys(qt);
	}

}
