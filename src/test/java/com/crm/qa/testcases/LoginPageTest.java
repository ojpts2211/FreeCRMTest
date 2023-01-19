package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
     LoginPage loginPage;
	 HomePage homePage;
	 
     public LoginPageTest() {
    	 super();
     }
     
    @BeforeMethod
	public void setup() {
    TestBase base=new TestBase();
	 base.initialization();
	loginPage= new LoginPage();
	
	}
     
     @Test(priority=1)
     public void loginPageTitleTest() {
    	String title= loginPage.validateLoginPageTitle();
    	Assert.assertEquals(title, "Free CRM - CRM software for customer relationship management, sales, and support.");
    	System.out.println(title);
     }
	
     @Test(priority=2)
     public void CRMLogoImageTest() {
    	boolean flag= loginPage.validateCRMImage();
    	 Assert.assertTrue(flag);
     }
     
     @Test(priority=3 )
     public void loginTest() {
    	homePage= loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
     }
     
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
	
}
