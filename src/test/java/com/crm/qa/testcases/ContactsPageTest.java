package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class ContactsPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	ContactsPage contactsPage;
	TestUtil testUtil;
	
	public ContactsPageTest() {
		super();
	}
	
	
	@BeforeMethod
	public void setup() {
		
	    	initialization();
	    	testUtil=new TestUtil();
	    	loginPage=new LoginPage();
	    	contactsPage=new ContactsPage();
	    	loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	    	loginPage.validateLoginPageTitle();
			testUtil.switchToFrame();
		    contactsPage= homePage.clickOnContactsLink();
		   
	}
	
	@Test(priority=1)
	public void verifyContactsLabelTest() {
	
		Assert.assertTrue(contactsPage.verifyContactsLabel(),"Contact Name label is missing on the page");
				
	}
	
	@Test(priority = 2)
	public void SelectContactTest() {
		
		contactsPage.selectContactsByName("Amit Kare");
		contactsPage.selectContactsByName("Abhijit Deshmukh");

	}
	
	@DataProvider
	public void getCRMTestData() {
		
		
	}
	
	@Test(priority=3)
	public void validateCreateNewContacts() {
		homePage.clickOnNewContactsLink();
		contactsPage.createNewContact("Mr.", "Chaitanya", "Anpat", "Infosys");
		}
	
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
	
	
	
	
	
	

}
