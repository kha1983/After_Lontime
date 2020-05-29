package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Login_Page {
	 WebDriver driver;
	public  Login_Page(WebDriver driver)                    {
		this.driver=driver;
		}
	//Find the element
	@FindBy(how=How.ID, using="username")
	WebElement Username_Field;
	
	@FindBy(how=How.ID, using="password")
	WebElement Password_Field;
	
	@FindBy(how=How.NAME, using="login")
	WebElement Login_Field;
	
	
	
	//Method to interact with method
	public void login()           {
		Username_Field.sendKeys("techfiosdemo@gmail.com");
		Password_Field.sendKeys("abc123");
		Login_Field.click();
		
		
	}
	public String getPageTitle()    {
		return driver.getTitle();
	}
	
	

}
