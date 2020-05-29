package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BankCash_Page {
	
	WebDriver driver;

	public BankCash_Page(WebDriver driver) {
		this.driver = driver;
	}

	// Find out the element
	@FindBy(how = How.ID, using = "account")
	WebElement Account_Field;

	@FindBy(how = How.LINK_TEXT, using = "description")
	WebElement Description_Field;
	
	@FindBy(how = How.LINK_TEXT, using = "balance")
	WebElement Balance_Field;

	// Method to interact with element
	public void NewAccountPage() {
		Account_Field.sendKeys("Techfios Class");
		Description_Field.sendKeys("Corona Time and stay safe");
		Balance_Field.sendKeys("5000");
		
	}

}
