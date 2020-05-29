package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Dashboard_Page {

	WebDriver driver;

	public Dashboard_Page(WebDriver driver) {
		this.driver = driver;
	}

	// Find out the element
	@FindBy(how = How.LINK_TEXT, using = "Bank & Cash")
	WebElement Bank_Cash;

	@FindBy(how = How.LINK_TEXT, using = "New Account")
	WebElement NewContact;

	// Method to interact with element
	public void dashboardpage() {
		Bank_Cash.click();
		NewContact.click();

	}

}
