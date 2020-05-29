package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page.Login_Page;
import util.BrowserFactory;

public class Login_Test {
	
	WebDriver driver;
	@Test
	public void UserWillBeAbleToLoginThepage()                            {
		driver=BrowserFactory.browser();
		
		Login_Page loginpage=PageFactory.initElements(driver, Login_Page.class);
		
		loginpage.login();
		
		driver.close();
		
		driver.quit();
	}

}
