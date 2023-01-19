package com.crm.qa.testcases;

import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class HomePageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	ContactsPage contactspage;
	
	
	public HomePageTest() {
		
		super();
		
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		TestUtil testUtil;
		loginPage=new LoginPage();
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	//Test Cases should be Separated--independant with each other
	//Before each Test Cases--launch the browser and login
	//@Test-execute Test Cases
	//After each Test Cases--close the Browser
	
	
	@Test(priority=1)
	public void verifyHomePageTitleTest() {
		
	String homeTitle=	homePage.verifyHomePageTitle();
	System.out.println(homeTitle);
	Assert.assertEquals(homeTitle, "CRMPRO", "Home Page Title not matched");
	
	
	}
	@Test(priority=2)
	public void verifyUsernameTest() {
		testUtil.switchToFrame();
		Assert.assertTrue(homePage.verifyCorrectUsername());
	}
	
	
	@Test(priority=3)
	public void clickOnContactsLinkTest() {
		testUtil.switchToFrame();
		homePage.clickOnContactsLink();
		
			}
	
	
	
	
	@AfterMethod
	public void teardown() {
		
		driver.quit();
		
	}
	

}
