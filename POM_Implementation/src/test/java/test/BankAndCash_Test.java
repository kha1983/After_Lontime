package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import page.BankCash_Page;
import page.Dashboard_Page;
import page.Login_Page;
import util.BrowserFactory;

public class BankAndCash_Test {
	
	@Test
	
	public void UserShouldAbleToAddNewAccount()  throws Exception   {
		
		WebDriver driver=BrowserFactory.browser();
		
		//Work for LoginPage
		Login_Page loginpage=PageFactory.initElements(driver, Login_Page.class);
		
		loginpage.login();
		
		//Validation of LoginPage
		
		String expectedtitle="Dashboard- TechFios Test Application - Billing";
		
		String actualTitle=loginpage.getPageTitle();
		
		Assert.assertEquals(actualTitle, expectedtitle);
		
		//Work for DashboardPage
		Dashboard_Page dashboard=PageFactory.initElements(driver, Dashboard_Page.class);
		
		//Validation and use of explicit wait
		dashboard.dashboardpage();
		
		//Work for ContactPage
		BankCash_Page NewAccountpage=PageFactory.initElements(driver, BankCash_Page.class);
		
		NewAccountpage.NewAccountPage();
		Thread.sleep(5000);
		
		driver.close();
		
		driver.quit();
	}

}
